import java.io.*;
import java.net.*;
public class chatserver{
public static void main(String args[])throws Exception{
ServerSocket server=new ServerSocket(3000);
System.out.println("Server ready for chat");
Socket socket=server.accept();
BufferedReader keyread=new BufferedReader(new InputStreamReader(System.in));
OutputStream os=socket.getOutputStream();
PrintWriter pw=new PrintWriter(os,true);
InputStream is=socket.getInputStream();
BufferedReader receiveread=new BufferedReader(new InputStreamReader(is));
String rcvmsg,sendmsg;
while(true)
{

if((rcvmsg=receiveread.readLine())!=null)
System.out.println(rcvmsg);
sendmsg=keyread.readLine();
pw.println(sendmsg);
pw.flush();
}}}
