package cn.com.aiton.gbt20999.test;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;

import cn.com.aiton.gbt20999.domain.GbtCollision;
import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.services.CollisionService;
import cn.com.aiton.gbt20999.services.impl.CollisionServiceImpl;

public class CollisionServiceImplTest {
	
	private static final int GBT20999 = 1;
	private static final int NTCIP = 2;

	@Test
	public void testGetCollisionBy16Phase() {
		CollisionService cs = new CollisionServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		List<GbtCollision> lgc = cs.getCollisionBy16Phase(tn);
		if(lgc.isEmpty() || lgc == null){
			fail("没有读到数据");
		}else{
			
		}
		
	}

	@Test
	public void testGetCollisionBy32Phase() {
		CollisionService cs = new CollisionServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		List<GbtCollision> lgc = cs.getCollisionBy32Phase(tn);
		if(lgc.isEmpty() || lgc == null){
			fail("没有读到数据");
		}else{
			
		}
	}

}
