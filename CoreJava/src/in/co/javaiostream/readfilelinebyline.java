package in.co.javaiostream;


import java.io.FileReader;
import java.io.IOException;

public class readfilelinebyline {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
     FileReader file=new FileReader("C:\\Users\\Darshan jain\\Desktop\\darshan.txt");
     int ch=file.read();
     while(ch!=-1)
     {
    	 
    	 System.out.print((char)ch);
    	 ch=file.read();
    	 
     }
     file.close();
	}    

}
