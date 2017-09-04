package cn.com.aiton.gbt20999.test;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;

import cn.com.aiton.gbt20999.domain.GbtLampCheck;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.services.LampCheckService;
import cn.com.aiton.gbt20999.services.impl.LampCheckServiceImpl;

public class LampCheckServiceImplTest {

	private static final int GBT20999 = 1;

	@Test
	public void testSetLampCheckCloseOne() {
		LampCheckService lcs = new LampCheckServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		Message msg = lcs.setLampCheckCloseOne(tn);
		if(msg.isBoo()){
			
		}else{
			fail("Not yet implemented");
		}
		
	}

	@Test
	public void testSetLampCheckCloseTwo() {
		LampCheckService lcs = new LampCheckServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		Message msg = lcs.setLampCheckCloseTwo(tn);
		if(msg.isBoo()){
			
		}else{
			fail("Not yet implemented");
		}
	}

	@Test
	public void testSetLampCheckCloseThree() {
		LampCheckService lcs = new LampCheckServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		Message msg = lcs.setLampCheckCloseThree(tn);
		if(msg.isBoo()){
			
		}else{
			fail("Not yet implemented");
		}
	}

	@Test
	public void testSetLampCheckCloseFour() {
		LampCheckService lcs = new LampCheckServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		Message msg = lcs.setLampCheckCloseFour(tn);
		if(msg.isBoo()){
			
		}else{
			fail("Not yet implemented");
		}
	}

	@Test
	public void testSetLampCheckCloseFive() {
		LampCheckService lcs = new LampCheckServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		Message msg = lcs.setLampCheckCloseFive(tn);
		if(msg.isBoo()){
			
		}else{
			fail("Not yet implemented");
		}
	}

	@Test
	public void testSetLampCheckCloseSix() {
		LampCheckService lcs = new LampCheckServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		Message msg = lcs.setLampCheckCloseSix(tn);
		if(msg.isBoo()){
			
		}else{
			fail("Not yet implemented");
		}
	}

	@Test
	public void testSetLampCheckCloseSeven() {
		LampCheckService lcs = new LampCheckServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		Message msg = lcs.setLampCheckCloseSeven(tn);
		if(msg.isBoo()){
			
		}else{
			fail("Not yet implemented");
		}
	}

	@Test
	public void testSetLampCheckCloseEight() {
		LampCheckService lcs = new LampCheckServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		Message msg = lcs.setLampCheckCloseEight(tn);
		if(msg.isBoo()){
			
		}else{
			fail("Not yet implemented");
		}
	}

	@Test
	public void testSetLampCheckCloseALL() {
		LampCheckService lcs = new LampCheckServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		List<Message> msg = lcs.setLampCheckCloseALL(tn);
		if(msg.get(0).isBoo()){
			
		}else{
			fail("Not yet implemented");
		}
	}

	@Test
	public void testSetLampCheckOpenOne() {
		LampCheckService lcs = new LampCheckServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		Message msg = lcs.setLampCheckOpenOne(tn);
		if(msg.isBoo()){
			
		}else{
			fail("Not yet implemented");
		}
	}

	@Test
	public void testSetLampCheckOpenTwo() {
		LampCheckService lcs = new LampCheckServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		Message msg = lcs.setLampCheckOpenTwo(tn);
		if(msg.isBoo()){
			
		}else{
			fail("Not yet implemented");
		}
	}

	@Test
	public void testSetLampCheckOpenThree() {
		LampCheckService lcs = new LampCheckServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		Message msg = lcs.setLampCheckOpenThree(tn);
		if(msg.isBoo()){
			
		}else{
			fail("Not yet implemented");
		}
	}

	@Test
	public void testSetLampCheckOpenFour() {
		LampCheckService lcs = new LampCheckServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		Message msg = lcs.setLampCheckOpenFour(tn);
		if(msg.isBoo()){
			
		}else{
			fail("Not yet implemented");
		}
	}

	@Test
	public void testSetLampCheckOpenFive() {
		LampCheckService lcs = new LampCheckServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		Message msg = lcs.setLampCheckOpenFive(tn);
		if(msg.isBoo()){
			
		}else{
			fail("Not yet implemented");
		}
	}

	@Test
	public void testSetLampCheckOpenSix() {
		LampCheckService lcs = new LampCheckServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		Message msg = lcs.setLampCheckOpenSix(tn);
		if(msg.isBoo()){
			
		}else{
			fail("Not yet implemented");
		}
	}

	@Test
	public void testSetLampCheckOpenSeven() {
		LampCheckService lcs = new LampCheckServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		Message msg = lcs.setLampCheckOpenSeven(tn);
		if(msg.isBoo()){
			
		}else{
			fail("Not yet implemented");
		}
	}

	@Test
	public void testSetLampCheckOpenEight() {
		LampCheckService lcs = new LampCheckServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		Message msg = lcs.setLampCheckOpenEight(tn);
		if(msg.isBoo()){
			
		}else{
			fail("Not yet implemented");
		}
	}

	@Test
	public void testSetLampCheckOpenALL() {
		LampCheckService lcs = new LampCheckServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		List<Message> msg = lcs.setLampCheckOpenALL(tn);
		if(msg.get(0).isBoo()){
			
		}else{
			fail("Not yet implemented");
		}
	}

	@Test
	public void testGetLampCheck() {
		LampCheckService lcs = new LampCheckServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		List<GbtLampCheck> llc = lcs.getLampCheck(tn);
		if(llc.isEmpty() || llc == null){
			fail("Not yet implemented");
		}else{
			
		}
	}

}
