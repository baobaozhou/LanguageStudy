
import java.io .IOException;
import java.net .DatagramPacket;
import java.net .DatagramSocket;
import java.net .InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.Scanner;
//客户
public class Client {
	public static void main(String[] args) throws Exception {
//	Scanner scanner = new Scanner(System.in );// 接收从系统指定输入方式输入的数据（默认System.in 为键盘）
	String host = args[0]; //scanner.nextLine(); // 获取服务器端所在的主机地址
	int port = Integer.valueOf(args[1]);//scanner.nextInt(); // 获取服务器端监听的端口号
	Long[] rtt = new Long[10]; // 用于存储rtt，用于最后的统计
	for (int i = 1; i <= 10; i++) { // 模拟发送10条请求
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SS"); // 时间戳格式
	Date sendBefore = new Date(); // 记录发送前时间
	String sentence = "请求次数 " + i
	+ " \n" // 模拟用的请求数据
	+ "开始请求:" + i + " 时间:"
	+ sdf.format(sendBefore) + "\n";
	DatagramSocket clientSocket = new DatagramSocket(); // 生成客户端DatagramSocket实例
	InetAddress IPAddress = InetAddress.getByName(host); // 生成ip地址实例
	byte[] buffer = new byte[1024]; // 数据包使用的缓冲区
	buffer = sentence.getBytes(); // 将请求数据放进缓冲区内
	DatagramPacket sendPacket = new DatagramPacket(buffer,
	buffer.length, IPAddress, port); // 生成发送数据包实例
	clientSocket.send(sendPacket); // 发送到服务器端	
	DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length); // 生成接收数据包实例	
	try { // 接收从服务端返回的数据包
	clientSocket.receive(receivePacket);
	} catch (IOException e) {
	System.out.println("分组接受异常");
	e.printStackTrace();
	}
	String receiveSentence = new String(receivePacket.getData()); //  将数据从缓冲区轮换成字符串	
	Date receiveAfter = new Date(); // 记录接收后的时间	
	rtt[i - 1] = receiveAfter.getTime() - sendBefore.getTime(); // 计算rtt	
	if(	rtt[i - 1] > 1000){ //如果接收时间大约1000ms，视为数据包丢失
	rtt[i - 1] = (long) 1000;
	receiveSentence = "data lose\n";
	}	
	System.out.println(receiveSentence);	//显示从server返回的数据端	
	System.out.println("rtt:" + rtt[i - 1]); // 显示rtt	
	clientSocket.close(); // 关闭socket
	}
	// 统计出平均rtt,最大rtt和最小rtt
	long sumRtt = 0;
	long maxRtt = 0;
	long minRtt = rtt[0];
	for (int i = 0; i < 10; i++) {
	if (rtt[i] > maxRtt) {
	maxRtt = rtt[i];
	}
	if (rtt[i] < minRtt) {
	minRtt = rtt[i];
	}
	sumRtt += rtt[i];
	}
	System.out.println("平均rtt: " + sumRtt / 10 + " 秒");
	System.out.println("最大RTT: " + maxRtt);
	System.out.println("最小RTT: " + minRtt);
	}

}
