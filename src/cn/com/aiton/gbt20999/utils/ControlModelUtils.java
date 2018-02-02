package cn.com.aiton.gbt20999.utils;

/**
 * Created by Administrator on 14-2-15.
 * 信号机控制模式，字节转换成文字
 */
public class ControlModelUtils {
	/**
	 * 信号机控制模式，字节转换成文字
	 * @param b
	 * @return
	 */
    public static String controlModelToString(byte b)
    {
        String result = "";
        switch (b)
        {
            case 0x01:
                result = result + "��ʱ��";
                break;
            case 0x02:
                result = result + "ϵͳ�Ż���������";
                break;
            case 0x03:
                result = result + "�޵�����Э��";
                break;
            case 0x04:
                result = result + "���ߵ���Э��";
                break;
            case 0x05:
                result = result + "�����߿�";
                break;
            case 0x06:
                result = result + "�ֶ�����";
                break;
            case 0x07:
                result = result + "����ȫ��Ӧ";
                break;
            case 0x08:
                result = result + "�����������Ȱ��Ӧ";
                break;
            case 0x09:
                result = result + "����������Ȱ��Ӧ";
                break;
            case 0x0a:
                result = result + "����Ӧ";
                break;
            case 0x0b:
                result = result + "������";
                break;
            default:
                result = result + "δ֪";
                break;
        }
        return result;
    }
}
