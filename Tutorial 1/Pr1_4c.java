import java.io.*;
import java.net.*;

public class pr1_4c {
	
	public static void main(String args[]) throws Exception{
		
		Socket s = new Socket("localhost",678);
		BufferedReader keyRead = new BufferedReader( new InputStreamReader(System.in));
		OutputStream o = new s.getOutputStream();
		PrintWriter p = new PrintWriter(o,true);
		InputStream i = new s.getInputStream();
		BufferedReader rr = new BufferedReader( new InputStreamReader(i));
		System.out.println("enter key");
		String receiverMessage,sendMessage;
		while(true){
			
			sendMessage	= keyRead.readLine();
			PrintWriter.println(sendMessage);
			if(receiverMessage = rr.readLine()!=null){
				
				System.out.println("receiverMessage:" + receiverMessage);
			}
		}
	}
}