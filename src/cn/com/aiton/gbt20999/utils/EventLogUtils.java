package cn.com.aiton.gbt20999.utils;

/**
 * Created by Administrator on 14-2-14.
 * 日志工具类
 * 
 */
public class EventLogUtils {
	/**
	 * 日志类型转换成文字 
	 * @param type 日志事件类型
	 * @return 返回字符串内容
	 */
    public static String eventTypeToString(int type){

        String result = "δ֪";
        switch (type)
        {
            case 0:
                result = "�źŵ�";
                break;
            case 1:
                result = "�̳�ͻ";
                break;
            case 2:
                result = "�����";
                break;
            case 3:
                result = "��ѹ";
                break;
            case 4:
                result = "�¶�";
                break;
            case 5:
                result = "������";
                break;
            case 15:
                result = "����������־";
                break;
            case 6:
                result = "�ƿذ�";
                break;
            case 7:
                result = "�������";
                break;
            case 8:
                result = "��������";
                break;
            case 9:
                result = "��������";
                break;
            case 10:
                result = "ϵͳʱ���޸�";
                break;
            case 11:
                result = "�ű���";
                break;
            case 12:
                result = "�����ֶ�";
                break;
            case 13:
                result = "��ɫ����쳣";
                break;
            case 14:
                result = "��ɫ����쳣2";
                break;
            case 16:
                result = "can����";
                break;
            default:
                break;
        }

        return result;
    }
    /**
     * 日志值，转换成文字内容
     * @param i 数据
     * @param type 类型
     * @return 返回中文字符串
     */
    public static String eventDescToString(long i, byte type){
        String result = "";
        if (type == 0x00)
        {
            byte[] bpara = ByteUtils.longToByte(i);
            byte b1 = bpara[0];
            result = result + "�źŵƣ��ڡ�" + b1 + "���ŵƣ����ݣ�";
            switch (bpara[1])
            {
                case 0x00:
                    result = result + "��������";
                    break;
                case 0x01:
                    result = result + "��������";
                    break;
                case 0x02:
                    result = result + "������";
                    break;
                case 0x03:
                    result = result + "���ɿع������";
                    break;
                default:
                    result = result + "��δ֪��";
                    break;
            }
            result = result + "���ڡ�" + bpara[3] + "���ƿذ塣";
        }
        else if (type == 0x01)
        {
            byte[] bpara = ByteUtils.longToByte(i);
            result = result + "�̳�ͻ��";
            switch (bpara[0])
            {
                case 0x00:
                    result = result + "����";
                    break;
                case 0x01:
                    result = result + "�������ͻ";
                    break;
                case 0x02:
                    result = result + "����Ӳ��ͻ";
                    break;
                case 0x03:
                    result = result + "��λ�̳�ͻ";
                    break;
                default:
                    break;
            }
            result = result + ",��ͻ�ƿذ�š�" + bpara[1] + "��,��ͻ����š�" + bpara[2] + "��";
        }
        else if (type == 0x02)
        {
            byte[] bpara = ByteUtils.longToByte(i);
            result = result + "��������ڡ�" + bpara[0] + "����";
            switch (bpara[1])
            {
                case 0x00:
                    result = result + "����";
                    break;
                case 0x01:
                    result = result + "��Ȧ��·";
                    break;
                case 0x02:
                    result = result + "��Ȧ��·";
                    break;
                case 0x03:
                    result = result + "ͨ��ͣ��";
                    break;
                default:
                    break;
            }
            //result = result + ",��ͻ�ƿذ�š�" + bpara[1] + "��,��ͻ����š�" + bpara[2] + "��";
        }
        else if (type == 0x03)
        {
            byte[] bpara = ByteUtils.longToByte(i);
            result = result + "��ѹ��";
            switch (bpara[0])
            {
                case 0x00:
                    result = result + "��ѹ����";
                    break;
                case 0x01:
                    result = result + "��ѹƫ��";
                    break;
                case 0x02:
                    result = result + "��ѹƫ��";
                    break;

                default:
                    break;
            }
            result = result + ",��ѹֵ��" + bpara[1] + "��";
        }
        else if (type == 0x04)
        {
            byte[] bpara = ByteUtils.longToByte(i);
            result = result + "�¶ȣ�";
            switch (bpara[0])
            {
                case 0x00:
                    result = result + "�¶�����";
                    break;
                case 0x01:
                    result = result + "�¶�ƫ��,��Ҫ���ȼ���";
                    break;
                case 0x02:
                    result = result + "�¶�ƫ��,��Ҫ����ɢ��";
                    break;

                default:
                    break;
            }
            result = result + ",�¶�ֵ��" + bpara[1] + "��";
        }
        else if (type == 0x05)
        {
            byte[] bpara = ByteUtils.longToByte(i);
            result = result + "��Դ�壬";
            switch (bpara[0])
            {
                case 0x00:
                    result = result + "����";
                    break;
                case 0x01:
                    result = result + "������ͨ���쳣";
                    switch (bpara[1])
                    {
                        case 0x00:
                            result = result + "��ʱ��û��ͨ�����ݣ�";
                            break;
                        case 0x01:
                            result = result + "��ʱ�����ݴ��󣬵�ַ����";
                            break;
                        case 0x02:
                            result = result + "��ʱ�����ݴ��󣬼������";
                            break;
                        default:
                            break;
                    }
                    break;

                default:
                    break;
            }
            result = result + ",����忨��" + bpara[2] + "��";
        }
        else if (type == 0x06)
        {
            byte[] bpara = ByteUtils.longToByte(i);
            result = result + "�ƿذ壬";
            switch (bpara[0])
            {
                case 0x00:
                    result = result + "����";
                    break;
                case 0x01:
                    result = result + "������ͨ���쳣";
                    switch (bpara[1])
                    {
                        case 0x00:
                            result = result + "��ʱ��û��ͨ�����ݣ�";
                            break;
                        case 0x01:
                            result = result + "��ʱ�����ݴ��󣬵�ַ����";
                            break;
                        case 0x02:
                            result = result + "��ʱ�����ݴ��󣬼������";
                            break;
                        default:
                            break;
                    }
                    break;

                default:
                    break;
            }
            result = result + ",����忨��" + bpara[2] + "��";
        }
        else if (type == 0x07)
        {
            byte[] bpara = ByteUtils.longToByte(i);
            result = result + "�������";
            switch (bpara[0])
            {
                case 0x00:
                    result = result + "����";
                    break;
                case 0x01:
                    result = result + "������ͨ���쳣";
                    switch (bpara[1])
                    {
                        case 0x00:
                            result = result + "��ʱ��û��ͨ�����ݣ�";
                            break;
                        case 0x01:
                            result = result + "��ʱ�����ݴ��󣬵�ַ����";
                            break;
                        case 0x02:
                            result = result + "��ʱ�����ݴ��󣬼������";
                            break;
                        default:
                            break;
                    }
                    break;

                default:
                    break;
            }
            result = result + ",����忨��" + bpara[2] + "��";
        }
        else if (type == 0x08)
        {
            byte[] bpara = ByteUtils.longToByte(i);
            result = result + "��������";
            switch (bpara[0])
            {

                case 0x01:
                    result = result + "���ݹ���";
                    break;
                case 0x02:
                    result = result + "�̳�ͻ����λ��(���ذ��ж�)";
                    break;
                case 0x03:
                    result = result + "���̳�ͻ(�ƿذ��ж�)";
                    break;
                case 0x04:
                    result = result + "ǿ�ƻ���";
                    break;
                case 0x05:
                    result = result + "��������";
                    break;
                case 0x06:
                    result = result + "�����쳣����";
                    break;
                default:
                    break;
            }
            //result = result + ",��ͻ�ƿذ�š�" + bpara[1] + "��,��ͻ����š�" + bpara[2] + "��";
        }
        else if (type == 0x09)
        {
            byte[] bpara = ByteUtils.longToByte(i);
            result = result + "��������";
            switch (bpara[0])
            {
                case 0x00:
                    result = result + "����";
                    break;
                case 0x01:
                    result = result + "�������쳣�ָ�";
                    break;
                case 0x02:
                    result = result + "�Ӻ��̳�ͻ���ϻָ�";
                    break;
                case 0x03:
                    result = result + "�ӵ��ݹ��ϻָ�";
                    break;

                default:
                    break;
            }

        }
        else if (type == 0x0a)
        {

            result = result + "�޸�ʱ�䣬";
            //����ʱ��ת��
            result = result + DateTimeUtils.utcToLocalTimeString(i);

        }
        else if (type == 0x0b)
        {
            byte[] bpara =ByteUtils.longToByte(i);
            result = result + "�ż�⣬";
            switch (bpara[0])
            {
                case 0x00:
                    result = result + "����";
                    break;
                case 0x01:
                    result = result + "����";
                    break;

                default:
                    break;
            }

        }
        else if (type == 0x0c)
        {
            byte[] bpara = ByteUtils.longToByte(i);
            result = result + "�ֶ����ƣ�";
            switch (bpara[0])
            {
                case 0x00:
                    result = result + "�ֶ�";
                    break;
                case 0x01:
                    result = result + "ȥ���ֶ����ָ���������";
                    break;
                case 0x02:
                    result = result + "����";
                    break;
                case 0x03:
                    result = result + "ȥ������";
                    break;
                case 0x04:
                    result = result + "ȫ��";
                    break;
                case 0x05:
                    result = result + "ȥ��ȫ��";
                    break;
                case 0x06:
                    result = result + "����";
                    break;
                default:
                    break;
            }
        }
        else if (type == 0x0d)
        {
            byte[] bpara = ByteUtils.longToByte(i);
            result = result + "�ƿ�����쳣��";
            switch (bpara[0])
            {
                case 0x00:
                    result = result + "������ɫ�쳣";
                    break;
                case 0x01:
                    result = result + "��˸��ɫ�쳣";
                    break;
                default:
                    break;
            }
        }
        else if (type == 0x0e)
        {
            byte[] bpara =ByteUtils.longToByte(i);
            result = result + "�㲥��";
            switch (bpara[0])
            {
                case 0x00:
                    result = result + "�㲥��ַ����";
                    break;
                case 0x01:
                    result = result + "ĳ��ƶ���һյ";
                    break;
                case 0x02:
                    result = result + "��ɫ����";
                    break;
                case 0x03:
                    result = result + "һ��ư����8���̵���";
                    break;
                default:
                    break;
            }
        }
        else if (type == 0x0f)
        {
            byte[] bpara =ByteUtils.longToByte(i);
            result = result + "����������־��";
            switch (bpara[0])
            {

                case 0x01:
                    result = result + "���Ʒ�ʽ�л�";
                    result = result + ",�ɵĿ��Ʒ�ʽ��" + ControlModelUtils.controlModelToString(bpara[1]) + "��,�µĿ��Ʒ�ʽ��" + ControlModelUtils.controlModelToString(bpara[2]) + "��,";
                    switch (bpara[3])
                    {
                        case 0x00:
                            result = result + "�����л�(��λ������ ʱ�α� ���)";
                            break;
                        case 0x01:
                            result = result + "�쳣�л�  ����";
                            break;

                        default:
                            result = result + "δ֪";
                            break;
                    }
                    break;
                case 0x02:
                    result = result + "���ϻָ���";
                    switch (bpara[1])
                    {
                        case 0x00:
                            result = result + "����";
                            break;
                        case 0x02:
                            result = result + "�������쳣�ָ�";
                            break;
                        case 0x03:
                            result = result + "�Ӻ��̳�ͻ���ϻָ�";
                            break;
                        case 0x01:
                            result = result + "�ӵ��ݹ��ϻָ�";
                            break;
                        default:
                            result = result + "δ֪";
                            break;
                    }
                    break;
                default:
                    break;
            }

        }
        else if (type == 0x10)
        {
           // byte[] bpara = ByteUtils.longToByte(i);
            result = result + "����ͨ���쳣���������𣬲�Ӱ���źŻ��������С�";
        }
        return result;
    }
}
