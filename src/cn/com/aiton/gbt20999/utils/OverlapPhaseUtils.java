package cn.com.aiton.gbt20999.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by Administrator on 14-2-23.
 * 跟随相位工具类
 */
public class OverlapPhaseUtils {
	/**
	 * 字节数组,转换成字条串
	 * @param bytes 字节数组，用于处理信号机返回字节数组，转换成字符串
	 * @return 转换成字符串数据
	 */
    public static String byteArrayToString(byte[] bytes){
        return StringUtils.join(bytes,",");
    }
	/**
	 * 字条串转换成字节数组
	 * @param str 字符串数据，以‘，’隔开
	 * @return 转换成字节数组
	 */
    public static byte[] stringToByteArray(String str){
        String[] strings = StringUtils.split(str,",");
        byte[] bytes = new byte[16];
        for(int i=0;i<strings.length;i++){
            bytes[i] = Byte.parseByte(strings[i]);
        }
        return bytes;
    }

}
