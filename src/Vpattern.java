public class Vpattern {

public static void main(String[] args) {
// TODO Auto-generated method stub
String str=new java.util.Scanner(System.in).nextLine();
int len=str.length();
for(int i=1;i<len;i++)
{
String format="%"+i+"c"+"%"+(len*2-(i*2+1))+"s%c";
System.out.println("".format(format,str.charAt(i-1),"",str.charAt(i-1)));
}
System.out.println("".format("%"+len+"c", str.charAt(len-1)));
}

}