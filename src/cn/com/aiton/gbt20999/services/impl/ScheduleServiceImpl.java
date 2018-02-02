package cn.com.aiton.gbt20999.services.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

import cn.com.aiton.gbt20999.domain.GbtSchedule;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.services.ScheduleService;
import cn.com.aiton.gbt20999.utils.ByteUtils;
import cn.com.aiton.gbt20999.utils.CheckGbt;
import cn.com.aiton.gbt20999.utils.GbtDefine;
import cn.com.aiton.gbt20999.utils.UdpClientSocket;


/**
 * Created by Administrator on 14-2-14.
 * 时段表服务类
 */
public class ScheduleServiceImpl implements ScheduleService{
   
    /**
     * �õ�ĳ���źŻ���ʱ�α�����
     *
     * @param node
     * @return
     */
    @Override
    public List<GbtSchedule> getSchedule(TscNode node) {
        List<GbtSchedule> gbtSchedules = new ArrayList<GbtSchedule>();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_SCHEDULE);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("����˻�Ӧ���ݣ�" + info);
            if(!CheckGbt.check(bytes, "GbtSchedule")){
                return null;
            }
            //
            byte[] objectArray = new byte[GbtDefine.SCHEDULE_EVENT_RESULT_LEN * GbtDefine.SCHEDULE_RESULT_LEN * GbtDefine.SCHEDULE_BYTE_SIZE];
            System.arraycopy(bytes,5,objectArray,0,bytes[4]*GbtDefine.SCHEDULE_BYTE_SIZE);
            byte[][] scheduleArrayResult = ByteUtils.oneArrayToTwoArray(objectArray, GbtDefine.SCHEDULE_RESULT_LEN * GbtDefine.SCHEDULE_EVENT_RESULT_LEN, GbtDefine.SCHEDULE_BYTE_SIZE);
            for(int i=0; i< GbtDefine.SCHEDULE_EVENT_RESULT_LEN * GbtDefine.SCHEDULE_RESULT_LEN ;i++){
                GbtSchedule gbtSchedule = new GbtSchedule();
                //gbtSchedule.setDeviceId(node.getId());
                gbtSchedule.setScheduleId(scheduleArrayResult[i][0]);
                gbtSchedule.setEventId(scheduleArrayResult[i][1]);
                gbtSchedule.setBeginHour(scheduleArrayResult[i][2]);
                gbtSchedule.setBeginMinute(scheduleArrayResult[i][3]);
                gbtSchedule.setControlMode(scheduleArrayResult[i][4]);
                gbtSchedule.setTimePatternId(scheduleArrayResult[i][5]);
                gbtSchedule.setAuxOut(scheduleArrayResult[i][6]);
                gbtSchedule.setSpecialOut(scheduleArrayResult[i][7]);

                gbtSchedules.add(gbtSchedule);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return gbtSchedules;
    }

    /**
     * ����ĳ���źŻ���ʱ������
     *
     * @param node
     * @param gbtSchedules
     * @return
     */
    @Override
    public Message setSchedule(TscNode node, List<GbtSchedule> gbtSchedules) {
        Message message = new Message();
        try{
            byte[] hex = ArrayUtils.add(GbtDefine.SET_SCHEDULE_RESPONSE, (byte) GbtDefine.COLLISION_RESULT_LENGTH);
            Iterator<GbtSchedule> gbtScheduleIterator = gbtSchedules.iterator();
            while(gbtScheduleIterator.hasNext()){
                GbtSchedule gbtSchedule = gbtScheduleIterator.next();
                hex = ArrayUtils.add(hex,gbtSchedule.getScheduleId());
                hex = ArrayUtils.add(hex,gbtSchedule.getEventId());
                hex = ArrayUtils.add(hex,gbtSchedule.getBeginHour());
                hex = ArrayUtils.add(hex,gbtSchedule.getBeginMinute());
                hex = ArrayUtils.add(hex,gbtSchedule.getControlMode());
                hex = ArrayUtils.add(hex,gbtSchedule.getTimePatternId());
                hex = ArrayUtils.add(hex,gbtSchedule.getAuxOut());
                hex = ArrayUtils.add(hex,gbtSchedule.getSpecialOut());
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

   
}
