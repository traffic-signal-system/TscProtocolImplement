package cn.com.aiton.ntcip.utils;

/**
 * Created by Administrator on 14-2-16.
 */
import org.snmp4j.CommunityTarget;
import org.snmp4j.UserTarget;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.GenericAddress;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.TcpAddress;
import org.snmp4j.smi.UdpAddress;

public class SnmpUtil {
    public static final int DEFAULT_VERSION = SnmpConstants.version2c;
    public static final String DEFAULT_PROTOCOL = "udp";
    public static final int DEFAULT_PORT = 161;
    public static final long DEFAULT_TIMEOUT = 3 * 1000L;
    public static final int DEFAULT_RETRY = 3;

    /**
     * ������ͬ�����communityTarget
     * @param address 设备IP地址
     * @param community 内容
     * @return CommunityTarget 内容目标
     */
    public static CommunityTarget createMyDefaultTarget(String address,
                                                        String community) {
        Address targetAddress = GenericAddress.parse(address);
        CommunityTarget target = new CommunityTarget();
        target.setCommunity(new OctetString(community));
        target.setAddress(targetAddress);
        target.setVersion(DEFAULT_VERSION);
        target.setTimeout(DEFAULT_TIMEOUT);// milliseconds
        target.setRetries(DEFAULT_RETRY);
        return target;
    }

    /**
     * ������ͬ�����communityTarget
     * @param targetAddress  目标地址
     * @param community 目标内容
     * @param version 版本
     * @return CommunityTarget 内容目标
     */
    public static CommunityTarget createCommunityTarget(Address targetAddress,
                                                        String community, int version) {
        CommunityTarget target = new CommunityTarget();
        target.setCommunity(new OctetString(community));
        target.setAddress(targetAddress);
        target.setVersion(version);
        return target;
    }

    /**
     * ������ͬ�����communityTarget
     * @param targetAddress
     * @param community
     * @param version
     * @param timeOut
     * @param retry
     * @return CommunityTarget
     */
    public static CommunityTarget createCommunityTarget(Address targetAddress,
                                                        String community, int version, long timeOut, int retry) {
        CommunityTarget target = new CommunityTarget();
        target.setCommunity(new OctetString(community));
        target.setAddress(targetAddress);
        target.setVersion(version);
        target.setTimeout(timeOut); // milliseconds
        target.setRetries(retry);
        return target;
    }

    /**
     * ������ͬ�����communityTarget
     * @param address
     * @param community
     * @param version
     * @param timeOut
     * @param retry
     * @return CommunityTarget
     */
    public static CommunityTarget createCommunityTarget(String address,
                                                        String community, int version, long timeOut, int retry) {
        Address targetAddress = GenericAddress.parse(address);
        return createCommunityTarget(targetAddress, community, version,
                timeOut, retry);
    }

    /**
     * ����snmp Address
     * @param protocol
     * @param ip
     * @param port
     * @return Address
     */
    public static Address createAddress(String protocol, String ip, int port) {
        String address = protocol + ":" + ip + "/" + port;
        return GenericAddress.parse(address);
    }

    /**
     * ����snmp udp Address
     * @param ip
     * @param port
     * @return Address
     */
    public static Address createUdpAddress(String ip, int port) {
        String address = ip + "/" + port;
        return new UdpAddress(address);
    }

    /**
     * ����snmp tcp Address
     * @param ip
     * @param port
     * @return Address
     */
    public static TcpAddress createTcpAddress(String ip, int port) {
        String address = ip + "/" + port;
        return new TcpAddress(address);
    }

    /**
     * ���� UserTarget
     * @param targetAddress
     * @param version
     * @param timeOut
     * @param level
     * @param securityName
     * @return UserTarget
     */
    public static UserTarget createUserTarget(Address targetAddress,
                                              int version, long timeOut, int level, String securityName) {
        UserTarget target = new UserTarget();
        target.setAddress(targetAddress);
        target.setRetries(1);
        target.setTimeout(timeOut); // milliseconds
        target.setVersion(version);
        target.setSecurityLevel(level);
        target.setSecurityName(new OctetString(securityName));
        return target;
    }

    /**
     * ���� UserTarget
     * @param address
     * @param version
     * @param timeOut
     * @param level
     * @param securityName
     * @return UserTarget
     */
    public static UserTarget createUserTarget(String address, int version,
                                              long timeOut, int level, String securityName) {
        Address targetAddress = GenericAddress.parse(address);
        return createUserTarget(targetAddress, version, timeOut, level,
                securityName);
    }
}
