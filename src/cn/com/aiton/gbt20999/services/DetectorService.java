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
     * @param node 信号机节点，主要参数为IP地址和端口号 信号机节点，主要参数为IP地址和端口号
     * @return 返回是否成功
     */
    public int getDetectorSensitivityOneBorad1_8(TscNode node);
    /**
     * �õ��������1��9-16��������
     * @param node 信号机节点，主要参数为IP地址和端口号 信号机节点，主要参数为IP地址和端口号
     * @return 返回是否成功
     */
    public int getDetectorSensitivityOneBorad9_16(TscNode node);
    /**
     * �õ��������1����Ƶ��
     * @param node 信号机节点，主要参数为IP地址和端口号 信号机节点，主要参数为IP地址和端口号
     * @return 返回是否成功
     */
    public int getDetectorOscillatorFrequency1(TscNode node);
    /**
     * �õ��������2����Ƶ��
     * @param node 信号机节点，主要参数为IP地址和端口号
     * @return 返回是否成功
     */
    public int getDetectorOscillatorFrequency2(TscNode node);

    /**
     * �õ��������2��1-8��������
     * @param node 信号机节点，主要参数为IP地址和端口号
     * @return 返回是否成功
     */
    public int getDetectorSensitivityTwoBorad1_8(TscNode node);
    /**
     * �õ��������2��9-16��������
     * @param node 信号机节点，主要参数为IP地址和端口号
     * @return 返回是否成功
     */
    public int getDetectorSensitivityTwoBorad9_16(TscNode node);

    /**
     * ���ü������Ƶ��
     * @param b 字节数组
     * @param node 信号机节点，主要参数为IP地址和端口号
     * @return 返回是否成功
     */
    public Message setOscillatorFrequency(byte[] b,TscNode node);
    /**
     * �������������ֵ��1���1-7ͨ��
     * @param bytes 字节数组数据
     * @param node 信号机节点，主要参数为IP地址和端口号
     * @return 返回是否成功
     */
    public Message setSensityvityDig1(byte[] bytes,TscNode node);
    /**
     * �������������ֵ��1���8-14ͨ��
     * @param bytes 字节数组数据
     * @param node 信号机节点，主要参数为IP地址和端口号
     * @return 返回是否成功
     */
    public Message setSensityvityDig2(byte[] bytes,TscNode node);
    /**
     * �������������ֵ��1���15-16ͨ��
     * @param bytes 字节数组数据
     * @param node 信号机节点，主要参数为IP地址和端口号
     * @return 返回是否成功
     */
    public Message setSensityvityDig3(byte[] bytes,TscNode node);
    /**
     * �������������ֵ��2���1-7ͨ��
     * @param bytes 字节数组数据
     * @param node 信号机节点，主要参数为IP地址和端口号
     * @return 返回是否成功
     */
    public Message setSensityvityDig4(byte[] bytes,TscNode node);
    /**
     * �������������ֵ��2���8-14ͨ��
     * @param bytes 字节数组数据
     * @param node 信号机节点，主要参数为IP地址和端口号
     * @return 返回是否成功
     */
    public Message setSensityvityDig5(byte[] bytes,TscNode node);

    /**
     * �������������ֵ��2���15-16ͨ��
     * @param bytes 字节数组数据
     * @param node 信号机节点，主要参数为IP地址和端口号
     * @return 返回是否成功
     */
    public Message setSensityvityDig6(byte[] bytes,TscNode node);

    /**
     * ���ݰ忨���ü�������� ��
     * @param boradNum 第几块板卡
     * @param se 字节数据
     * @param node 信号机节点，主要参数为IP地址和端口号
     * @return 返回是否成功
     */
    public Message setSensitivity(int boradNum, byte se, TscNode node);

    /**
     * �������1��� 1- 8ͨ�����÷���
     * @param bytes 字节数组数据
     * @param node 信号机节点，主要参数为IP地址和端口号
     * @return 返回是否成功
     */
    public Message setSensitivityAdv11(byte[] bytes,TscNode node);

    /**
     * �������1��� 9- 16ͨ�����÷���
     * @param bytes 字节数组数据
     * @param node 信号机节点，主要参数为IP地址和端口号
     * @return 返回是否成功
     */
    public Message setSensitivityAdv12(byte[] bytes,TscNode node);

    /**
     * ������ڶ���� 1- 8ͨ�����÷���
     * @param bytes 字节数组数据
     * @param node 信号机节点，主要参数为IP地址和端口号
     * @return 返回是否成功
     */
    public Message setSensitivityAdv21(byte[] bytes,TscNode node);

    /**
     * ������ڶ���� 9- 16ͨ�����÷���
     * @param bytes 字节数组数据
     * @param node 信号机节点，主要参数为IP地址和端口号
     * @return 返回是否成功
     */
    public Message setSensitivityAdv22(byte[] bytes,TscNode node);

    /**
     * ���ü�������� ������ϵͳ����������
     * @param bytes 字节数组数据
     * @param node 信号机节点，主要参数为IP地址和端口号
     * @return 返回是否成功
     */
    public Message setSensitivityAdv(byte[] bytes, TscNode node);

    /**
     * ���ؼ���������ȵȼ���1 ��1-8ͨ��
     * @param node 信号机节点，主要参数为IP地址和端口号
     * @return 返回是否成功
     */
    public List<Byte> setSensitivityAdv11(TscNode node);
    /**
     * ���ؼ���������ȵȼ���1 ��9-16ͨ��
     * @param node 信号机节点，主要参数为IP地址和端口号
     * @return 返回是否成功
     */
    public List<Byte> setSensitivityAdv12(TscNode node);
    /**
     * ���ؼ���������ȵȼ���2 ��1-8ͨ��
     * @param node 信号机节点，主要参数为IP地址和端口号
     * @return 返回是否成功
     */
    public List<Byte> setSensitivityAdv21(TscNode node);
    /**
     * ���ؼ���������ȵȼ���2 ��9-16ͨ��
     * @param node 信号机节点，主要参数为IP地址和端口号
     * @return 返回是否成功
     */
    public List<Byte> setSensitivityAdv22(TscNode node);

    /**
     * ȡ�����м��������������
     * @param node 信号机节点，主要参数为IP地址和端口号
     * @return 返回是否成功
     */
    public List<GbtDetector> getDetector(TscNode node);

    /**
     * �������м������������
     * @param gbtDetectors 检测器集合数据
     * @param node 节点信息，主要是IP地址和端口号
     * @return 返回是否成功
     */
    public Message setDetector(List<GbtDetector> gbtDetectors,TscNode node);
}
