package cn.com.aiton.gbt20999.services;

import java.util.List;

import cn.com.aiton.gbt20999.domain.GbtLampCheck;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;

/**
 * Created by Administrator on 14-2-14.
 */
public interface LampCheckService {
    /**
     * ¹Ø±ÕµÆ¿Ø°å1µÄÂÌ³åÍ»¼ì²â
     * @param node
     * @return
     */
    public Message setLampCheckCloseOne(TscNode node);
    /**
     * ¹Ø±ÕµÆ¿Ø°å2µÄÂÌ³åÍ»¼ì²â
     * @param node
     * @return
     */
    public Message setLampCheckCloseTwo(TscNode node);
    /**
     * ¹Ø±ÕµÆ¿Ø°å3µÄÂÌ³åÍ»¼ì²â
     * @param node
     * @return
     */
    public Message setLampCheckCloseThree(TscNode node);
    /**
     * ¹Ø±ÕµÆ¿Ø°å1µÄÂÌ³åÍ»¼ì²â
     * @param node
     * @return
     */
    public Message setLampCheckCloseFour(TscNode node);
    /**
     * ¹Ø±ÕµÆ¿Ø°å1µÄÂÌ³åÍ»¼ì²â
     * @param node
     * @return
     */
    public Message setLampCheckCloseFive(TscNode node);
    /**
     * ¹Ø±ÕµÆ¿Ø°å1µÄÂÌ³åÍ»¼ì²â
     * @param node
     * @return
     */
    public Message setLampCheckCloseSix(TscNode node);
    /**
     * ¹Ø±ÕµÆ¿Ø°å1µÄÂÌ³åÍ»¼ì²â
     * @param node
     * @return
     */
    public Message setLampCheckCloseSeven(TscNode node);
    /**
     * ¹Ø±ÕµÆ¿Ø°å1µÄÂÌ³åÍ»¼ì²â
     * @param node
     * @return
     */
    public Message setLampCheckCloseEight(TscNode node);
    /**
     * ¹Ø±ÕµÆ¿Ø°å1µÄÂÌ³åÍ»¼ì²â
     * @param node
     * @return
     */
    public List<Message> setLampCheckCloseALL(TscNode node);
    /**
     * ´ò¿ªµÆ¿Ø°å1µÄÂÌ³åÍ»¼ì²â
     * @param node
     * @return
     */
    public Message setLampCheckOpenOne(TscNode node);
    /**
     * ´ò¿ªµÆ¿Ø°å1µÄÂÌ³åÍ»¼ì²â
     * @param node
     * @return
     */
    public Message setLampCheckOpenTwo(TscNode node);
    /**
     * ´ò¿ªµÆ¿Ø°å1µÄÂÌ³åÍ»¼ì²â
     * @param node
     * @return
     */
    public Message setLampCheckOpenThree(TscNode node);
    /**
     * ´ò¿ªµÆ¿Ø°å1µÄÂÌ³åÍ»¼ì²â
     * @param node
     * @return
     */
    public Message setLampCheckOpenFour(TscNode node);
    /**
     * ´ò¿ªµÆ¿Ø°å1µÄÂÌ³åÍ»¼ì²â
     * @param node
     * @return
     */
    public Message setLampCheckOpenFive(TscNode node);
    /**
     * ´ò¿ªµÆ¿Ø°å1µÄÂÌ³åÍ»¼ì²â
     * @param node
     * @return
     */
    public Message setLampCheckOpenSix(TscNode node);
    /**
     * ´ò¿ªµÆ¿Ø°å1µÄÂÌ³åÍ»¼ì²â
     * @param node
     * @return
     */
    public Message setLampCheckOpenSeven(TscNode node);
    /**
     * ´ò¿ªµÆ¿Ø°å1µÄÂÌ³åÍ»¼ì²â
     * @param node
     * @return
     */
    public Message setLampCheckOpenEight(TscNode node);
    /**
     * ´ò¿ªµÆ¿Ø°å1µÄÂÌ³åÍ»¼ì²â
     * @param node
     * @return
     */
    public List<Message> setLampCheckOpenALL(TscNode node);
    /**
     * µÃµ½µÆ¿Ø°å1µÄÂÌ³åÍ»¼ì²âÊı¾İ
     * @param node
     * @return
     */
    public List<GbtLampCheck> getLampCheck(TscNode node);
}
