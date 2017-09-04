package cn.com.aiton.gbt20999.services.impl;

import java.util.ArrayList;
import java.util.List;

import cn.com.aiton.gbt20999.services.BroadCastService;
import cn.com.aiton.gbt20999.utils.ByteUtils;
import cn.com.aiton.gbt20999.utils.UdpClientSocket;

public class BroadCastServiceImpl implements BroadCastService {
	  List<String> ips = new ArrayList<String>();
	@Override
	public List<String> getNodeNetwork() {
		 try{

	          

	            String ipAddress = "224.0.0.1";
	            Integer port = 8808;
	            String context = "123456";

	            UdpClientSocket client = new UdpClientSocket();

	            client.send(ipAddress,port,context.getBytes());

	            byte[] bytes;

	            while(true) {
	                try {
	                    client.setSoTimeout(1000);
	                    bytes = client.receiveByte(ipAddress, port);
	                    if (bytes.length == 11) {
	                        String ip = ByteUtils.bytesUInt(bytes[0]) + "." + ByteUtils.bytesUInt(bytes[1])
	                                + "." + ByteUtils.bytesUInt(bytes[2]) + "." + ByteUtils.bytesUInt(bytes[3]);
	                        ips.add(ip);
	                    }
	                }catch (Exception e){
	                    break;
	                }

	            }
	        }catch (Exception e) {
	            e.printStackTrace();;
	        }

         return ips;
	}

}
