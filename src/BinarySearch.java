import java.util.Arrays;

public class BinarySearch {

public static void main(String[] args) {
// TODO Auto-generated method stub
int arr[]= {10,20,30,40,50};
Arrays.sort(arr);
int search=new java.util.Scanner(System.in).nextInt();
for(int lb=0,ub=arr.length-1;lb<=ub;)
{
int middle=(lb+ub)/2;
if(arr[middle]==search)
{
System.out.println("Found @ "+middle);
System.exit(0);

}
else if(arr[middle]<search)
lb=middle+1;
else
ub=middle-1;
}
System.out.println("Not found");
}

}