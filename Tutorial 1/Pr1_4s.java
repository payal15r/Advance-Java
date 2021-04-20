import java.io.*;
import java.net.*;

public class pr1_4s{
	
	publicstatic void main(String args[]){
		
		ServerSocket s = new ServerSocket(678);
		Socket ss = s.accept();
		BufferReader K = new BufferReader(new InputStreamReader(System.in));
		OutputStream o = new s.getOutputStream();
		PrintWriter p = new PrintWriter(o,true);
		InputStream i = new s.getInputStream();
		BufferedReader rr = new BufferedReader( new InputStreamReader(i));
		String receiverMessage,sendMessage;
		while(true){
			if(receiverMessage=rr.readLine() != null)
			{
				System.out.println(receiverMessage);
				
			}sendMessage=k.readLine();
			PrintWriter.println(sendMessage);
		}
	}
}