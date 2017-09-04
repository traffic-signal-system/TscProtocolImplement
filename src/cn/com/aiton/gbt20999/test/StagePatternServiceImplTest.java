package cn.com.aiton.gbt20999.test;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import cn.com.aiton.gbt20999.domain.GbtSchedule;
import cn.com.aiton.gbt20999.domain.GbtStagePattern;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.services.ScheduleService;
import cn.com.aiton.gbt20999.services.StagePatternService;
import cn.com.aiton.gbt20999.services.impl.ScheduleServiceImpl;
import cn.com.aiton.gbt20999.services.impl.StagePatternServiceImpl;
import cn.com.aiton.gbt20999.utils.GbtDefine;

public class StagePatternServiceImplTest {

	@Test
	public void testGetStagePattern32Phase() {
		StagePatternService ms = new StagePatternServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		List<GbtStagePattern> lgm = ms.getStagePattern32Phase(tn);
		if(lgm.isEmpty() || lgm == null){
			fail("Not yet implemented");
		}
	}

	@Test
	public void testGetStagePattern16Phase() {
		StagePatternService ms = new StagePatternServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		List<GbtStagePattern> lgm = ms.getStagePattern16Phase(tn);
		if(lgm.isEmpty() || lgm == null){
			fail("Not yet implemented");
		}
	}

	@Test
	public void testSetStagePatternBy16Phase() {
//		StagePatternService ms = new StagePatternServiceImpl();
//		TscNode tn = new TscNode();
//		//注意32相位的信号机
//		tn.setIpAddress(Defines.IP);
//		tn.setPort(Defines.PORT);
//		tn.setDeviceId(Defines.ID);
//		tn.setDeviceName(Defines.IP);
//		tn.setProtocolType(Defines.GBT20999);
//		List<GbtStagePattern> gbtStagePatterns = new ArrayList<GbtStagePattern>();
//		Message msg = ms.setStagePatternBy16Phase(tn, gbtStagePatterns);
//		if(!msg.isBoo()){
//			fail("Not yet implemented");
//		}
	}

	@Test
	public void testSetStagePatternBy32Phase() {
//		StagePatternService ms = new StagePatternServiceImpl();
//		TscNode tn = new TscNode();
//		//注意32相位的信号机
//		tn.setIpAddress(Defines.IP);
//		tn.setPort(Defines.PORT);
//		tn.setDeviceId(Defines.ID);
//		tn.setDeviceName(Defines.IP);
//		tn.setProtocolType(Defines.GBT20999);
//		List<GbtStagePattern> gbtStagePatterns = new ArrayList<GbtStagePattern>();
//		Message msg = ms.setStagePatternBy32Phase(tn, gbtStagePatterns);
//		if(!msg.isBoo()){
//			fail("Not yet implemented");
//		}
	}

}
