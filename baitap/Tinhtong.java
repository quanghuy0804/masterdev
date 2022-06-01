import java.util.Scanner;

public class Tinhtong {
    public static int sum(int[] a){
        int tong = 0;
        for(int i=0; i<a.length; i++){
            tong = tong + a[i];
        }
        return tong;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int tong = sum(arr);
        System.out.println(tong);
    }
}

