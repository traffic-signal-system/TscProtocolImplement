package cn.com.aiton.gbt20999.utils;

/**
 * Created by Administrator on 14-2-14.
 * 对国标20999的信号机返回数据进行校验
 */
public class CheckGbt {
	/**
	 * //  MessageBox.Show(fun+":����ͨ��Э����������е���������ԭ��");
	 * // MessageBox.Show(fun + ":����ͨ��Э����������е���Ϣ����̫����");
	 *  // MessageBox.Show(fun + ":����ͨ��Э����������е���Ϣ���ʹ���");
	 *  /// MessageBox.Show(fun + ":����ͨ��Э����������е���Ϣ���ö���ֵ�����涨�ķ�Χ��");
	 *  //  MessageBox.Show(fun + ":����ͨ��Э����������е���Ϣ����̫�̣�");
	 *  // MessageBox.Show(fun + ":δ֪ԭ��");
	 * @param bytes
	 * @param fun
	 * @return
	 */
    public static boolean check(byte[] bytes,String fun)
    {
        if (bytes[0] == 0x86)
        {
            if (bytes[1] == 0x05)
            {
              
                return false;
            }
            else if (bytes[1] == 0x01)
            {
               
                return false;
            }
            else if (bytes[1] == 0x02)
            {
              
                return false;
            }
            else if (bytes[1] == 0x03)
            {
               
                return false;
            }
            else if (bytes[1] == 0x04)
            {
              
                return false;
            }
            else
            {
               
                return false;
            }
        }
        return true;
    }
}
