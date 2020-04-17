package Copytwo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class TextConbine {
	public static void main(String[] args) throws IOException{
        BufferedWriter writer = new BufferedWriter( new OutputStreamWriter( new FileOutputStream(new File("D:\\test\\3.txt")),"GBK"));
        String filePath = "D:/test";
        List<String> fileList = new ArrayList<String>();
        fileList= getFiles(filePath);
        for (String file:fileList) {
            BufferedReader reader = new BufferedReader( new InputStreamReader( new FileInputStream( new File(file)),"GBK"));
            String s=null;
            while ((s=reader.readLine())!=null) {
                writer.append(s);
            }
        }

        writer.close();
    }
    static List<String> getFiles( String filePath )
    {
        List<String> filelist = new ArrayList<String>();
        File root = new File( filePath );
        File[] files = root.listFiles();
        for ( File file : files )
        {
            if ( file.isDirectory() )
            {
                getFiles( file.getAbsolutePath() );
                filelist.add( file.getAbsolutePath() );
                //System.out.println( "显示" + filePath + "下所有子目录及其文件" + file.getAbsolutePath() );
            }else{
                filelist.add( file.getAbsolutePath() );
                //System.out.println("显示" + filePath + "下所有子目录" + file.getAbsolutePath() );
            }
        }
        return filelist;
    }

}
