package cn.com.aiton.gbt20999.domain;

/**
 * 操作信息类，对于一个设置操作返回是否成功，及原因的实体对象
 * Created by Administrator on 14-2-14.
 */
public class Message {
	//对象名称
    private String obj;
	//消息内容
    private String msg;
	//是否成功
    private boolean boo;

    public Message() {
    }

    public Message(String obj, String msg, boolean boo) {
        this.obj = obj;
        this.msg = msg;
        this.boo = boo;
    }

    @Override
    public String toString() {
        return "Message{" +
                "obj='" + obj + '\'' +
                ", msg='" + msg + '\'' +
                ", boo=" + boo +
                '}';
    }

    public String getObj() {
        return obj;
    }

    public void setObj(String obj) {
        this.obj = obj;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isBoo() {
        return boo;
    }

    public void setBoo(boolean boo) {
        this.boo = boo;
    }
}
