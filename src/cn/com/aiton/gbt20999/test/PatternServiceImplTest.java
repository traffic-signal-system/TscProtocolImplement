package cn.com.aiton.gbt20999.test;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import cn.com.aiton.gbt20999.domain.GbtOverlap;
import cn.com.aiton.gbt20999.domain.GbtTimePattern;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.services.OverlapPhaseService;
import cn.com.aiton.gbt20999.services.PatternService;
import cn.com.aiton.gbt20999.services.impl.OverlapPhaseServiceImpl;
import cn.com.aiton.gbt20999.services.impl.PatternServiceImpl;
import cn.com.aiton.gbt20999.utils.GbtDefine;

public class PatternServiceImplTest {

	

	@Test
	public void testGetTimePattern() {
		PatternService ms = new PatternServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		List<GbtTimePattern> lgm = ms.getTimePattern(tn);
		if(lgm.isEmpty() || lgm == null){
			fail("Not yet implemented");
		}
	}

	@Test
	public void testSetTimePattern() {
//		PatternService ms = new PatternServiceImpl();
//		TscNode tn = new TscNode();
//		//注意32相位的信号机
//		tn.setIpAddress(Defines.IP);
//		tn.setPort(Defines.PORT);
//		tn.setDeviceId(Defines.ID);
//		tn.setDeviceName(Defines.IP);
//		tn.setProtocolType(Defines.GBT20999);
//		List<GbtTimePattern> gbtTimePatterns = new ArrayList<GbtTimePattern>();
//		Message msg = ms.setTimePattern(tn, gbtTimePatterns);
//		if(!msg.isBoo()){
//			fail("Not yet implemented");
//		}
	}

}
