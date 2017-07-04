import java.io.*;
import java.util.*;
public class Reverse1
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Integer n=Integer.parseInt(br.readLine());
String s=String.valueOf(n);
int a=s.length();
char[] ch=s.toCharArray();
for(int i=(a-1);i>=0;i--)
{
System.out.print(ch[i]);
}
}
}
