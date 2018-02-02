package cn.com.aiton.gbt20999.utils;

import org.apache.commons.lang3.ArrayUtils;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by Administrator on 14-2-11.
 * UDP 客户端操作类
 */
public class UdpClientSocket {
    private byte[] buffer = new byte[65535];

    private DatagramSocket ds = null;

    /**
     * ���캯��������UDP�ͻ���
     * @throws Exception 异常处理
     */
    public UdpClientSocket() throws Exception {
        ds = new DatagramSocket();
    }

    /**
     * ���ó�ʱʱ�䣬�÷���������bind����֮��ʹ��.
     * @param timeout ��ʱʱ��
     * @throws Exception 异常处理
     */
    public final void setSoTimeout(final int timeout) throws Exception {
        ds.setSoTimeout(timeout);
    }

    /**
     * ��ó�ʱʱ��.
     * @return ���س�ʱʱ��
     * @throws Exception 异常处理
     */
    public final int getSoTimeout() throws Exception {
        return ds.getSoTimeout();
    }

    public final DatagramSocket getSocket() {
        return ds;
    }

    /**
     * ��ָ���ķ���˷���������Ϣ.
     * @param host ������������ַ
     * @param port ����˶˿�
     * @param bytes ���͵�������Ϣ
     * @return ���ع��������ݱ�
     * @throws IOException 异常抛出
     */
    public final DatagramPacket send(final String host, final int port,
                                     final byte[] bytes) throws IOException {
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress
                .getByName(host), port);
        ds.send(dp);
        return dp;
    }

    /**
     * ���մ�ָ���ķ���˷��ص�����.
     * @param lhost ���������
     * @param lport ����˶˿�
     * @return ���ش�ָ���ķ���˷��ص�����.
     * @throws Exception 异常处理
     */
    public final String receive(final String lhost, final int lport)
            throws Exception {
        DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
        ds.receive(dp);
        String info = new String(dp.getData(), 0, dp.getLength());
        return info;
    }
    /**
     * ���մ�ָ���ķ���˷��ص�����.
     * @param lhost ���������
     * @param lport ����˶˿�
     * @return ���ش�ָ���ķ���˷��ص�����.
     * @throws Exception 异常处理
     */
    public final byte[] receiveByte(final String lhost, final int lport)
            throws Exception {
        DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
        ds.receive(dp);
        byte[] result = ArrayUtils.subarray(dp.getData(),0,dp.getLength());
        return result;
    }
    /**
     * �ر�udp����.
     */
    public final void close() {
        try {
            ds.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * ���Կͻ��˷����ͽ��ջ�Ӧ��Ϣ�ķ���.
     * @param args 无
     * @throws Exception 异常处理
     */
    public static void main(String[] args) throws Exception {
        UdpClientSocket client = new UdpClientSocket();
        String serverHost = "127.0.0.1";
        int serverPort = 3344;
        client.send(serverHost, serverPort, ("��ã����۹�!").getBytes());
        String info = client.receive(serverHost, serverPort);
        System.out.println("����˻�Ӧ���ݣ�" + info);
    }
}
