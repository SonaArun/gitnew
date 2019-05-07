import java.io.*;
import java.net.*;
public class chatclient{
public static void main(String args[])throws Exception{
Socket socket=new Socket("127.0.0.1",3000);
BufferedReader keyread=new BufferedReader(new InputStreamReader(System.in));
OutputStream os=socket.getOutputStream();
PrintWriter pw=new PrintWriter(os,true);
InputStream is=socket.getInputStream();
BufferedReader receiveread=new BufferedReader(new InputStreamReader(is));
String rcvmsg,sendmsg;
System.out.println("Start chit chat,type text and press enter key");
while(true)
{
sendmsg=keyread.readLine();
pw.println(sendmsg);
pw.flush();
if((rcvmsg=receiveread.readLine())!=null)
System.out.println(rcvmsg);
}}}
