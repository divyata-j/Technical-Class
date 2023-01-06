import java.util.Arrays;
import java.util.Scanner;

public class AirportSecurity {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int a[] = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
