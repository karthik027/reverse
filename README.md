# reverse
import java.util.*;
import java.io.*;
public class Reverse
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String a=br.readLine();
int l=a.length();
char[] ch=a.toCharArray();
for(int i=(l-1);i>=0;i--)
{
System.out.print(ch[i]);
}
}
}
