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
	        	System.out.println("开始处理文件");//因为content类型不能直接进行删除，
	        	                                   //我们把文件里的东西以tmp形式读到content里边
	        	                                   //然后转化为string类型进行操作
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
	             System.out.println("文件处理完成");
	         } catch (Exception e) {
	             e.printStackTrace();
	         }
	 }


	        public static void main(String[] args) {
	        	clearComment(new File("D:\\main.java"), "UTF-8");
	            
	        }
}
	    
	     


