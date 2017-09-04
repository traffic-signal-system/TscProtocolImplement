package cn.com.aiton.gbt20999.services.impl;

import cn.com.aiton.gbt20999.domain.ExtReportState;
import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.services.ExtReportStatusService;
import cn.com.aiton.gbt20999.utils.ExtReportUtils;
import cn.com.aiton.gbt20999.utils.GbtDefine;
import cn.com.aiton.gbt20999.utils.UdpClientSocket;

public class ExtReportStatusServiceImpl  implements ExtReportStatusService{
	public ExtReportState ers;
	@Override
	public void getState(final TscNode node) {
		 final UdpClientSocket u;
		try {
			u = new UdpClientSocket();
			u.send(node.getIpAddress(), node.getPort(), GbtDefine.REPORT_TSC_STATUS_CANCEL);
	         Thread.sleep(1000);
	         u.send(node.getIpAddress(), node.getPort(), GbtDefine.REPORT_TSC_STATUS);
	         Thread thread = new Thread(new Runnable() {
				
				@Override
				public void run() {
					
					try {
						byte[] bytes = u.receiveByte(node.getIpAddress(), node.getPort());
						 if(bytes.length>4){
			                 ers = ExtReportUtils.byte2ReportState(bytes);

			             }
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

		            
				}
			});
	         
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
	}

}
