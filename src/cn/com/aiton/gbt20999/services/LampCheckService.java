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
     * @param node
     * @return
     */
    public Message setLampCheckCloseOne(TscNode node);
    /**
     * �رյƿذ�2���̳�ͻ���
     * @param node
     * @return
     */
    public Message setLampCheckCloseTwo(TscNode node);
    /**
     * �رյƿذ�3���̳�ͻ���
     * @param node
     * @return
     */
    public Message setLampCheckCloseThree(TscNode node);
    /**
     * �رյƿذ�1���̳�ͻ���
     * @param node
     * @return
     */
    public Message setLampCheckCloseFour(TscNode node);
    /**
     * �رյƿذ�1���̳�ͻ���
     * @param node
     * @return
     */
    public Message setLampCheckCloseFive(TscNode node);
    /**
     * �رյƿذ�1���̳�ͻ���
     * @param node
     * @return
     */
    public Message setLampCheckCloseSix(TscNode node);
    /**
     * �رյƿذ�1���̳�ͻ���
     * @param node
     * @return
     */
    public Message setLampCheckCloseSeven(TscNode node);
    /**
     * �رյƿذ�1���̳�ͻ���
     * @param node
     * @return
     */
    public Message setLampCheckCloseEight(TscNode node);
    /**
     * �رյƿذ�1���̳�ͻ���
     * @param node
     * @return
     */
    public List<Message> setLampCheckCloseALL(TscNode node);
    /**
     * �򿪵ƿذ�1���̳�ͻ���
     * @param node
     * @return
     */
    public Message setLampCheckOpenOne(TscNode node);
    /**
     * �򿪵ƿذ�1���̳�ͻ���
     * @param node
     * @return
     */
    public Message setLampCheckOpenTwo(TscNode node);
    /**
     * �򿪵ƿذ�1���̳�ͻ���
     * @param node
     * @return
     */
    public Message setLampCheckOpenThree(TscNode node);
    /**
     * �򿪵ƿذ�1���̳�ͻ���
     * @param node
     * @return
     */
    public Message setLampCheckOpenFour(TscNode node);
    /**
     * �򿪵ƿذ�1���̳�ͻ���
     * @param node
     * @return
     */
    public Message setLampCheckOpenFive(TscNode node);
    /**
     * �򿪵ƿذ�1���̳�ͻ���
     * @param node
     * @return
     */
    public Message setLampCheckOpenSix(TscNode node);
    /**
     * �򿪵ƿذ�1���̳�ͻ���
     * @param node
     * @return
     */
    public Message setLampCheckOpenSeven(TscNode node);
    /**
     * �򿪵ƿذ�1���̳�ͻ���
     * @param node
     * @return
     */
    public Message setLampCheckOpenEight(TscNode node);
    /**
     * �򿪵ƿذ�1���̳�ͻ���
     * @param node
     * @return
     */
    public List<Message> setLampCheckOpenALL(TscNode node);
    /**
     * �õ��ƿذ�1���̳�ͻ�������
     * @param node
     * @return
     */
    public List<GbtLampCheck> getLampCheck(TscNode node);
}
