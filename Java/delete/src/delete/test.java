package delete;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class test {
	 public static void clearComment (File file, String charset) {
	       try{
	        	if (!file.exists()) {
	                return;
	        	}
	        	System.out.println("��ʼ�����ļ�");//��Ϊcontent���Ͳ���ֱ�ӽ���ɾ����
	        	                                   //���ǰ��ļ���Ķ�����tmp��ʽ����content���
	        	                                   //Ȼ��ת��Ϊstring���ͽ��в���
	        	 BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
	             StringBuffer content = new StringBuffer();
	             String tmp = null;
	             while ((tmp = reader.readLine()) != null) {
	                 content.append(tmp);
	                 content.append("\n");
	             }
	             String target = content.toString();
	             String s = target.replaceAll("//", "");
	             BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset));
	             out.write(s);
	             out.flush();
	             out.close();
	             System.out.println("�ļ��������");
	         } catch (Exception e) {
	             e.printStackTrace();
	         }
	 }


	        public static void main(String[] args) {
	        	clearComment(new File("D:\\main.java"), "UTF-8");
	            
	        }
}
	    
	     


