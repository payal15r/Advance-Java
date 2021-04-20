import java.io.*;
import java.net.*;
import java.util.*;

public class pr1_5c
{
	public static void main(String args[])throws Exception
	{
		Socket s = new Socket("localhost",678);
		if(s.isConnected()){
			System.out.println("Connect server");
		}
		System.out.println("enter data");
		scnner sc = scnner(System.in);
		int n = scnner.nextInt();
		int a[] = new scnner.nextInt();
		DataOutputStream d = new DataOutputStream(s.getDataOutputStream());
		d.writeInt(n);
		for( int i=0;i<n;i++)
		{
			int r = scnner.nextInt();
			DataInputStream di = new DataInputStream(s.getDataInputStream());
			int r;
		
		
			for (int i=0;i<n;i++)
			{
				r = di.readLine();
				System.out.println(r,"");
				
			}
			
		}
	}
}