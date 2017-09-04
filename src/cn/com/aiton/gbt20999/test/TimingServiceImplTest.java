package cn.com.aiton.gbt20999.test;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import cn.com.aiton.gbt20999.domain.GbtTimeBase;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.services.TimingService;
import cn.com.aiton.gbt20999.services.impl.TimingServiceImpl;
import cn.com.aiton.gbt20999.utils.GbtDefine;

public class TimingServiceImplTest {

	@Test
	public void testSetTiming() {
		TimingService ms = new TimingServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		
		Message msg = ms.setTiming(tn);
		if(!msg.isBoo()){
			fail("Not yet implemented");
		}
	}

}
