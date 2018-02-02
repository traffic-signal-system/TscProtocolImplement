package cn.com.aiton.gbt20999.services;

import java.util.List;

import cn.com.aiton.gbt20999.domain.GbtStagePattern;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;

/**
 * Created by Administrator on 14-2-14.
 * 阶段配时服务类
 */
public interface StagePatternService {
    /**
     * ���źŻ���ȡ�׶���������
     * @param node
     * @return
     */
    public List<GbtStagePattern> getStagePattern16Phase(TscNode node);

    /**
     * ���źŻ���ȡ32��λ�Ľ׶���������
     * @param node
     * @return
     */
    public List<GbtStagePattern> getStagePattern32Phase(TscNode node);
    /**
     * ���׶��������ݱ��浽16��λ���źŻ���
     * @param node
     * @param gbtStagePatterns
     * @return
     */
    public Message setStagePatternBy16Phase(TscNode node,List<GbtStagePattern> gbtStagePatterns);

    /**
     * ���׶����ݱ��浽32λ�źŻ���
     * @param node
     * @param gbtStagePatterns
     * @return
     */
    public Message setStagePatternBy32Phase(TscNode node,List<GbtStagePattern> gbtStagePatterns);

    


}
