package cn.com.aiton.gbt20999.services.impl;

import java.util.List;

import cn.com.aiton.gbt20999.domain.CountDown;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.services.CountDownService;
import cn.com.aiton.gbt20999.utils.GbtDefine;
import cn.com.aiton.gbt20999.utils.UdpClientSocket;


/**
 * 倒计时相关操作
 * Created by Administrator on 14-2-14.
 */
public class CountDownServiceImpl implements CountDownService{
	/**
	 * 取得倒计时配置信息
	 * @param node 节点信息，主要是IP地址和端口号
	 * @return 返回数据
	 */
    @Override
    public List<CountDown> getCntDownDev(TscNode node) {
        // TODO ���ӵ���ʱ����Ҫ���
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_CNTDOWNDEV);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            System.out.println("����˻�Ӧ���ݣ�" + bytes.toString());
            if(bytes == null || bytes.length ==0){
            	return null;
            }else{
            	CountDown cd = new CountDown();
//            	for()
//            	cd.setDeviceId(0);
//            	cd.setCountDownId(bytes[]);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    /**
	 * 设置倒计时配置信息
	 * @param countDowns 倒计时对象内容
	 * @param node 节点信息，主要是IP地址和端口号
	 * @return 返回数据
	 */
    @Override
    public Message setCntDownDev(List<CountDown> countDowns, TscNode node) {
        // TODO
        return null;
    }
}
