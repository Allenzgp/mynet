package com_gopane02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //创建接收端DatagramSocket对象
        // DatagramSocket​(int port)
        //构造数据报套接字并将其绑定到本地主机上的指定端口。
        //int port = 10086;
        DatagramSocket ds = new DatagramSocket(10086);

        //创建一个数据包,用于接收数据
        //DatagramPacket​(byte[] buf, int length)
        //构造一个 DatagramPacket用于接收长度为 length数据包。
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys, bys.length);

        //调用DatagramSocket对象的方法接受数据
        ds.receive(dp);

        //解析数据包,并在数据控制区显示
        /*byte[] datas = dp.getData();
        int len = dp.getLength();
        String dataString = new String(datas,0,len);
        System.out.println("数据是："+dataString);*/
        //int getLength​() 返回要发送的数据的长度或接收到的数据的长度。
        //int len = dp.getLength();
        //String datastring = new String(datas,0,len);
        //System.out.println("数据是："+datastring);
        System.out.println("数据是："+ new String(dp.getData(),0,dp.getLength()));

        //关闭接收数据
        ds.close();
    }
}