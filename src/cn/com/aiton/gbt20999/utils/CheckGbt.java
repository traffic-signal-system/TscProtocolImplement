package cn.com.aiton.gbt20999.utils;

/**
 * Created by Administrator on 14-2-14.
 */
public class CheckGbt {
    public static boolean check(byte[] bytes,String fun)
    {
        if (bytes[0] == 0x86)
        {
            if (bytes[1] == 0x05)
            {
              //  MessageBox.Show(fun+":����ͨ��Э����������е���������ԭ��");
                return false;
            }
            else if (bytes[1] == 0x01)
            {
               // MessageBox.Show(fun + ":����ͨ��Э����������е���Ϣ����̫����");
                return false;
            }
            else if (bytes[1] == 0x02)
            {
               // MessageBox.Show(fun + ":����ͨ��Э����������е���Ϣ���ʹ���");
                return false;
            }
            else if (bytes[1] == 0x03)
            {
               /// MessageBox.Show(fun + ":����ͨ��Э����������е���Ϣ���ö���ֵ�����涨�ķ�Χ��");
                return false;
            }
            else if (bytes[1] == 0x04)
            {
              //  MessageBox.Show(fun + ":����ͨ��Э����������е���Ϣ����̫�̣�");
                return false;
            }
            else
            {
               // MessageBox.Show(fun + ":δ֪ԭ��");
                return false;
            }
        }
        return true;
    }
}
