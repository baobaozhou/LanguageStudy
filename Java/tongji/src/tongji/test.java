package tongji;
import java.util.Scanner;
import java.util.HashMap;
public class test {
		public static void test(String s){
			HashMap<String, Integer> map = new HashMap<String, Integer>();//map��������ͬԪ�س��֣��Զ��ж�������map��һ��string��Ӧ��һ��int
			String arr[]=s.split(" ");//�����ַ����������ַ����ָ��ɵ���
			for(int i=0;i<arr.length;++i) map.put(arr[i], 1);//�����������ַ�������map�У�ÿ�μ�1������ͳ���ַ���
			System.out.println(map.size());
		}
		public static void main(String[] args) {
			Scanner ss=new Scanner(System.in);
			String s=new String();
			s=ss.nextLine();//nextline���з���
			test(s);
		}
	}

//OK