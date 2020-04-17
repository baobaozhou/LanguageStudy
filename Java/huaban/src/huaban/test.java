package huaban;
import java.awt.*;
import javax.swing.*;
public class test {
	public static void main(String[] args)
	{
		JFrame f=new JFrame();
		f.setTitle("Paintbord");
		f.setBounds(100,50,300,300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setContentPane(new MyPanel());
		f.setVisible(true);
	}

}
class MyPanel extends JPanel{
	public void paint(Graphics g) {
	    //Graphics2D g2 = (Graphics2D) g.create();
	    //Graphics2D g1 = (Graphics2D) g.create();
	    g.setColor(Color.blue);
		g.drawLine(50, 50, 300, 50);
		g.setColor(Color.green);
		g.drawRect(60, 60, 70, 150);
		g.drawOval(150,60,100,150);
	}
}
