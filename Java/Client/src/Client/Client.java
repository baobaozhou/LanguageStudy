
import java.io .IOException;
import java.net .DatagramPacket;
import java.net .DatagramSocket;
import java.net .InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.Scanner;
//�ͻ�
public class Client {
	public static void main(String[] args) throws Exception {
//	Scanner scanner = new Scanner(System.in );// ���մ�ϵͳָ�����뷽ʽ��������ݣ�Ĭ��System.in Ϊ���̣�
	String host = args[0]; //scanner.nextLine(); // ��ȡ�����������ڵ�������ַ
	int port = Integer.valueOf(args[1]);//scanner.nextInt(); // ��ȡ�������˼����Ķ˿ں�
	Long[] rtt = new Long[10]; // ���ڴ洢rtt����������ͳ��
	for (int i = 1; i <= 10; i++) { // ģ�ⷢ��10������
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SS"); // ʱ�����ʽ
	Date sendBefore = new Date(); // ��¼����ǰʱ��
	String sentence = "������� " + i
	+ " \n" // ģ���õ���������
	+ "��ʼ����:" + i + " ʱ��:"
	+ sdf.format(sendBefore) + "\n";
	DatagramSocket clientSocket = new DatagramSocket(); // ���ɿͻ���DatagramSocketʵ��
	InetAddress IPAddress = InetAddress.getByName(host); // ����ip��ַʵ��
	byte[] buffer = new byte[1024]; // ���ݰ�ʹ�õĻ�����
	buffer = sentence.getBytes(); // ���������ݷŽ���������
	DatagramPacket sendPacket = new DatagramPacket(buffer,
	buffer.length, IPAddress, port); // ���ɷ������ݰ�ʵ��
	clientSocket.send(sendPacket); // ���͵���������	
	DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length); // ���ɽ������ݰ�ʵ��	
	try { // ���մӷ���˷��ص����ݰ�
	clientSocket.receive(receivePacket);
	} catch (IOException e) {
	System.out.println("��������쳣");
	e.printStackTrace();
	}
	String receiveSentence = new String(receivePacket.getData()); //  �����ݴӻ������ֻ����ַ���	
	Date receiveAfter = new Date(); // ��¼���պ��ʱ��	
	rtt[i - 1] = receiveAfter.getTime() - sendBefore.getTime(); // ����rtt	
	if(	rtt[i - 1] > 1000){ //�������ʱ���Լ1000ms����Ϊ���ݰ���ʧ
	rtt[i - 1] = (long) 1000;
	receiveSentence = "data lose\n";
	}	
	System.out.println(receiveSentence);	//��ʾ��server���ص����ݶ�	
	System.out.println("rtt:" + rtt[i - 1]); // ��ʾrtt	
	clientSocket.close(); // �ر�socket
	}
	// ͳ�Ƴ�ƽ��rtt,���rtt����Сrtt
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
	System.out.println("ƽ��rtt: " + sumRtt / 10 + " ��");
	System.out.println("���RTT: " + maxRtt);
	System.out.println("��СRTT: " + minRtt);
	}

}
