package cn.com.aiton.gbt20999.services;

import java.util.List;

import cn.com.aiton.gbt20999.domain.GbtLampCheck;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;

/**
 * 灯泡检测服务类
 * Created by Administrator on 14-2-14.
 */
public interface LampCheckService {
    /**
     * �رյƿذ�1���̳�ͻ���
     * @param node 信号机节点，主要内容为IP地址和端口号
     * @return 返回是否正确
     */
    public Message setLampCheckCloseOne(TscNode node);
    /**
     * �رյƿذ�2���̳�ͻ���
     * @param node  信号机节点，主要内容为IP地址和端口号
     * @return 返回是否正确
     */
    public Message setLampCheckCloseTwo(TscNode node);
    /**
     * �رյƿذ�3���̳�ͻ���
     * @param node  信号机节点，主要内容为IP地址和端口号
     * @return 返回是否正确
     */
    public Message setLampCheckCloseThree(TscNode node);
    /**
     * �رյƿذ�1���̳�ͻ���
     * @param node  信号机节点，主要内容为IP地址和端口号
     * @return 返回是否正确
     */
    public Message setLampCheckCloseFour(TscNode node);
    /**
     * �رյƿذ�1���̳�ͻ���
     * @param node  信号机节点，主要内容为IP地址和端口号
     * @return 返回是否正确
     */
    public Message setLampCheckCloseFive(TscNode node);
    /**
     * �رյƿذ�1���̳�ͻ���
     * @param node  信号机节点，主要内容为IP地址和端口号
     * @return 返回是否正确
     */
    public Message setLampCheckCloseSix(TscNode node);
    /**
     * �رյƿذ�1���̳�ͻ���
     * @param node  信号机节点，主要内容为IP地址和端口号
     * @return 返回是否正确
     */
    public Message setLampCheckCloseSeven(TscNode node);
    /**
     * �رյƿذ�1���̳�ͻ���
     * @param node  信号机节点，主要内容为IP地址和端口号
     * @return 返回是否正确
     */
    public Message setLampCheckCloseEight(TscNode node);
    /**
     * �رյƿذ�1���̳�ͻ���
     * @param node  信号机节点，主要内容为IP地址和端口号
     * @return 返回是否正确
     */
    public List<Message> setLampCheckCloseALL(TscNode node);
    /**
     * �򿪵ƿذ�1���̳�ͻ���
     * @param node  信号机节点，主要内容为IP地址和端口号
     * @return 返回是否正确
     */
    public Message setLampCheckOpenOne(TscNode node);
    /**
     * �򿪵ƿذ�1���̳�ͻ���
     * @param node  信号机节点，主要内容为IP地址和端口号
     * @return 返回是否正确
     */
    public Message setLampCheckOpenTwo(TscNode node);
    /**
     * �򿪵ƿذ�1���̳�ͻ���
     * @param node  信号机节点，主要内容为IP地址和端口号
     * @return 返回是否正确
     */
    public Message setLampCheckOpenThree(TscNode node);
    /**
     * �򿪵ƿذ�1���̳�ͻ���
     * @param node  信号机节点，主要内容为IP地址和端口号
     * @return 返回是否正确
     */
    public Message setLampCheckOpenFour(TscNode node);
    /**
     * �򿪵ƿذ�1���̳�ͻ���
     * @param node  信号机节点，主要内容为IP地址和端口号
     * @return 返回是否正确
     */
    public Message setLampCheckOpenFive(TscNode node);
    /**
     * �򿪵ƿذ�1���̳�ͻ���
     * @param node  信号机节点，主要内容为IP地址和端口号
     * @return 返回是否正确
     */
    public Message setLampCheckOpenSix(TscNode node);
    /**
     * �򿪵ƿذ�1���̳�ͻ���
     * @param node  信号机节点，主要内容为IP地址和端口号
     * @return  返回是否正确
     */
    public Message setLampCheckOpenSeven(TscNode node);
    /**
     * �򿪵ƿذ�1���̳�ͻ���
     * @param node  信号机节点，主要内容为IP地址和端口号
     * @return 返回是否正确
     */
    public Message setLampCheckOpenEight(TscNode node);
    /**
     * �򿪵ƿذ�1���̳�ͻ���
     * @param node  信号机节点，主要内容为IP地址和端口号
     * @return 返回是否正确
     */
    public List<Message> setLampCheckOpenALL(TscNode node);
    /**
     * �õ��ƿذ�1���̳�ͻ�������
     * @param node  信号机节点，主要内容为IP地址和端口号
     * @return 返回是否正确
     */
    public List<GbtLampCheck> getLampCheck(TscNode node);
}
