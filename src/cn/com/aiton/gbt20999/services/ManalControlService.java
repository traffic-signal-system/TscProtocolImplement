package cn.com.aiton.gbt20999.services;

import cn.com.aiton.gbt20999.domain.TscNode;

/**
 * 信号机进入手控操作类
 * @author Administrator
 *
 */
public interface ManalControlService {
/**
 * 切换到手控，锁定信号机保持当前状态
 * @param node 信号节点，主要是IP地址和端口号
 */
	  public void  switchMunual(TscNode node);
/**
 * 切换到自主控制，信号自动进行信号相位，解决锁定
 * @param node 信号节点，主要是IP地址和端口号
 */
	  public void  switchSelf(TscNode node);
/**
 * 直接切换步伐，
 * 前提是信号已经切换到手控锁定状态
 * @param node 信号节点，主要是IP地址和端口号
 * @param num 第几步
 */
	  public void  switchStepByNumber(TscNode node, int num);
/**
 * 信号机执行下一步，信号机的下一步是绿灯- 绿闪- 黄闪- 红灯,每一步是一个灯态
 * 前提是信号机已经切换到手控锁定状态
 * @param node 信号节点，主要是IP地址和端口号
 */
	  public void switchNextStep(TscNode node);
/**
 * 信号机执行一下相位，正常信号机的都在3-5个相位为一个周一，每执行一下进行入下一相位
 * 前提是信号机已经切换到手控锁定状态
 * @param node 信号节点，主要是IP地址和端口号
 */
	  public void  switchNextPhase(TscNode node);
	  /**
	   * 信号机执行到指定的相位
	   * 前提是信号机已经切换到手控锁定状态
	   * @param node 信号节点，主要是IP地址和端口号
	   * @param num 第几相位
	   */
	  public void  switchPhaseByNumber(TscNode node, int num);
	  /**
	   * 信号机执行下一方向， 方向是按北，东，南，西。顺序执行
	   * 前提是信号机已经切换到手控锁定状态
	   * @param node 信号节点，主要是IP地址和端口号
	   */
	  public void  switchNextDirec(TscNode node);
	  /**
	   * 信号机执行北方向
	   * 前提是信号机已经切换到手控锁定状态
	   * @param node 信号节点，主要是IP地址和端口号
	   */
	  public void  switchNorth(TscNode node);
	  /**
	   * 信号机执行东方向
	   * 前提是信号机已经切换到手控锁定状态
	   * @param node 信号节点，主要是IP地址和端口号
	   */
	  public void  switchEast(TscNode node);
	  /**
	   * 信号机执行南方向
	   * 前提是信号机已经切换到手控锁定状态
	   * @param node 信号节点，主要是IP地址和端口号
	   */
	  public void  switchSouth(TscNode node);
	  /**
	   * 信号机执行西方向
	   * 前提是信号机已经切换到手控锁定状态
	   * @param node 信号节点，主要是IP地址和端口号
	   */
	  public void  switchWest(TscNode node);
	  /**
	   * 信号机执行关灯
	   * 前提是信号机已经切换到手控锁定状态
	   * @param node 信号节点，主要是IP地址和端口号
	   */
	  public void  switchOffLine(TscNode node);
	  /**
	   * 信号机执行黄闪
	   * 前提是信号机已经切换到手控锁定状态
	   * @param node 信号节点，主要是IP地址和端口号
	   */
	  public void  switchFlas(TscNode node);
	  /**
	   * 信号机执行全红
	   * 前提是信号机已经切换到手控锁定状态
	   * @param node 信号节点，主要是IP地址和端口号
	   */
	  public void  switchRed(TscNode node);

}
