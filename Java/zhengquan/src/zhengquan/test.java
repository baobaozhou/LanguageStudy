package zhengquan;
import java.awt.*;
import javax.swing.*;
public class test extends JFrame {

		public static void main(String[] args) {
			new test();// 创建实例,初始化界面
		}
		JButton jb1, jb2;
		JTextField jf1;
		JPasswordField jpsw;

		public test() {// 初始化界面
			JPanel jp1 = new JPanel();
			JLabel jl1 = new JLabel("账号:", SwingConstants.CENTER);// 文字居中
			jf1 = new JTextField(10);
			jp1.add(jl1);
			jp1.add(jf1);

			JPanel jp2 = new JPanel();
			JLabel jl2 = new JLabel("密码:", SwingConstants.CENTER);
			jpsw = new JPasswordField(10);
			jp2.add(jl2);
			jp2.add(jpsw);

			JPanel jp3 = new JPanel();
			jb1 = new JButton("确定");
			jb2 = new JButton("取消");
			jp3.add(jb1);
			jp3.add(jb2);

			setLayout(new GridLayout(3, 1, 20, 10));//表格布局 3行1列  水平间距20 垂直间距10
			add(jp1);
			add(jp2);
			add(jp3);

			this.setSize(230, 170);// 大小
			setLocationRelativeTo(null);// 居中
			this.setResizable(false);// 不可缩放
			this.setTitle("视图界面");// 标题名
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);// 退出就关闭界面
			this.setVisible(true);
		}
		
}
