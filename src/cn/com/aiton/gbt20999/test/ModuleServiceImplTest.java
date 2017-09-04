package cn.com.aiton.gbt20999.test;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;

import cn.com.aiton.gbt20999.domain.GbtModule;
import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.services.ModuleService;
import cn.com.aiton.gbt20999.services.impl.ModuleServiceImpl;

public class ModuleServiceImplTest {

	private static final int GBT20999 = 1;

	@Test
	public void testGetModule() {
		ModuleService ms = new ModuleServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		List<GbtModule> lgm = ms.getModule(tn);
		if(lgm.isEmpty() || lgm == null){
			fail("Not yet implemented");
		}
		
	}

	@Test
	public void testGetModuleState() {
		fail("Not yet implemented");
	}

}
