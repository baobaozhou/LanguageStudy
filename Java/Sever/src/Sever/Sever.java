
import java.io .IOException;
import java.net .DatagramPacket;
import java.net .DatagramSocket;
import java.net .InetAddress;
import java.net .SocketException;
public class Sever extends Thread {
	private int initPort; // 监听的端口号
	private DatagramSocket serverSocket; // 数据包套接字
	private DatagramPacket receivePacket; // 接受到的数据分组
	private byte[] buffer = new byte[1024]; // 数据包使用的缓冲区
	public Sever(int initPort) {
		this.initPort = initPort;
		}
	public void run() {

		System.out.println("服务端");
		System.out.println("现在开始执行");


		try {
		// 根据输入的监听端口生成server端DatagramSocket实例
		serverSocket = new DatagramSocket(initPort);

		} catch (SocketException e1) {

		// 捕获到此异常一般是输入的端口非法，或者被占用
		System.out.println("监听端口" + initPort
		+ "失败，端口非法或已被占用，请重新启动输入其他有效空闲端口");
		e1.printStackTrace();
		System.exit(0);// 中止程序
		}

		// 死循环，不断的监听是否有请求数据
		while (true) {
		receivePacket = new DatagramPacket(buffer, buffer.length); // 生成接收数据报包实例
		// 监听是否有用户发出新的request连接到PingServer
		// 程序会陷入到该语句，知道有新的连接产生
		try {
		serverSocket.receive(receivePacket);
		} catch (IOException e) {
		System.out.println("分组接受异常");
		e.printStackTrace();
		}
		ServerThread thread = new ServerThread(serverSocket, receivePacket);// 到此步说明有新的请求了，此时生成一个新的服务线程
		thread.start();// 启动线程
		}
		}
		@Override
		public void destroy() {
		serverSocket.close();// 回收资源
		}

		public static void main(String[] args) throws Exception {

		Sever pingServer = new Sever(Integer.valueOf(args[0]));// 初始化服务器
		pingServer.start();
		}
		}
		class ServerThread extends Thread {

		private DatagramPacket receivePacket; // 接受到的数据分组
		private DatagramSocket serverSocket; // 数据包套接字

		public ServerThread(DatagramSocket serverSocket,
		DatagramPacket receivePacket) {
		this.receivePacket = receivePacket;
		this.serverSocket = serverSocket;
		}

		public DatagramPacket getReceivePacket() {
		return receivePacket;
		}

		public void setReceivePacket(DatagramPacket receivePacket) {
		this.receivePacket = receivePacket;
		}
		public DatagramSocket getServerSocket() {
		return serverSocket;
		}
		public void setServerSocket(DatagramSocket serverSocket) {
		this.serverSocket = serverSocket;
		}

		public void run() {
		byte[] buffer = new byte[4096]; // 数缓冲区
		long randomTime = (long) (Math.random() * 2000); // 到此步说明接收到新连接，在此生成随机数，模拟传输延迟
		String sentence = null;// 接收到的数据
		try {
		sleep(randomTime);// 休眠睡眠，用于模拟传输延迟
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
		if (randomTime > 1000) { // 如果随机数大于1000，模拟数据包丢失
		sentence = "data lose\n"; // 数据丢失的信息
		} else {	
		sentence = (new String(receivePacket.getData())).substring(0, 100);// 将数据从缓冲区轮换成字符串	
		}
		InetAddress host = receivePacket.getAddress(); // 获取客户端的ip地址
		int port = receivePacket.getPort(); // 获取客户端的通讯端口
		buffer = sentence.getBytes(); // 请求数据转换成byte数组，用于发回客户端
		DatagramPacket sendPacket = new DatagramPacket(buffer, buffer.length,
		host, port); // 生成数据包，已经保存好发送目的地的地址和端口了
		try {
		serverSocket.send(sendPacket);// 发送数据给客户端
		} catch (Exception e) {
		e.printStackTrace();
		}
		System.out.println(sentence); // 显示请求结果

		}

}
