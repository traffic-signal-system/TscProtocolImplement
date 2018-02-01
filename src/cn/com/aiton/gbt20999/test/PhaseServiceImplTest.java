package cn.com.aiton.gbt20999.test;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;

import cn.com.aiton.gbt20999.domain.GbtPhase;
import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.services.PhaseService;
import cn.com.aiton.gbt20999.services.impl.PhaseServiceImpl;

public class PhaseServiceImplTest {

	@Test
	public void testGetPhase() {
		PhaseService ms = new PhaseServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		List<GbtPhase> lgm = ms.getPhase(tn);
		if(lgm.isEmpty() || lgm == null){
			fail("Not yet implemented");
		}
	}

	@Test
	public void testSetPhase() {
//		PhaseService ms = new PhaseServiceImpl();
//		TscNode tn = new TscNode();
//		//注意32相位的信号机
//		tn.setIpAddress(Defines.IP);
//		tn.setPort(Defines.PORT);
//		tn.setDeviceId(Defines.ID);
//		tn.setDeviceName(Defines.IP);
//		tn.setProtocolType(Defines.GBT20999);
//		List<GbtPhase> gbtPhases = new ArrayList<GbtPhase>();
//		Message msg = ms.setPhase(gbtPhases, tn);
//		if(!msg.isBoo()){
//			fail("Not yet implemented");
//		}
	}

}
