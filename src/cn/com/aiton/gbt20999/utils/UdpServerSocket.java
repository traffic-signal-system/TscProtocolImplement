package cn.com.aiton.gbt20999.utils;

import java.io.IOException;
import java.net.*;

/**
 * Created by Administrator on 14-2-11.
 * UDP操作服务端
 */
public class UdpServerSocket {
    private byte[] buffer = new byte[65535];

    private DatagramSocket ds = null;

    private DatagramPacket packet = null;

    private InetSocketAddress socketAddress = null;

    private String orgIp;

    /**
     * ���캯�����������Ͷ˿�.
     * @param host ����
     * @param port �˿�
     * @throws Exception
     */
    public UdpServerSocket(String host, int port) throws Exception {
        socketAddress = new InetSocketAddress(host, port);
        ds = new DatagramSocket(socketAddress);
        System.out.println("���������!");
    }

    public final String getOrgIp() {
        return orgIp;
    }

    /**
     * ���ó�ʱʱ�䣬�÷���������bind����֮��ʹ��.
     * @param timeout ��ʱʱ��
     * @throws Exception
     */
    public final void setSoTimeout(int timeout) throws Exception {
        ds.setSoTimeout(timeout);
    }

    /**
     * ��ó�ʱʱ��.
     * @return ���س�ʱʱ��.
     * @throws Exception
     */
    public final int getSoTimeout() throws Exception {
        return ds.getSoTimeout();
    }

    /**
     * �󶨼�����ַ�Ͷ˿�.
     * @param host ����IP
     * @param port �˿�
     * @throws SocketException
     */
    public final void bind(String host, int port) throws SocketException {
        socketAddress = new InetSocketAddress(host, port);
        ds = new DatagramSocket(socketAddress);
    }


    /**
     * �������ݰ����÷���������߳�����.
     * @return ���ؽ��յ����ݴ���Ϣ
     * @throws IOException
     */
    public final String receive() throws IOException {
        packet = new DatagramPacket(buffer, buffer.length);
        ds.receive(packet);
        orgIp = packet.getAddress().getHostAddress();
        String info = new String(packet.getData(), 0, packet.getLength());
        System.out.println("������Ϣ��" + info);
        return info;
    }
    /**
     * �������ݰ����÷���������߳�����.
     * @return ���ؽ��յ����ݴ���Ϣ
     * @throws IOException
     */
    public final byte[] receiveByte() throws IOException {
        packet = new DatagramPacket(buffer, buffer.length);
        ds.receive(packet);
        orgIp = packet.getAddress().getHostAddress();
        String info = new String(packet.getData(), 0, packet.getLength());
        System.out.println("������Ϣ��" + info);
        return packet.getData();
    }
    /**
     * ����Ӧ�����͸������.
     * @param info ��Ӧ����
     * @throws IOException
     */
    public final void response(String info) throws IOException {
        System.out.println("�ͻ��˵�ַ : " + packet.getAddress().getHostAddress()
                + ",�˿ڣ�" + packet.getPort());
        DatagramPacket dp = new DatagramPacket(buffer, buffer.length, packet
                .getAddress(), packet.getPort());
        dp.setData(info.getBytes());
        ds.send(dp);
    }
    /**
     * ����Ӧ�����͸������.
     * @param info ��Ӧ����
     * @throws IOException
     */
    public final void responseByte(byte[] info) throws IOException {
        System.out.println("�ͻ��˵�ַ : " + packet.getAddress().getHostAddress()
                + ",�˿ڣ�" + packet.getPort());
        DatagramPacket dp = new DatagramPacket(buffer, buffer.length, packet
                .getAddress(), packet.getPort());
        dp.setData(info);
        ds.send(dp);
    }
    /**
     * ���ñ��ĵĻ��峤��.
     * @param bufsize ���峤��
     */
    public final void setLength(int bufsize) {
        packet.setLength(bufsize);
    }

    /**
     * ��÷��ͻ�Ӧ��IP��ַ.
     * @return ���ػ�Ӧ��IP��ַ
     */
    public final InetAddress getResponseAddress() {
        return packet.getAddress();
    }

    /**
     * ��û�Ӧ�������Ķ˿�.
     * @return ���ػ�Ӧ�������Ķ˿�.
     */
    public final int getResponsePort() {
        return packet.getPort();
    }

    /**
     * �ر�udp������.
     */
    public final void close() {
        try {
            ds.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * ���Է���.
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        String serverHost = "127.0.0.1";
        int serverPort = 3344;
        UdpServerSocket udpServerSocket = new UdpServerSocket(serverHost, serverPort);
        while (true) {
            udpServerSocket.receive();
            udpServerSocket.response("���,sterning!");

        }
    }
}
