package cn.com.aiton.gbt20999.test;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;

import cn.com.aiton.gbt20999.domain.GbtChannel;
import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.services.ChannelService;
import cn.com.aiton.gbt20999.services.impl.ChannelServiceImpl;

public class ChannelServiceImplTest {

	@Test
	public void testGetChannel() {
		ChannelService cs = new ChannelServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		List<GbtChannel> lgc = cs.getChannel(tn);
		if(lgc.isEmpty() || lgc == null){
			fail("is null ");
		}else{
			
		}
	}

	@Test
	public void testSetChannel() {
		fail("Not yet imp ");
	}

}
