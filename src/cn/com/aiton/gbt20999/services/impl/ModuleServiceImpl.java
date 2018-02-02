package cn.com.aiton.gbt20999.services.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cn.com.aiton.gbt20999.domain.GbtModule;
import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.services.ModuleService;
import cn.com.aiton.gbt20999.utils.ByteUtils;
import cn.com.aiton.gbt20999.utils.CheckGbt;
import cn.com.aiton.gbt20999.utils.GbtDefine;
import cn.com.aiton.gbt20999.utils.UdpClientSocket;

/**
 * Created by Administrator on 14-2-14.
 * 信号机模块读取功能,由信号机插入多少块板有关,是无法进行设置.只能进行读取
 */
public class ModuleServiceImpl implements ModuleService{
    /**
     * �õ��źŻ���ģ���ź�
     *
     * @param node
     * @return
     */
    @Override
    public List<GbtModule> getModule(TscNode node) {
        List<GbtModule> gbtModules = new ArrayList<GbtModule>();
        List<byte[]> everyByteArray = new ArrayList<byte[]>();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_MODULE);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("����˻�Ӧ���ݣ�" + info);
            if(!CheckGbt.check(bytes,"Module")){
                return null;
            }
            //ȥ��Э��ͷ
            byte[] objectArray = new byte[bytes.length - 4];
            System.arraycopy(bytes,4,objectArray,0,objectArray.length);

            int count = 0;
            int modules = bytes[3];
            //һ����¼�ĳ���
            for (int i=0;i<modules;i++){
                int idcount = 1;
                int devNode = objectArray[idcount+count];
                //�����1����Ϊ��һ���ֽ� ���豸�ڵ㳤�ȡ�����������
                int company = objectArray[devNode + 1 + count +idcount];
                //�����2 = 1��devNode�����ֽڣ�+ 1��company�����ֽڣ�������������
                int model = objectArray[devNode + 2 + company + count + idcount];
                //�����3 = 1��devNode�����ֽڣ�+ 1��company�����ֽڣ�+ 1��model�����ֽڣ�������������
                int version = objectArray[devNode + 3 + model + company + count + idcount];
                int typeCount = 1;
                //��� ����4�� ����Ϊ�����ĸ��ֶε��ֽڳ������ԣ�����������������
                int all = idcount + devNode + company + model + version + typeCount + 4;
                byte[] oneSetByteArray = new byte[all];
                System.arraycopy(objectArray,count,oneSetByteArray,0,all);
                everyByteArray.add(oneSetByteArray);
                count = count + all;
            }

            Iterator it = everyByteArray.iterator();
            while(it.hasNext()){
                byte[] bar = (byte[])it.next();
                int idCount = 1;
                int devNodeCount = bar[1];
                int companyCount = bar[devNodeCount + 1 + idCount];
                int modelCount = bar[devNodeCount + 2 + companyCount + idCount];
                int versionCount = bar[devNodeCount + 3 + companyCount + modelCount + idCount];
                //ȡ�ýڵ�
                byte[] byteDevNode = new byte[devNodeCount];
                idCount += 1;
                for(int j = 0 ; j<devNodeCount ; j++){
                    byteDevNode[j] = bar[j + idCount];
                }
                String sDevNode = ByteUtils.byteArrayToStringByISO(byteDevNode);
                //ȡ�ó�������
                byte[] byteCompany = new byte[companyCount];
                devNodeCount+=1;
                for (int k=0;k<companyCount;k++){
                    byteCompany[k] = bar[idCount + devNodeCount + k];
                }
                String sCompany = ByteUtils.byteArrayToStringByISO(byteCompany);
                //ȡ��ģʽ
                byte[] byteModel = new byte[modelCount];
                companyCount += 1;
                for (int l=0;l<modelCount;l++){
                    byteModel[l] = bar[idCount + devNodeCount + companyCount + l];
                }
                String sModel = ByteUtils.byteArrayToStringByISO(byteModel);
                //ȡ�� �汾��
                byte[] byteVersion = new byte[versionCount];
                modelCount += 1;
                for (int u=0;u<versionCount;u++){
                    byteVersion[u] = bar[idCount + devNodeCount+ modelCount + companyCount + u];
                }
                String sVersion = ByteUtils.byteArrayToStringByISO(byteVersion);
                GbtModule gbtModule = new GbtModule();
                //gbtModule.setDeviceId(node.getId());
                gbtModule.setModuleId(bar[0]);
                gbtModule.setDeviceNode(sDevNode);
                gbtModule.setFactory(sCompany);
                gbtModule.setModel(sModel);
                gbtModule.setVersion(sVersion);
                gbtModule.setType(bar[idCount + devNodeCount + modelCount + companyCount + versionCount]);
                gbtModules.add(gbtModule);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return gbtModules;
    }

    /**
     * ��ǰ�źŻ������忨��״̬
     *
     * @param node
     * @return
     */
    @Override
    public byte[] getModuleState(TscNode node) {
        return new byte[0];
    }
}
