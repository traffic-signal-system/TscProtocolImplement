package cn.com.aiton.gbt20999.services.impl;

import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.utils.GbtDefine;
import cn.com.aiton.gbt20999.utils.UdpClientSocket;

/**
 * 信号机进入手控操作类
 * @author Administrator
 *
 */
public class ManalControlService implements cn.com.aiton.gbt20999.services.ManalControlService {

	/**
	 * 切换到手控，锁定信号机保持当前状态
	 * @param node
	 */
    @Override
    public void switchMunual(TscNode node) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_MUNUAL);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
           // Message message= CheckGbt.check(result);
          
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    /**
     * 切换到自主控制，信号自动进行信号相位，解决锁定
     * @param node
     */
    @Override
    public void switchSelf(TscNode node) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_SELF);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
//            Message message= CheckGbt.check(result);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    /**
     * 直接切换步伐，
     * 前提是信号已经切换到手控锁定状态
     * @param node
     * @param num
     */
    @Override
    public void switchStepByNumber(TscNode node, int num) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            GbtDefine.CTRL_NEXTSTEP[3] = (byte)(num);
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_NEXTSTEP);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
//            Message message= CheckGbt.check(result);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    /**
     * 信号机执行下一步，信号机的下一步是绿灯->绿闪->黄闪->红灯,每一步是一个灯态
     * 前提是信号机已经切换到手控锁定状态
     * @param node
     */
    @Override
    public void switchNextStep(TscNode node) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_NEXTSTEP);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
//            Message message= CheckGbt.check(result);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    /**
     * 信号机执行一下相位，正常信号机的都在3-5个相位为一个周一，每执行一下进行入下一相位
     * 前提是信号机已经切换到手控锁定状态
     * @param node
     */
    @Override
    public void switchNextPhase(TscNode node) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_NEXTPHASE);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
//            Message message= CheckGbt.check(result);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

	  /**
	   * 信号机执行到指定的相位
	   * 前提是信号机已经切换到手控锁定状态
	   * @param node
	   */
    @Override
    public void switchPhaseByNumber(TscNode node, int num) {
        
        try {
            UdpClientSocket client = new UdpClientSocket();
            byte[]a=GbtDefine.CTRL_NEXTPHASE;
            a[4]=(byte)num;
            client.send(node.getIpAddress(), node.getPort(),a );
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
//            Message message= CheckGbt.check(result);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    /**
	   * 信号机执行下一方向， 方向是按北，东，南，西。顺序执行
	   * 前提是信号机已经切换到手控锁定状态
	   * @param node
	   */
    @Override
    public void switchNextDirec(TscNode node) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_NEXTDIREC);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
//            Message message= CheckGbt.check(result);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
	  /**
	   * 信号机执行北方向
	   * 前提是信号机已经切换到手控锁定状态
	   * @param node
	   */
    @Override
    public void switchNorth(TscNode node) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_NORTH);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
//            Message message= CheckGbt.check(result);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
	  /**
	   * 信号机执行东方向
	   * 前提是信号机已经切换到手控锁定状态
	   * @param node
	   */
    @Override
    public void switchEast(TscNode node) {
       
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_EAST);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
//            Message message= CheckGbt.check(result);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    /**
	   * 信号机执行南方向
	   * 前提是信号机已经切换到手控锁定状态
	   * @param node
	   */
    @Override
    public void switchSouth(TscNode node) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_SOUTH);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
//            Message message= CheckGbt.check(result);
//            return serviceResult;
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    /**
	   * 信号机执行西方向
	   * 前提是信号机已经切换到手控锁定状态
	   * @param node
	   */
    @Override
    public void switchWest(TscNode node) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_WEST);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
//            Message message= CheckGbt.check(result);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    /**
	   * 信号机执行关灯
	   * 前提是信号机已经切换到手控锁定状态
	   * @param node
	   */
    @Override
    public void switchOffLine(TscNode node) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_OFF);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
//            Message message= CheckGbt.check(result);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    /**
	   * 信号机执行黄闪
	   * 前提是信号机已经切换到手控锁定状态
	   * @param node
	   */
    @Override
    public void switchFlas(TscNode node) {
        
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_FLASH);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
//            Message message= CheckGbt.check(result);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    /**
	   * 信号机执行全红
	   * 前提是信号机已经切换到手控锁定状态
	   * @param node
	   */
    @Override
    public void switchRed(TscNode node) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_RED);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
//            Message message= CheckGbt.check(result);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
