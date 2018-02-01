package cn.com.aiton.gbt20999.services.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

import cn.com.aiton.gbt20999.domain.GbtDetector;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.services.DetectorService;
import cn.com.aiton.gbt20999.utils.ByteUtils;
import cn.com.aiton.gbt20999.utils.CheckGbt;
import cn.com.aiton.gbt20999.utils.GbtDefine;
import cn.com.aiton.gbt20999.utils.UdpClientSocket;


public class DetectorServiceImpl implements DetectorService {
    public int getDetectorSensitivityOneBorad1_8(TscNode node){
        int level = 0;
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_DETECTOR_SENSITIVITY_1_1_8);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("����˻�Ӧ���ݣ�" + info);
            level = bytes[3];
        }catch (Exception ex){
            ex.printStackTrace();
        }

        return level;
    }

    /**
     * �õ��������1��9-16��������
     *
     * @param node
     * @return
     */
    @Override
    public int getDetectorSensitivityOneBorad9_16(TscNode node) {
        int level = 0;
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_DETECTOR_SENSITIVITY_1_9_16);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("����˻�Ӧ���ݣ�" + info);
            level = bytes[3];
        }catch (Exception ex){
            ex.printStackTrace();
        }

        return level;
    }

    /**
     * �õ��������1����Ƶ��
     *
     * @param node
     * @return
     */
    @Override
    public int getDetectorOscillatorFrequency1(TscNode node) {
        int level = 0;
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_DETECTOR_OSCILLATOR_FREQUENCY_2);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("����˻�Ӧ���ݣ�" + info);
            level = bytes[3];
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return level;
    }

    /**
     * �õ��������2����Ƶ��
     *
     * @param node
     * @return
     */
    @Override
    public int getDetectorOscillatorFrequency2(TscNode node) {
        int level = 0;
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_DETECTOR_OSCILLATOR_FREQUENCY_1);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("����˻�Ӧ���ݣ�" + info);
            level = bytes[3];
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return level;
    }

    /**
     * �õ��������2��1-8��������
     *
     * @param node
     * @return
     */
    @Override
    public int getDetectorSensitivityTwoBorad1_8(TscNode node) {
        int level = 0;
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_DETECTOR_SENSITIVITY_2_1_8);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
           // byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
          //  System.out.println("����˻�Ӧ���ݣ�" + info);
            level = bytes[3];
        }catch (Exception ex){
            ex.printStackTrace();
        }

        return level;
    }

    /**
     * �õ��������2��9-16��������
     *
     * @param node
     * @return
     */
    @Override
    public int getDetectorSensitivityTwoBorad9_16(TscNode node) {
        int level = 0;
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_DETECTOR_SENSITIVITY_2_9_16);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
           // byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
           // System.out.println("����˻�Ӧ���ݣ�" + info);
            level = bytes[3];
        }catch (Exception ex){
            ex.printStackTrace();
        }

        return level;
    }

    /**
     * ���ü������Ƶ��
     *
     * @param b
     * @param node
     * @return
     */
    @Override
    public Message setOscillatorFrequency(byte[] b, TscNode node) {
    	
        try{
            UdpClientSocket client = new UdpClientSocket();
            byte[] bytes = new byte[21];
            ArrayUtils.addAll(GbtDefine.SET_DETECTOR_SENSITYVITY_DIG_1_1_7, b);
            client.send(node.getIpAddress(), node.getPort(),bytes);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
            
            
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * �������������ֵ��1���1-7ͨ��
     *
     * @param bytes
     * @param node
     * @return
     */
    @Override
    public Message setSensityvityDig1(byte[] bytes, TscNode node) {
    	Message msg = new Message();
        try{
            UdpClientSocket client = new UdpClientSocket();
            byte[] byt = ArrayUtils.addAll(GbtDefine.SET_DETECTOR_SENSITYVITY_DIG_1_1_7, bytes);
            client.send(node.getIpAddress(), node.getPort(), byt);
            byte[] ba = client.receiveByte(node.getIpAddress(), node.getPort());
            
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return msg;
    }

    /**
     * �������������ֵ��1���8-14ͨ��
     *
     * @param bytes
     * @param node
     * @return
     */
    @Override
    public Message setSensityvityDig2(byte[] bytes, TscNode node) {
    	Message msg = new Message();
        try{
            UdpClientSocket client = new UdpClientSocket();
            byte[] byt = ArrayUtils.addAll(GbtDefine.SET_DETECTOR_SENSITYVITY_DIG_1_8_14, bytes);
            client.send(node.getIpAddress(), node.getPort(), byt);
            byte[] ba = client.receiveByte(node.getIpAddress(), node.getPort());
            
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return msg;
    }

    /**
     * �������������ֵ��1���13-16ͨ��
     *
     * @param bytes
     * @param node
     * @return
     */
    @Override
    public Message setSensityvityDig3(byte[] bytes, TscNode node) {
    	Message msg = new Message();
        try{
            UdpClientSocket client = new UdpClientSocket();
            byte[] byt = ArrayUtils.addAll(GbtDefine.SET_DETECTOR_SENSITYVITY_DIG_1_15_16, bytes);
            client.send(node.getIpAddress(), node.getPort(), byt);
            byte[] ba = client.receiveByte(node.getIpAddress(), node.getPort());
            
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return msg;
    }

    /**
     * �������������ֵ��2���1-7ͨ��
     *
     * @param bytes
     * @param node
     * @return
     */
    @Override
    public Message setSensityvityDig4(byte[] bytes, TscNode node) {
    	Message msg = new Message();
        try{
            UdpClientSocket client = new UdpClientSocket();
            byte[] byt = ArrayUtils.addAll(GbtDefine.SET_DETECTOR_SENSITYVITY_DIG_2_1_7, bytes);
            client.send(node.getIpAddress(), node.getPort(), byt);
            byte[] ba = client.receiveByte(node.getIpAddress(), node.getPort());
            
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return msg;
    }

    /**
     * �������������ֵ��2���8-14ͨ��
     *
     * @param bytes
     * @param node
     * @return
     */
    @Override
    public Message setSensityvityDig5(byte[] bytes, TscNode node) {
    	Message msg = new Message();
        try{
            UdpClientSocket client = new UdpClientSocket();
            byte[] byt = ArrayUtils.addAll(GbtDefine.SET_DETECTOR_SENSITYVITY_DIG_2_8_14, bytes);
            client.send(node.getIpAddress(), node.getPort(), byt);
            byte[] ba = client.receiveByte(node.getIpAddress(), node.getPort());
            
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return msg;
    }

    /**
     * �������������ֵ��2���15-16ͨ��
     *
     * @param bytes
     * @param node
     * @return
     */
    @Override
    public Message setSensityvityDig6(byte[] bytes, TscNode node) {
    	Message msg = new Message();
        try{
            UdpClientSocket client = new UdpClientSocket();
            byte[] byt = ArrayUtils.addAll(GbtDefine.SET_DETECTOR_SENSITYVITY_DIG_2_15_16, bytes);
            client.send(node.getIpAddress(), node.getPort(), byt);
            byte[] ba = client.receiveByte(node.getIpAddress(), node.getPort());
            
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return msg;
    }

    /**
     * ���ݰ忨���ü�������� ��
     *
     * @param boradNum
     * @param se
     * @param node
     * @return
     */
    @Override
    public Message setSensitivity(int boradNum, byte se, TscNode node) {
    	Message msg = new Message();
        try{
            UdpClientSocket client = new UdpClientSocket();
            
            	byte[] byt = ArrayUtils.add(GbtDefine.DETECTOR_SENSITIVITY_1_1_8, ByteUtils.intToByte(boradNum)[3]);
            
            
            client.send(node.getIpAddress(), node.getPort(), byt);
//            byte[] ba = client.receiveByte(node.getIpAddress(), node.getPort());
            
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return msg;
    }

    /**
     * �������1��� 1- 8ͨ�����÷���
     *
     * @param bytes
     * @param node
     * @return
     */
    @Override
    public Message setSensitivityAdv11(byte[] bytes, TscNode node) {
    	Message msg = new Message();
        try{
            UdpClientSocket client = new UdpClientSocket();
            
            byte[] byt = ArrayUtils.addAll(GbtDefine.DETECTOR_SENSITIVITY_1_1_8, bytes);
            client.send(node.getIpAddress(), node.getPort(), byt);
//            byte[] ba = client.receiveByte(node.getIpAddress(), node.getPort());
            
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return msg;
    }

    /**
     * �������1��� 9- 16ͨ�����÷���
     *
     * @param bytes
     * @param node
     * @return
     */
    @Override
    public Message setSensitivityAdv12(byte[] bytes, TscNode node) {
    	Message msg = new Message();
        try{
            UdpClientSocket client = new UdpClientSocket();
            
            byte[] byt = ArrayUtils.addAll(GbtDefine.DETECTOR_SENSITIVITY_1_9_16, bytes);
            client.send(node.getIpAddress(), node.getPort(), byt);
//            byte[] ba = client.receiveByte(node.getIpAddress(), node.getPort());
            
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return msg;
    }

    /**
     * ������ڶ���� 1- 8ͨ�����÷���
     *
     * @param bytes
     * @param node
     * @return
     */
    @Override
    public Message setSensitivityAdv21(byte[] bytes, TscNode node) {
    	Message msg = new Message();
        try{
            UdpClientSocket client = new UdpClientSocket();
            
            byte[] byt = ArrayUtils.addAll(GbtDefine.DETECTOR_SENSITIVITY_2_1_8, bytes);
            client.send(node.getIpAddress(), node.getPort(), byt);
//            byte[] ba = client.receiveByte(node.getIpAddress(), node.getPort());
            
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return msg;
    }

    /**
     * ������ڶ���� 9- 16ͨ�����÷���
     *
     * @param bytes
     * @param node
     * @return
     */
    @Override
    public Message setSensitivityAdv22(byte[] bytes, TscNode node) {
    	Message msg = new Message();
        try{
            UdpClientSocket client = new UdpClientSocket();
            
            byte[] byt = ArrayUtils.addAll(GbtDefine.DETECTOR_SENSITIVITY_2_9_16, bytes);
            client.send(node.getIpAddress(), node.getPort(), byt);
            byte[] ba = client.receiveByte(node.getIpAddress(), node.getPort());
            
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return msg;
    }

    /**
     * ���ü�������� ������ϵͳ����������
     *
     * @param bytes
     * @param node
     * @return
     */
    @Override
    public Message setSensitivityAdv(byte[] bytes, TscNode node) {
        return null;
    }

    /**
     * ���ؼ���������ȵȼ���1 ��1-8ͨ��
     *
     * @param node
     * @return
     */
    @Override
    public List<Byte> setSensitivityAdv11(TscNode node) {
        return null;
    }

    /**
     * ���ؼ���������ȵȼ���1 ��9-16ͨ��
     *
     * @param node
     * @return
     */
    @Override
    public List<Byte> setSensitivityAdv12(TscNode node) {
        return null;
    }

    /**
     * ���ؼ���������ȵȼ���2 ��1-8ͨ��
     *
     * @param node
     * @return
     */
    @Override
    public List<Byte> setSensitivityAdv21(TscNode node) {
        return null;
    }

    /**
     * ���ؼ���������ȵȼ���2 ��9-16ͨ��
     *
     * @param node
     * @return
     */
    @Override
    public List<Byte> setSensitivityAdv22(TscNode node) {
        return null;
    }

    /**
     * ȡ�����м��������������
     *
     * @param node
     * @return
     */
    @Override
    public List<GbtDetector> getDetector(TscNode node) {
        List<GbtDetector> gbtDetectors = new ArrayList<GbtDetector>();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_DETECTOR);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("����˻�Ӧ���ݣ�" + info);
            if(!CheckGbt.check(bytes, "GbtDetector")){
                return null;
            }
            byte[] objectArray = new byte[bytes[3] * GbtDefine.DETECTOR_BYTE_SIZE];
            System.arraycopy(bytes,4,objectArray,0,objectArray.length);
            byte[][] detectorArrayResult = ByteUtils.oneArrayToTwoArray(objectArray, GbtDefine.DETECTOR_RESULT_LEN, GbtDefine.DETECTOR_BYTE_SIZE);
            for(int i=0; i< bytes[3] ;i++){
                GbtDetector gbtDetector = new GbtDetector();
                //gbtDetector.setDeviceId(node.getId());
                gbtDetector.setDetectorId(detectorArrayResult[i][0]);
                gbtDetector.setPhaseId(detectorArrayResult[i][1]);
                gbtDetector.setDetectorType(detectorArrayResult[i][2]);
                gbtDetector.setDirec(detectorArrayResult[i][3]);
                gbtDetector.setRequestEffectTime(detectorArrayResult[i][4]);
                gbtDetector.setDetectorOption(detectorArrayResult[i][5]);
                gbtDetector.setSaturationVolume((short)((detectorArrayResult[i][6] << 8) + detectorArrayResult[i][7]));
                gbtDetector.setSaturationOccupancy(detectorArrayResult[i][8]);
                gbtDetectors.add(gbtDetector);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return gbtDetectors;
    }

    /**
     * �������м������������
     *
     * @param gbtDetectors
     * @return
     */
    @Override
    public Message setDetector(List<GbtDetector> gbtDetectors,TscNode node) {
        Message message = new Message();
        try{
            byte[] hex = ArrayUtils.add(GbtDefine.SET_DETECTOR_RESPONSE, (byte)gbtDetectors.size());
            Iterator<GbtDetector> gbtDetectorIterator = gbtDetectors.iterator();
            while(gbtDetectorIterator.hasNext()){
                GbtDetector gbtDetector = gbtDetectorIterator.next();
                byte[] saturationVolume = ByteUtils.shortToByte(gbtDetector.getSaturationVolume());
                byte[] objectArray = {gbtDetector.getDetectorId(),gbtDetector.getPhaseId(),gbtDetector.getDetectorType(),gbtDetector.getDirec(),gbtDetector.getRequestEffectTime(),gbtDetector.getDetectorOption(),saturationVolume[1],saturationVolume[0],gbtDetector.getSaturationOccupancy()};
                hex = ArrayUtils.addAll(hex,objectArray);
            }
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), hex);
//            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("����˻�Ӧ���ݣ�" + info);
//TODO   ��д�Ƿ�ɹ�����
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return message;
    }
}
