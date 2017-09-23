package cn.com.aiton.gbt20999.test;

import static org.junit.Assert.fail;

import java.util.List;

import cn.com.aiton.gbt20999.domain.GbtEventLog;
import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.services.LogEventService;
import cn.com.aiton.gbt20999.services.impl.LogEventServiceImpl;

public class EventLog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogEventService els = new LogEventServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		List<GbtEventLog> lgel = els.getEventLog(tn);
		if(lgel.isEmpty() || lgel == null){
			fail("Not yet implemented");
		}
	}

}
