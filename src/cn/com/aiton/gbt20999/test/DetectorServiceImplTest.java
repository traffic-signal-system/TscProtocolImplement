package cn.com.aiton.gbt20999.test;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;

import cn.com.aiton.gbt20999.domain.GbtDetector;
import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.services.DetectorService;
import cn.com.aiton.gbt20999.services.impl.DetectorServiceImpl;

public class DetectorServiceImplTest {

	private static final int GBT20999 = 1;

	@Test
	public void testGetDetectorSensitivityOneBorad1_8() {
		DetectorService ds = new DetectorServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		int result = ds.getDetectorSensitivityOneBorad1_8(tn);
		
		if(result>0){
			
		}else{
			fail("Not yet implemented");
		}
		
	}

	@Test
	public void testGetDetectorSensitivityOneBorad9_16() {
		DetectorService ds = new DetectorServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		int result = ds.getDetectorSensitivityOneBorad9_16(tn);
		
		if(result>0){
			
		}else{
			fail("Not yet implemented");
		}
	}

	@Test
	public void testGetDetectorOscillatorFrequency1() {
		DetectorService ds = new DetectorServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		int result = ds.getDetectorOscillatorFrequency1(tn);
		
		if(result>0){
			
		}else{
			fail("Not yet implemented");
		}
	}

	@Test
	public void testGetDetectorOscillatorFrequency2() {
		DetectorService ds = new DetectorServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		int result = ds.getDetectorOscillatorFrequency2(tn);
		
		if(result>0){
			
		}else{
			fail("Not yet implemented");
		}
	}

	@Test
	public void testGetDetectorSensitivityTwoBorad1_8() {
		DetectorService ds = new DetectorServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		int result = ds.getDetectorSensitivityTwoBorad1_8(tn);
		
		if(result>0){
			
		}else{
			fail("Not yet implemented");
		}
	}

	@Test
	public void testGetDetectorSensitivityTwoBorad9_16() {
		DetectorService ds = new DetectorServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		int result = ds.getDetectorSensitivityTwoBorad9_16(tn);
		
		if(result>0){
			
		}else{
			fail("Not yet implemented");
		}
	}

	@Test
	public void testSetOscillatorFrequency() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSensityvityDig1() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSensityvityDig2() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSensityvityDig3() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSensityvityDig4() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSensityvityDig5() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSensityvityDig6() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSensitivity() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSensitivityAdv11ByteArrayTscNode() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSensitivityAdv12ByteArrayTscNode() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSensitivityAdv21ByteArrayTscNode() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSensitivityAdv22ByteArrayTscNode() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSensitivityAdv() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSensitivityAdv11TscNode() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSensitivityAdv12TscNode() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSensitivityAdv21TscNode() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSensitivityAdv22TscNode() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDetector() {
		DetectorService ds = new DetectorServiceImpl();
		TscNode tn = new TscNode();
		//注意32相位的信号机
		tn.setIpAddress(Defines.IP);
		tn.setPort(Defines.PORT);
		tn.setDeviceId(Defines.ID);
		tn.setDeviceName(Defines.IP);
		tn.setProtocolType(Defines.GBT20999);
		List<GbtDetector> lgd = ds.getDetector(tn);
		
		if(lgd.isEmpty() || lgd == null){
			fail("Not yet implemented");
		}else{
			
		}
	}

	@Test
	public void testSetDetector() {
		fail("Not yet implemented");
	}

}
