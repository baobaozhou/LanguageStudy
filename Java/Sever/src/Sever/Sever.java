
import java.io .IOException;
import java.net .DatagramPacket;
import java.net .DatagramSocket;
import java.net .InetAddress;
import java.net .SocketException;
public class Sever extends Thread {
	private int initPort; // �����Ķ˿ں�
	private DatagramSocket serverSocket; // ���ݰ��׽���
	private DatagramPacket receivePacket; // ���ܵ������ݷ���
	private byte[] buffer = new byte[1024]; // ���ݰ�ʹ�õĻ�����
	public Sever(int initPort) {
		this.initPort = initPort;
		}
	public void run() {

		System.out.println("�����");
		System.out.println("���ڿ�ʼִ��");


		try {
		// ��������ļ����˿�����server��DatagramSocketʵ��
		serverSocket = new DatagramSocket(initPort);

		} catch (SocketException e1) {

		// ���񵽴��쳣һ��������Ķ˿ڷǷ������߱�ռ��
		System.out.println("�����˿�" + initPort
		+ "ʧ�ܣ��˿ڷǷ����ѱ�ռ�ã���������������������Ч���ж˿�");
		e1.printStackTrace();
		System.exit(0);// ��ֹ����
		}

		// ��ѭ�������ϵļ����Ƿ�����������
		while (true) {
		receivePacket = new DatagramPacket(buffer, buffer.length); // ���ɽ������ݱ���ʵ��
		// �����Ƿ����û������µ�request���ӵ�PingServer
		// ��������뵽����䣬֪�����µ����Ӳ���
		try {
		serverSocket.receive(receivePacket);
		} catch (IOException e) {
		System.out.println("��������쳣");
		e.printStackTrace();
		}
		ServerThread thread = new ServerThread(serverSocket, receivePacket);// ���˲�˵�����µ������ˣ���ʱ����һ���µķ����߳�
		thread.start();// �����߳�
		}
		}
		@Override
		public void destroy() {
		serverSocket.close();// ������Դ
		}

		public static void main(String[] args) throws Exception {

		Sever pingServer = new Sever(Integer.valueOf(args[0]));// ��ʼ��������
		pingServer.start();
		}
		}
		class ServerThread extends Thread {

		private DatagramPacket receivePacket; // ���ܵ������ݷ���
		private DatagramSocket serverSocket; // ���ݰ��׽���

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
		byte[] buffer = new byte[4096]; // ��������
		long randomTime = (long) (Math.random() * 2000); // ���˲�˵�����յ������ӣ��ڴ������������ģ�⴫���ӳ�
		String sentence = null;// ���յ�������
		try {
		sleep(randomTime);// ����˯�ߣ�����ģ�⴫���ӳ�
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
		if (randomTime > 1000) { // ������������1000��ģ�����ݰ���ʧ
		sentence = "data lose\n"; // ���ݶ�ʧ����Ϣ
		} else {	
		sentence = (new String(receivePacket.getData())).substring(0, 100);// �����ݴӻ������ֻ����ַ���	
		}
		InetAddress host = receivePacket.getAddress(); // ��ȡ�ͻ��˵�ip��ַ
		int port = receivePacket.getPort(); // ��ȡ�ͻ��˵�ͨѶ�˿�
		buffer = sentence.getBytes(); // ��������ת����byte���飬���ڷ��ؿͻ���
		DatagramPacket sendPacket = new DatagramPacket(buffer, buffer.length,
		host, port); // �������ݰ����Ѿ�����÷���Ŀ�ĵصĵ�ַ�Ͷ˿���
		try {
		serverSocket.send(sendPacket);// �������ݸ��ͻ���
		} catch (Exception e) {
		e.printStackTrace();
		}
		System.out.println(sentence); // ��ʾ������

		}

}
