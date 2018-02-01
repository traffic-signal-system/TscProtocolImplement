package cn.com.aiton.gbt20999.services.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

import cn.com.aiton.gbt20999.domain.GbtCollision;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.services.CollisionService;
import cn.com.aiton.gbt20999.utils.ByteUtils;
import cn.com.aiton.gbt20999.utils.CheckGbt;
import cn.com.aiton.gbt20999.utils.GbtDefine;
import cn.com.aiton.gbt20999.utils.UdpClientSocket;


public class CollisionServiceImpl implements CollisionService{

  
    @Override
    public List<GbtCollision> getCollisionBy16Phase(TscNode node) {
        List<GbtCollision> gbtCollisions = new ArrayList<GbtCollision>();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_COLLISION);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("����˻�Ӧ���ݣ�" + info);
            if(!CheckGbt.check(bytes,"Collision16")){
                return null;
            }
            byte[] objectArray = new byte[bytes[3] * GbtDefine.GBT20999_COLLISION_BYTE_SIZE];
            System.arraycopy(bytes,4,objectArray,0,objectArray.length);
            byte[][] collisionArrayResult = ByteUtils.oneArrayToTwoArray(objectArray, GbtDefine.COLLISION_RESULT_LENGTH, GbtDefine.GBT20999_COLLISION_BYTE_SIZE);
            for(int i=0; i< bytes[3] ;i++){
                GbtCollision gbtCollision = new GbtCollision();
                
                gbtCollision.setPhaseId(collisionArrayResult[i][0]);
                byte[] flag = new byte[]{collisionArrayResult[i][1] ,collisionArrayResult[i][2]};
                gbtCollision.setFlag(ByteUtils.byteToShort(flag));
                gbtCollisions.add(gbtCollision);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return gbtCollisions;
    }

    @Override
    public List<GbtCollision> getCollisionBy32Phase(TscNode node) {
        List<GbtCollision> gbtCollisions = new ArrayList<GbtCollision>();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_COLLISION);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByASCII(info);
            //System.out.println("����˻�Ӧ���ݣ�" + info);
            if(!CheckGbt.check(bytes,"Collision32")){
                return null;
            }
            byte[] objectArray = new byte[bytes[3] * GbtDefine.COLLISION_BYTE_SIZE];
            System.arraycopy(bytes,4,objectArray,0,objectArray.length);
            byte[][] collisionArrayResult = ByteUtils.oneArrayToTwoArray(objectArray, GbtDefine.COLLISION_RESULT_LENGTH, GbtDefine.COLLISION_BYTE_SIZE);
            for(int i=0; i< bytes[3] ;i++){
                GbtCollision gbtCollision = new GbtCollision();
                //gbtCollision.setDeviceId(node.getId());
                gbtCollision.setPhaseId(collisionArrayResult[i][0]);
                byte[] flag = new byte[]{collisionArrayResult[i][1] ,collisionArrayResult[i][2],collisionArrayResult[i][3],collisionArrayResult[i][4]};
                gbtCollision.setFlag(ByteUtils.byteToInt(flag));
                gbtCollisions.add(gbtCollision);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return gbtCollisions;
    }

    @Override
    public Message setCollision(List<GbtCollision> gbtCollisions ,TscNode node) {
        Message message = new Message();
        try{
            byte[] hex = ArrayUtils.add(GbtDefine.SET_COLLISION_RESPONSE, (byte) GbtDefine.COLLISION_RESULT_LENGTH);
            Iterator<GbtCollision>  gbtCollisionIterator = gbtCollisions.iterator();
            while(gbtCollisionIterator.hasNext()){
                GbtCollision gbtCollision = gbtCollisionIterator.next();
                byte[] flag = ByteUtils.intToByte(gbtCollision.getFlag());

                byte[] phaseId = {gbtCollision.getPhaseId()};
                byte[] objectArray = ArrayUtils.addAll(phaseId,flag);
                hex = ArrayUtils.addAll(hex,objectArray);
            }
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), hex);
            String info = client.receive(node.getIpAddress(), node.getPort());
           // byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            System.out.println("����˻�Ӧ���ݣ�" + info);
//TODO   ��д�Ƿ�ɹ�����
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return message;
    }
}
