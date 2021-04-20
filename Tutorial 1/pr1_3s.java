import java.io.*;
import java.net.*;
class pr1_3s
{
public static void main(String args[]) throws Exception
{
try (ServerSocket ss = new ServerSocket(7777); Socket s = ss.accept()) {
System.out.println("connected..........");
FileInputStream fin=new FileInputStream("Send.txt");
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
int r;
while((r=fin.read())!=-1)
{
dout.write(r);

}
System.out.println("\nFiletranfer Completed");
}
}
}