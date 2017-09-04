package cn.com.aiton.gbt20999.test;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;

import cn.com.aiton.gbt20999.domain.CountDown;
import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.services.CountDownService;
import cn.com.aiton.gbt20999.services.impl.CountDownServiceImpl;

public class CountDownServiceImplTest {

	@Test
	public void testGetCntDownDev() {
		CountDownService cs = new CountDownServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		List<CountDown> lgc = cs.getCntDownDev(tn);
		if(lgc.isEmpty() || lgc == null){
			fail("is null ");
		}else{
			
		}
	}

	@Test
	public void testSetCntDownDev() {
		fail("Not yet implemented");
	}

}
