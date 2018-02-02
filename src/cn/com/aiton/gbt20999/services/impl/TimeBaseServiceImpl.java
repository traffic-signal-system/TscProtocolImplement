package cn.com.aiton.gbt20999.services.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

import cn.com.aiton.gbt20999.domain.GbtTimeBase;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.services.TimeBaseService;
import cn.com.aiton.gbt20999.utils.ByteUtils;
import cn.com.aiton.gbt20999.utils.CheckGbt;
import cn.com.aiton.gbt20999.utils.GbtDefine;
import cn.com.aiton.gbt20999.utils.UdpClientSocket;

/**
 * Created by Administrator on 14-2-14.
 * 时基服务类
 */
public class TimeBaseServiceImpl implements TimeBaseService {
    
    /**
     * ���źŻ��õ�ĳ���ڵ��ʱ������
     *
     * @param node 信号机节点信息，主要是IP地址和端口号
     * @return 返回信息
     */
    @Override
    public List<GbtTimeBase> getTimeBase(TscNode node) {
        List<GbtTimeBase> gbtTimeBases = new ArrayList<GbtTimeBase>();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_PLAN);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("����˻�Ӧ���ݣ�" + info);
            if(!CheckGbt.check(bytes, "GbtTimeBase")){
                return null;
            }
            byte[] objectArray = new byte[bytes[3] * GbtDefine.PLAN_BYTE_SIZE];
            System.arraycopy(bytes,4,objectArray,0,objectArray.length);
            byte[][] timeBaseArrayResult = ByteUtils.oneArrayToTwoArray(objectArray, GbtDefine.PLAN_RESULT_LEN, GbtDefine.PLAN_BYTE_SIZE);
            for(int i=0; i< bytes[3] ;i++){
                GbtTimeBase gbtTimeBase = new GbtTimeBase();
                //gbtTimeBase.setDeviceId(node.getId());
                gbtTimeBase.setTimeBaseId(timeBaseArrayResult[i][0]);
                byte[] flag = new byte[]{timeBaseArrayResult[i][1] ,timeBaseArrayResult[i][2]};
                gbtTimeBase.setMonth(ByteUtils.byteToShort(flag));

                gbtTimeBase.setWeek(timeBaseArrayResult[i][3]);
                byte[] dayFlag = new byte[]{timeBaseArrayResult[i][4],timeBaseArrayResult[i][5],timeBaseArrayResult[i][6],timeBaseArrayResult[i][7]};
                gbtTimeBase.setDay(ByteUtils.byteToInt(dayFlag));
                gbtTimeBase.setScheduleId(timeBaseArrayResult[i][8]);
                gbtTimeBases.add(gbtTimeBase);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return gbtTimeBases;
    }

    /**
     * ����ʱ�����ݵ��źŻ�
     * ͨ������
     *
     * @param gbtTimeBaseList 时基数据集合
     * @param node 信号机节点信息，主要是IP地址和端口号
     * @return 返回信息
     */
    @Override
    public Message setTimeBaseByCalendar(List<GbtTimeBase> gbtTimeBaseList, TscNode node) {
        Message message = new Message();
        try{
            byte[] hex = ArrayUtils.add(GbtDefine.SET_PLAN_RESPONSE, (byte) GbtDefine.PLAN_RESULT_LEN);
            Iterator<GbtTimeBase> gbtTimeBaseIterator = gbtTimeBaseList.iterator();
            while(gbtTimeBaseIterator.hasNext()){
                GbtTimeBase gbtTimeBase = gbtTimeBaseIterator.next();
                byte timeBaseId =gbtTimeBase.getTimeBaseId();
                byte[] monthFlag = ByteUtils.shortToByte(gbtTimeBase.getMonth());
                byte weekFlag = gbtTimeBase.getWeek();
                byte[] dayFlag = ByteUtils.intToByte(gbtTimeBase.getDay());
                byte scheduleId = gbtTimeBase.getScheduleId();
                hex = ArrayUtils.add(hex,timeBaseId);
                hex = ArrayUtils.addAll(hex,monthFlag);
                hex = ArrayUtils.add(hex,weekFlag);
                hex = ArrayUtils.addAll(hex,dayFlag);
                hex = ArrayUtils.add(hex,scheduleId);
                //byte[] objectArray = ArrayUtils.addAll(phaseId,flag);
                //hex = ArrayUtils.addAll(hex,objectArray);
            }
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), hex);
            String info = client.receive(node.getIpAddress(), node.getPort());
            byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            System.out.println("����˻�Ӧ���ݣ�" + info);
//TODO   ��д�Ƿ�ɹ�����
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return message;
    }

  
    /**
     * ����ʱ�����ݵ��źŻ�
     * ͨ����ģʽ
     *
     * @param gbtTimeBases 时基集合信息
     * @param node 信号机节点信息，主要是IP地址和端口号
     * @return 返回信息
     */
    @Override
    public Message setTimeBaseByWeekend(List<GbtTimeBase> gbtTimeBases, TscNode node) {
        Message message = new Message();
        try{
            byte[] hex = ArrayUtils.add(GbtDefine.SET_COLLISION_RESPONSE, (byte) GbtDefine.COLLISION_RESULT_LENGTH);
            Iterator<GbtTimeBase> gbtTimeBaseIterator = gbtTimeBases.iterator();
            while(gbtTimeBaseIterator.hasNext()){
                GbtTimeBase gbtTimeBase = gbtTimeBaseIterator.next();
                byte timeBaseId =gbtTimeBase.getTimeBaseId();
                byte[] monthFlag = ByteUtils.shortToByte(gbtTimeBase.getMonth());
                byte weekFlag = gbtTimeBase.getWeek();
                byte[] dayFlag = ByteUtils.intToByte(gbtTimeBase.getDay());
                byte scheduleId = gbtTimeBase.getScheduleId();
                hex = ArrayUtils.add(hex,timeBaseId);
                hex = ArrayUtils.addAll(hex,monthFlag);
                hex = ArrayUtils.add(hex,weekFlag);
                hex = ArrayUtils.addAll(hex,dayFlag);
                hex = ArrayUtils.add(hex,scheduleId);
                //byte[] objectArray = ArrayUtils.addAll(phaseId,flag);
                //hex = ArrayUtils.addAll(hex,objectArray);
            }
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), hex);
            String info = client.receive(node.getIpAddress(), node.getPort());
            byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            System.out.println("����˻�Ӧ���ݣ�" + info);
//TODO   ��д�Ƿ�ɹ�����
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return message;
    }

	@Override
	public Message setTimeBaseByMonth(List<GbtTimeBase> gbtTimeBases,
			TscNode node) {
		// TODO Auto-generated method stub
		return null;
	}

  
}
