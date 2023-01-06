public class AlphabetPattern {

public static void main(String[] args) {
// TODO Auto-generated method stub
int x=new java.util.Scanner(System.in).nextInt();
for(int r=1;r<=x;r++)
{ //printing space
for(int c=1;c<=x-r;c++)
System.out.print(" ");
for(int c=1;c<=r;c++)
System.out.print((char)(c+64));
System.out.println();
}
}

}