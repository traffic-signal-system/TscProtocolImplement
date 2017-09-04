package cn.com.aiton.gbt20999.test;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import cn.com.aiton.gbt20999.domain.GbtDirec;
import cn.com.aiton.gbt20999.domain.GbtSchedule;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.services.PhaseToDirecService;
import cn.com.aiton.gbt20999.services.ScheduleService;
import cn.com.aiton.gbt20999.services.impl.PhaseToDirecServiceImpl;
import cn.com.aiton.gbt20999.services.impl.ScheduleServiceImpl;
import cn.com.aiton.gbt20999.utils.GbtDefine;

public class ScheduleServiceImplTest {

	@Test
	public void testGetSchedule() {
		ScheduleService ms = new ScheduleServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		List<GbtSchedule> lgm = ms.getSchedule(tn);
		if(lgm.isEmpty() || lgm == null){
			fail("Not yet implemented");
		}
	}

	@Test
	public void testSetSchedule() {
//		ScheduleService ms = new ScheduleServiceImpl();
//		TscNode tn = new TscNode();
//		//注意32相位的信号机
//		tn.setIpAddress(Defines.IP);
//		tn.setPort(Defines.PORT);
//		tn.setDeviceId(Defines.ID);
//		tn.setDeviceName(Defines.IP);
//		tn.setProtocolType(Defines.GBT20999);
//		List<GbtSchedule> gbtSchedules = new ArrayList<GbtSchedule>();
//		Message msg = ms.setSchedule(tn, gbtSchedules);
//		if(!msg.isBoo()){
//			fail("Not yet implemented");
//		}
	}

}
