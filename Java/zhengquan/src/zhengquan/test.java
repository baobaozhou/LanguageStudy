package zhengquan;
import java.awt.*;
import javax.swing.*;
public class test extends JFrame {

		public static void main(String[] args) {
			new test();// ����ʵ��,��ʼ������
		}
		JButton jb1, jb2;
		JTextField jf1;
		JPasswordField jpsw;

		public test() {// ��ʼ������
			JPanel jp1 = new JPanel();
			JLabel jl1 = new JLabel("�˺�:", SwingConstants.CENTER);// ���־���
			jf1 = new JTextField(10);
			jp1.add(jl1);
			jp1.add(jf1);

			JPanel jp2 = new JPanel();
			JLabel jl2 = new JLabel("����:", SwingConstants.CENTER);
			jpsw = new JPasswordField(10);
			jp2.add(jl2);
			jp2.add(jpsw);

			JPanel jp3 = new JPanel();
			jb1 = new JButton("ȷ��");
			jb2 = new JButton("ȡ��");
			jp3.add(jb1);
			jp3.add(jb2);

			setLayout(new GridLayout(3, 1, 20, 10));//��񲼾� 3��1��  ˮƽ���20 ��ֱ���10
			add(jp1);
			add(jp2);
			add(jp3);

			this.setSize(230, 170);// ��С
			setLocationRelativeTo(null);// ����
			this.setResizable(false);// ��������
			this.setTitle("��ͼ����");// ������
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);// �˳��͹رս���
			this.setVisible(true);
		}
		
}
