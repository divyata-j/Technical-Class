import java.util.*;
public class ReverseAnArray {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
int[] arr;
int arrSize,temp=0;
arrSize=in.nextInt();
arr=new int[arrSize];
for(int i=0;i<arr.length;i++)
arr[i]=in.nextInt();
for(int i=0,j=arr.length-1;i<j;i++,j--)
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
//arr[i]=arr[i]+arr[j]-(arr[j]=arr[i]);

}
for(int i=0;i<arr.length;i++)
System.out.println(arr[i]);
}

}
