public class ContinueDemo {
public static void main(String[] args) {
// for(int i=1;i<=10;i++)
// {
// if(i%2==0)
// continue;
// System.out.println(i);
// }
loop1:
for(int j=1;j<=5;j++)
{
loop2:
for(int i=1;i<=10;i++)
{
if(i%5==0)
continue loop1;
System.out.println(i);
}

}
}

}
