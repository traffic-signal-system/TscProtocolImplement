package cn.com.aiton.gbt20999.utils;

/**
 * Created by Administrator on 2016/11/21.
 */
public class DirectIdToDirectUtil {

    public static String getDirect(int i){
        switch(i){
            case 1:   return "北左";
            case 2:   return "北直";
            case 4:   return "北右";
            case 8:   return "北人行";
            case 65:  return "东左";
            case 66:  return "东直";
            case 68:  return "东右";
            case 72:  return "东人行";
            case 129: return "南左";
            case 130: return "南直";
            case 132: return "南右";
            case 136: return "南人行";
            case 193: return "西左";
            case 194: return "西直";
            case 196: return "西右";
            case 200: return "西人行";
            case 24:  return "北人行2";
            case 88:  return "东人行2";
            case 152: return "南人行2";
            case 216: return "西人行2";
            case 0:   return "北调头";
            case 64:  return "东调头";
            case 128: return "南调头";
            case 192: return "西调头";
            case 7:   return "北特殊";
            case 71:  return "东特殊";
            case 135: return "南特殊";
            case 199: return "西特殊";
            case 5:   return "北其他";
            case 69:  return "东其他";
            case 133: return "南其他";
            case 197: return "西其他";
        }
        return null;
    }

}
