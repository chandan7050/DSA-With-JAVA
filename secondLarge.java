
import java.util.Scanner;


public class secondLarge {

    static int findSecLarg(int[] arr, int n){
        int largeele =Integer.MIN_VALUE;
        int secLarg = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(arr[i] > largeele){
                secLarg = largeele;
                largeele = arr[i];
            }else if (arr[i] != largeele && arr[i] > secLarg) {
                secLarg = arr[i];
            }
        }
        return secLarg;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = findSecLarg(arr, n);
        // System.out.println("it is ans");
        System.out.println(ans);
    }
}
