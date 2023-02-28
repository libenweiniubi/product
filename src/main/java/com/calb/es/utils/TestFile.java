package com.calb.es.utils;

import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.client.mqttv3.MqttException;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

@Slf4j
public class TestFile {
    public static void main(String[] args) throws MqttException {

        String path = "D:\\test.txt";
        int bufSize = 1024;//1K缓冲区
        File file = new File(path);
        if(!file.exists()){
            log.error("文件不存在:"+path);
            return;
        }

        /*
         * 通道就是为操作文件而建立的一个连接。（读写文件、内存映射等）
         * 此处的getChannel()可以获取通道；
         * 用FileChannel.open(filename)也可以创建一个通道。
         * "r"表示只读。
         *
         * RandomAccessFile是独立与I/O流家族的类，其父类是Object。
         * 该类因为有个指针可以挪动，所以，可以从任意位置开始读取文件数据。
         * **/
        try {
            FileChannel fcin = new RandomAccessFile(file, "r").getChannel();
            //给字节缓冲区分配大小
            ByteBuffer rBuffer = ByteBuffer.allocate(bufSize);
            String enterStr = "\n";
            byte[] bs = new byte[bufSize];
            String tempString = null;
            byte[] result = new byte[0];
            while (fcin.read(rBuffer) != -1) {//每次读1k到缓冲区
                int rSize = rBuffer.position();//记录缓冲区当前位置
                rBuffer.rewind();//位置归零，标记取消，方便下次循环重新读入缓冲区。
                rBuffer.get(bs);//将缓冲区数据读到字节数组中
                rBuffer.clear();//清除缓冲
//                System.out.println(bs);
                result = addBytes(result,bs);
                /*
                 * 用默认编码将指定字节数组的数据构造成一个字符串
                 * bs:指定的字节数组，0：数组起始位置；rSize：数组结束位置
                 * */
//                tempString = new String(bs, 0, rSize);
//                int fromIndex = 0;//每次读的开始位置
//                int endIndex = 0;//每次读的结束位置
//                //按行读String数据
//                while ((endIndex = tempString.indexOf(enterStr, fromIndex)) != -1) {
//                    String line = tempString.substring(fromIndex, endIndex);//转换一行
//                    System.out.print(line);
//                    fromIndex = endIndex + 1;
//                }
            }

            FileUtil.getFile(result,"D:\\20220621","aaa.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**

     *

     * @param data1

     * @param data2

     * @return data1 与 data2拼接的结果

     */
    public static byte[] addBytes(byte[] data1, byte[] data2) {
        byte[] data3 = new byte[data1.length + data2.length];
        System.arraycopy(data1, 0, data3, 0, data1.length);
        System.arraycopy(data2, 0, data3, data1.length, data2.length);
        return data3;

    }
}
