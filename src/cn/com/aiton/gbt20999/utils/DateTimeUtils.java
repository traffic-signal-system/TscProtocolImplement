package cn.com.aiton.gbt20999.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/**
 * Created by Administrator on 14-2-15.
 */
public class DateTimeUtils {
    private static DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss") ;

         
         /**
          * 取北京时间
          * @return
          */
         public static String getBeijingTime(){
             return getFormatedDateString(8);
         }
         
         /**
          * 取班加罗尔时间
          * @return
          */
         public static String getBangaloreTime(){
             return getFormatedDateString(5.5f);
         }
         
         /**
          * 取纽约时间
          * @return
          */
         public static String getNewyorkTime(){
             return getFormatedDateString(-5);
         }
         
         /**
          * 此函数非原创，从网上搜索而来，timeZoneOffset原为int类型，为班加罗尔调整成float类型
          * timeZoneOffset表示时区，如中国一般使用东八区，因此timeZoneOffset就是8
          * @param timeZoneOffset
          * @return
          */
         public static String getFormatedDateString(float timeZoneOffset){
             if (timeZoneOffset > 13 || timeZoneOffset < -12) {
                 timeZoneOffset = 0;
             }
             
             int newTime=(int)(timeZoneOffset * 60 * 60 * 1000);
             TimeZone timeZone;
             String[] ids = TimeZone.getAvailableIDs(newTime);
             if (ids.length == 0) {
                 timeZone = TimeZone.getDefault();
             } else {
                 timeZone = new SimpleTimeZone(newTime, ids[0]);
             }
         
             SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
             sdf.setTimeZone(timeZone);
             return sdf.format(new Date());
         }
    /**
     * �õ�UTCʱ�䣬����Ϊ�ַ�������ʽΪ"yyyy-MM-dd HH:mm"
     * �����ȡʧ�ܣ�����null
     * @param time
     * @return
     */
    public static String utcToLocalTimeString(long time){
        StringBuffer UTCTimeBuffer = new StringBuffer();
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(time);
        // 2��ȡ��ʱ��ƫ������
        int zoneOffset = cal.get(java.util.Calendar.ZONE_OFFSET);
        // 3��ȡ������ʱ�
        int dstOffset = cal.get(java.util.Calendar.DST_OFFSET);
        // 4���ӱ���ʱ����۳���Щ������������ȡ��UTCʱ�䣺
        cal.add(java.util.Calendar.MILLISECOND, -(zoneOffset + dstOffset));
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH)+1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        UTCTimeBuffer.append(year).append("-").append(month).append("-").append(day) ;
        UTCTimeBuffer.append(" ").append(hour).append(":").append(minute).append(":").append(second) ;
        try{
            format.parse(UTCTimeBuffer.toString()) ;
            return UTCTimeBuffer.toString() ;
        }catch(ParseException e)
        {
            e.printStackTrace() ;
        }
        return null ;
    }
    /**
     * ��UTCʱ��ת��Ϊ������ʱ��
     * @param UTCTime
     * @return
     */
    public static String getLocalTimeFromUTC(String UTCTime){
        java.util.Date UTCDate = null ;
        String localTimeStr = null ;
        try {
            UTCDate = format.parse(UTCTime);
            format.setTimeZone(TimeZone.getTimeZone("GMT-8")) ;
            localTimeStr = format.format(UTCDate) ;
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return localTimeStr ;
    }
}
