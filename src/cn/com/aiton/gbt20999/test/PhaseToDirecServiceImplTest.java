package cn.com.aiton.gbt20999.test;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import cn.com.aiton.gbt20999.domain.GbtDirec;
import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.services.PhaseToDirecService;
import cn.com.aiton.gbt20999.services.impl.PhaseToDirecServiceImpl;

public class PhaseToDirecServiceImplTest {

	@Test
	public void testGetPhaseToDirec() {
		PhaseToDirecService ms = new PhaseToDirecServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		List<GbtDirec> lgm = ms.getPhaseToDirec(tn);
		if(lgm.isEmpty() || lgm == null){
			fail("Not yet implemented");
		}
	}

	@Test
	public void testSetPhaseToDirec() {
//		PhaseToDirecService ms = new PhaseToDirecServiceImpl();
//		TscNode tn = new TscNode();
//		//注意32相位的信号机
//		tn.setIpAddress(Defines.IP);
//		tn.setPort(Defines.PORT);
//		tn.setDeviceId(Defines.ID);
//		tn.setDeviceName(Defines.IP);
//		tn.setProtocolType(Defines.GBT20999);
//		List<GbtDirec> gbtDirecs = new ArrayList<GbtDirec>();
//		Message msg = ms.setPhaseToDirec(gbtDirecs, tn);
//		if(!msg.isBoo()){
//			fail("Not yet implemented");
//		}
	}

}
