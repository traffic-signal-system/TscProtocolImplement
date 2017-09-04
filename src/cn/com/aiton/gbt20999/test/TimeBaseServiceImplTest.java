package cn.com.aiton.gbt20999.test;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import cn.com.aiton.gbt20999.domain.GbtStagePattern;
import cn.com.aiton.gbt20999.domain.GbtTimeBase;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.services.StagePatternService;
import cn.com.aiton.gbt20999.services.TimeBaseService;
import cn.com.aiton.gbt20999.services.impl.StagePatternServiceImpl;
import cn.com.aiton.gbt20999.services.impl.TimeBaseServiceImpl;
import cn.com.aiton.gbt20999.utils.GbtDefine;

public class TimeBaseServiceImplTest {

	@Test
	public void testGetTimeBase() {
		TimeBaseService ms = new TimeBaseServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		List<GbtTimeBase> lgm = ms.getTimeBase(tn);
		if(lgm.isEmpty() || lgm == null){
			fail("Not yet implemented");
		}
	}

	@Test
	public void testSetTimeBaseByCalendar() {
//		TimeBaseService ms = new TimeBaseServiceImpl();
//		TscNode tn = new TscNode();
//		//注意32相位的信号机
//		tn.setIpAddress(Defines.IP);
//		tn.setPort(Defines.PORT);
//		tn.setDeviceId(Defines.ID);
//		tn.setDeviceName(Defines.IP);
//		tn.setProtocolType(Defines.GBT20999);
//		List<GbtTimeBase> gbtTimeBaseList = new ArrayList<GbtTimeBase>();
//		Message msg = ms.setTimeBaseByCalendar(gbtTimeBaseList, tn);
//		if(!msg.isBoo()){
//			fail("Not yet implemented");
//		}
	}

	@Test
	public void testSetTimeBaseByWeekend() {
//		TimeBaseService ms = new TimeBaseServiceImpl();
//		TscNode tn = new TscNode();
//		//注意32相位的信号机
//		tn.setIpAddress(Defines.IP);
//		tn.setPort(Defines.PORT);
//		tn.setDeviceId(Defines.ID);
//		tn.setDeviceName(Defines.IP);
//		tn.setProtocolType(Defines.GBT20999);
//		List<GbtTimeBase> gbtTimeBases = new ArrayList<GbtTimeBase>();
//		Message msg = ms.setTimeBaseByWeekend(gbtTimeBases, tn);
//		if(!msg.isBoo()){
//			fail("Not yet implemented");
//		}
	}
	@Test
	public void testSetTimeBaseByMonth() {
//		TimeBaseService ms = new TimeBaseServiceImpl();
//		TscNode tn = new TscNode();
//		//注意32相位的信号机
//		tn.setIpAddress(Defines.IP);
//		tn.setPort(Defines.PORT);
//		tn.setDeviceId(Defines.ID);
//		tn.setDeviceName(Defines.IP);
//		tn.setProtocolType(Defines.GBT20999);
//		List<GbtTimeBase> gbtTimeBases = new ArrayList<GbtTimeBase>();
//		Message msg = ms.setTimeBaseByMonth(gbtTimeBases, tn);
//		if(!msg.isBoo()){
//			fail("Not yet implemented");
//		}
	}
}
