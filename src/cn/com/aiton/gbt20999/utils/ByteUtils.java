package cn.com.aiton.gbt20999.utils;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;

/**
 * Created by Administrator on 14-2-14.
 */
public class ByteUtils {
    /**
     * ��һά���飬ת���ɶ�ά���ݣ�Ҳ����ÿ����¼
     * @param bytes
     * @param row
     * @param column
     * @return
     */
    public static byte[][] oneArrayToTwoArray(byte[] bytes, int row, int column){
        byte[][] bta = new byte[row][column];
        for(int i=0;i<bytes.length;i++){
            bta[i /column][i% column] = bytes[i];
        }
        return bta;
    }
    
    //long����ת��byte����
    public static byte[] longToByte(long number) {
        long temp = number;
        byte[] b = new byte[8];
        for (int i = 0; i < b.length; i++) {
            b[i] = new Long(temp & 0xff).byteValue();//�����λ���������λ
            temp = temp >> 8; // ������8λ
        }
        return b;
    }
    //byte����ת��long
    public static long byteToLong(byte[] b) {
        long s = 0;
        long s0 = b[0] & 0xff;// ���λ
        long s1 = b[1] & 0xff;
        long s2 = b[2] & 0xff;
        long s3 = b[3] & 0xff;
        long s4 = b[4] & 0xff;// ���λ
        long s5 = b[5] & 0xff;
        long s6 = b[6] & 0xff;
        long s7 = b[7] & 0xff;

        // s0����
        s1 <<= 8;
        s2 <<= 16;
        s3 <<= 24;
        s4 <<= 8 * 4;
        s5 <<= 8 * 5;
        s6 <<= 8 * 6;
        s7 <<= 8 * 7;
        s = s0 | s1 | s2 | s3 | s4 | s5 | s6 | s7;
        return s;
    }
    /**
     * ע�ͣ�int���ֽ������ת����
     *
     * @param number
     * @return
     */
    public static byte[] intToByte(int number) {
        int temp = number;
        byte[] b = new byte[4];
        for (int i = 0; i < b.length; i++) {
            b[i] = new Integer(temp & 0xff).byteValue();//�����λ���������λ
            temp = temp >> 8; // ������8λ
        }
        return b;
    }
    /**
     * ע�ͣ��ֽ����鵽int��ת����
     *
     * @param b
     * @return
     */
    public static int byteToInt(byte[] b) {
        int s = 0;
        int s0 = b[0] & 0xff;// ���λ
        int s1 = b[1] & 0xff;
        int s2 = b[2] & 0xff;
        int s3 = b[3] & 0xff;
        s3 <<= 24;
        s2 <<= 16;
        s1 <<= 8;
        s = s0 | s1 | s2 | s3;
        return s;
    }

    /**
     * ע�ͣ�short���ֽ������ת����
     *
     * @param number
     * @return
     */
    public static byte[] shortToByte(short number) {
        int temp = number;
        byte[] b = new byte[2];
        for (int i = 0; i < b.length; i++) {
            b[i] = new Integer(temp & 0xff).byteValue();//�����λ���������λ
            temp = temp >> 8; // ������8λ
        }
        return b;
    }

    /**
     * ע�ͣ��ֽ����鵽short��ת����
     *
     * @param b
     * @return
     */
    public static short byteToShort(byte[] b) {
        short s = 0;
        short s0 = (short) (b[0] & 0xff);// ���λ
        short s1 = (short) (b[1] & 0xff);
        s1 <<= 8;
        s = (short) (s0 | s1);
        return s;
    }
    /**   * floatת��byte   *   * @param bb   * @param x   * @param index   */
    public static byte[] floatTobyteArray(float v) {
        ByteBuffer bb = ByteBuffer.allocate(4);
        byte[] ret = new byte[4];
        FloatBuffer fb = bb.asFloatBuffer();
        fb.put(v);
        bb.get(ret);
        return ret;
    }
    /**   * ͨ��byte����ȡ��float   *   * @param bb   * @param index   * @return   */
    public static float byteArrayToFloat(byte[] v) {
        ByteBuffer bb = ByteBuffer.wrap(v);
        FloatBuffer fb = bb.asFloatBuffer();
        return fb.get();
    }

    /**   * doubleת��byte   *   * @param bb   * @param x   * @param index   */
    public static byte[] doubleToByteArray(double x) {
        ByteBuffer bb = ByteBuffer.allocate(8);
        byte[] ret = new byte[8];
        DoubleBuffer fb = bb.asDoubleBuffer();
        fb.put(x);
        bb.get(ret);
        return ret;
    }

    /**   * ͨ��byte����ȡ��float   *   * @param bb   * @param index   * @return   */
    public static double byteArrayToDouble(byte[] b) {
        ByteBuffer bb = ByteBuffer.wrap(b);
        DoubleBuffer fb = bb.asDoubleBuffer();
        return fb.get();
    }

    /**
     *
     * @param bytes
     * @return
     * @throws Exception
     */
    public static String byteArrayToStringByUTF8(byte[] bytes) throws Exception{
        return new String(bytes,"UTF-8");
    }

    /**
     *
     * @param bytes
     * @return
     * @throws Exception
     */
    public static String byteArrayToStringByISO(byte[] bytes) throws Exception{
        return new String(bytes,"ISO-8859-1");
    }

    /**
     *
     * @param s
     * @return
     * @throws Exception
     */
    public static byte[] stringToByteArrayByUTF8(String s) throws Exception{
        return s.getBytes("UTF-8");
    }
    /**
     * 将Byte数组转成无符号整型
     * @param b
     * @return
     */
    public static int bytesUInt(byte b){
        return b&0xff;
    }
    /**
     *
     * @param s
     * @return
     * @throws Exception
     */
    public static byte[] stringToByteArrayByISO(String s) throws  Exception{
        return s.getBytes("ISO-8859-1");
    }
    public static byte[] stringToByteArrayByASCII(String s) throws Exception{
        return s.getBytes("US-ASCII");
    }
}
