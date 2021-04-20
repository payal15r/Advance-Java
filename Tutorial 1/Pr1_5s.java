import java.io.*;
import java.net.*;
import java.util.*;

public class pr1_5c
{
	public static void main(String args[])throws Exception
	{
		ServerSocket ss = new ServerSocket(678);
		Socket s = ss.accept();
		System.ouut.println("Connect");
		DataInputStream di = new DataInputStream(s.getDataInputStream());
		DataOutputStream do = new DataOutputStream(s.getDataOutputStream());
		int r, i=0;
		int n = di.readInt();
		int a[] = new int[n];
		System.out.println("data");
		int count = 0;
		System.out.println("Recvied");
		for(i=0;i<n;i++){
			a[i] = di.readLine();
			
		}
		System.out.println("recived");
		Array.sort(a);
		for(i=0;i<n;i++)
		{
			do.writeInt(a[i]);
		}
		System.out.println("Sucess...");
	}
}
