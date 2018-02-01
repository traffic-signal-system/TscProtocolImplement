package cn.com.aiton.gbt20999.services;

import java.util.List;

import cn.com.aiton.gbt20999.domain.GbtDetector;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;

/**
 * Created by Administrator on 14-2-14.
 * 信号机检测器的操作，包括设置检测器和取得检测器的相关数据
 */
public interface DetectorService {
    /**
     * �õ��������1��1-8��������
     * @param node
     * @return
     */
    public int getDetectorSensitivityOneBorad1_8(TscNode node);
    /**
     * �õ��������1��9-16��������
     * @param node
     * @return
     */
    public int getDetectorSensitivityOneBorad9_16(TscNode node);
    /**
     * �õ��������1����Ƶ��
     * @param node
     * @return
     */
    public int getDetectorOscillatorFrequency1(TscNode node);
    /**
     * �õ��������2����Ƶ��
     * @param node
     * @return
     */
    public int getDetectorOscillatorFrequency2(TscNode node);

    /**
     * �õ��������2��1-8��������
     * @param node
     * @return
     */
    public int getDetectorSensitivityTwoBorad1_8(TscNode node);
    /**
     * �õ��������2��9-16��������
     * @param node
     * @return
     */
    public int getDetectorSensitivityTwoBorad9_16(TscNode node);

    /**
     * ���ü������Ƶ��
     * @param b
     * @param node
     * @return
     */
    public Message setOscillatorFrequency(byte[] b,TscNode node);
    /**
     * �������������ֵ��1���1-7ͨ��
     * @param bytes
     * @param node
     * @return
     */
    public Message setSensityvityDig1(byte[] bytes,TscNode node);
    /**
     * �������������ֵ��1���8-14ͨ��
     * @param bytes
     * @param node
     * @return
     */
    public Message setSensityvityDig2(byte[] bytes,TscNode node);
    /**
     * �������������ֵ��1���15-16ͨ��
     * @param bytes
     * @param node
     * @return
     */
    public Message setSensityvityDig3(byte[] bytes,TscNode node);
    /**
     * �������������ֵ��2���1-7ͨ��
     * @param bytes
     * @param node
     * @return
     */
    public Message setSensityvityDig4(byte[] bytes,TscNode node);
    /**
     * �������������ֵ��2���8-14ͨ��
     * @param bytes
     * @param node
     * @return
     */
    public Message setSensityvityDig5(byte[] bytes,TscNode node);

    /**
     * �������������ֵ��2���15-16ͨ��
     * @param bytes
     * @param node
     * @return
     */
    public Message setSensityvityDig6(byte[] bytes,TscNode node);

    /**
     * ���ݰ忨���ü�������� ��
     * @param boradNum
     * @param se
     * @param node
     * @return
     */
    public Message setSensitivity(int boradNum, byte se, TscNode node);

    /**
     * �������1��� 1- 8ͨ�����÷���
     * @param bytes
     * @param node
     * @return
     */
    public Message setSensitivityAdv11(byte[] bytes,TscNode node);

    /**
     * �������1��� 9- 16ͨ�����÷���
     * @param bytes
     * @param node
     * @return
     */
    public Message setSensitivityAdv12(byte[] bytes,TscNode node);

    /**
     * ������ڶ���� 1- 8ͨ�����÷���
     * @param bytes
     * @param node
     * @return
     */
    public Message setSensitivityAdv21(byte[] bytes,TscNode node);

    /**
     * ������ڶ���� 9- 16ͨ�����÷���
     * @param bytes
     * @param node
     * @return
     */
    public Message setSensitivityAdv22(byte[] bytes,TscNode node);

    /**
     * ���ü�������� ������ϵͳ����������
     * @param bytes
     * @param node
     * @return
     */
    public Message setSensitivityAdv(byte[] bytes, TscNode node);

    /**
     * ���ؼ���������ȵȼ���1 ��1-8ͨ��
     * @param node
     * @return
     */
    public List<Byte> setSensitivityAdv11(TscNode node);
    /**
     * ���ؼ���������ȵȼ���1 ��9-16ͨ��
     * @param node
     * @return
     */
    public List<Byte> setSensitivityAdv12(TscNode node);
    /**
     * ���ؼ���������ȵȼ���2 ��1-8ͨ��
     * @param node
     * @return
     */
    public List<Byte> setSensitivityAdv21(TscNode node);
    /**
     * ���ؼ���������ȵȼ���2 ��9-16ͨ��
     * @param node
     * @return
     */
    public List<Byte> setSensitivityAdv22(TscNode node);

    /**
     * ȡ�����м��������������
     * @param node
     * @return
     */
    public List<GbtDetector> getDetector(TscNode node);

    /**
     * �������м������������
     * @param gbtDetectors
     * @return
     */
    public Message setDetector(List<GbtDetector> gbtDetectors,TscNode node);
}
