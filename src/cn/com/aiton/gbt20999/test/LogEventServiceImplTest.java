package cn.com.aiton.gbt20999.test;

import static org.junit.Assert.fail;

import java.util.Date;
import java.util.List;

import org.junit.Test;

import cn.com.aiton.gbt20999.domain.GbtEventLog;
import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.services.LogEventService;
import cn.com.aiton.gbt20999.services.impl.LogEventServiceImpl;
import cn.com.aiton.gbt20999.utils.ByteUtils;

public class LogEventServiceImplTest {

	private static final int GBT20999 = 1;

	@Test
	public void testGetEventLog() {
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

//	@Test
//	public void testGetEventLogByTime() {
//		LogEventService els = new LogEventServiceImpl();
//		TscNode tn = new TscNode();
//		//注意32相位的信号机
//		tn.setIpAddress(Defines.IP);
//		tn.setPort(Defines.PORT);
//		tn.setDeviceId(Defines.ID);
//		tn.setDeviceName(Defines.IP);
//		tn.setProtocolType(Defines.GBT20999);
//		
//		List<GbtEventLog> lgel = els.getEventLogByTime(tn, new Date());
//		if(lgel.isEmpty() || lgel == null){
//			fail("Not yet implemented");
//		}
//	}
//
//	@Test
//	public void testGetEventLogByEventType() {
//		LogEventService els = new LogEventServiceImpl();
//		TscNode tn = new TscNode();
//		//注意32相位的信号机
//		tn.setIpAddress(Defines.IP);
//		tn.setPort(Defines.PORT);
//		tn.setDeviceId(Defines.ID);
//		tn.setDeviceName(Defines.IP);
//		tn.setProtocolType(Defines.GBT20999);
//		
//		List<GbtEventLog> lgel = els.getEventLogByEventType(tn, Byte.parseByte("1"));
//		if(lgel.isEmpty() || lgel == null){
//			fail("Not yet implemented");
//		}
//	}
//
//	@Test
//	public void testGetEventLogByStartTimeAndEndTime() {
//		LogEventService els = new LogEventServiceImpl();
//		TscNode tn = new TscNode();
//		//注意32相位的信号机
//		tn.setIpAddress(Defines.IP);
//		tn.setPort(Defines.PORT);
//		tn.setDeviceId(Defines.ID);
//		tn.setDeviceName(Defines.IP);
//		tn.setProtocolType(Defines.GBT20999);
//		Date sd = new Date();
//		sd.setHours(0);
//		List<GbtEventLog> lgel = els.getEventLogByStartTimeAndEndTime(tn,sd , new Date());
//		if(lgel.isEmpty() || lgel == null){
//			fail("Not yet implemented");
//		}
//	}

}
