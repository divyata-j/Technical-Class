public class BreakDemo {

public static void main(String[] args) {
// TODO Auto-generated method stub
/* for(int i=1;i<=10;i++)
{
if(i%5==0)
break;
System.out.println(i);
}
*/
loop1:
for(int j=1;j<=5;j++)
{
loop2:
for(int i=1;i<=10;i++)
{
if(i%5==0)
break loop1;
System.out.println(i);
}

}
}
}