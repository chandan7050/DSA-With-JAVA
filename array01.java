
import java.util.*;


// import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;


public class array01{

    static int largeEle(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length -1];

    }

    // largest Element In Array
    // static int largeEle(int[] arr, int n){
    //     int firstEle = arr[0];
    //     for(int i = 0; i<n; i++){
    //         if(arr[i] > firstEle){
    //             firstEle = arr[i];
    //         }
    //     }
    //     return firstEle;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the arry of length");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Array Element");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = largeEle(arr);
        System.out.println(ans);
    }
}