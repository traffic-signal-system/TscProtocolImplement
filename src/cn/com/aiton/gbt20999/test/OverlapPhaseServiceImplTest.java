package cn.com.aiton.gbt20999.test;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import cn.com.aiton.gbt20999.domain.GbtOverlap;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.services.OverlapPhaseService;
import cn.com.aiton.gbt20999.services.impl.OverlapPhaseServiceImpl;

public class OverlapPhaseServiceImplTest {

	private static final int GBT20999 = 1;

	@Test
	public void testGetOverlapPhase() {
		OverlapPhaseService ms = new OverlapPhaseServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		List<GbtOverlap> lgm = ms.getOverlapPhase(tn);
		if(lgm.isEmpty() || lgm == null){
			fail("Not yet implemented");
		}
	}

	@Test
	public void testSetOverlapPhase() {
//		OverlapPhaseService ms = new OverlapPhaseServiceImpl();
//		TscNode tn = new TscNode();
//		//注意32相位的信号机
//		tn.setIpAddress(Defines.IP);
//		tn.setPort(Defines.PORT);
//		tn.setDeviceId(Defines.ID);
//		tn.setDeviceName(Defines.IP);
//		tn.setProtocolType(Defines.GBT20999);
//		List<GbtOverlap> gbtOverlaps = new ArrayList<GbtOverlap>();
//		Message msg = ms.setOverlapPhase(tn, gbtOverlaps);
//		if(!msg.isBoo()){
//			fail("Not yet implemented");
//		}
	}

}
