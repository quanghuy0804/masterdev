import java.lang.Math;
import java.util.Scanner;
public class baitap {
    public static Scanner scanner = new Scanner(System.in);
public static void sum() {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            scanner.close();
            int tong = 0;
            for(int i=0; i<arr.length; i++){
                tong = tong + arr[i];

        }
            System.out.println(tong);

    }
    public static void demkitu() {
        String s = scanner.nextLine();


    }
    public static void songuyento() {
        int n = scanner.nextInt();
        if (check(n)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    public static boolean check(int n) {
        if (n < 2) {
            return false;
        }
        int can = (int) Math.sqrt(n);
        for (int i = 2; i <= can; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void sapxep() {
        int n = scanner.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }
        scanner.close();
        int temp = ar[0];
        for (int i = 0 ; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] > ar[j]) {
                    temp = ar[j];
                    ar[j] = ar[i];
                    ar[i] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
    }
    public static void dientich() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int nuachuvi = (a+b+c)/2;
        double dt=0;
        if(a + b < c || a + c < b || c + b < a){
            System.out.println("tam giac khong ton tai");
        } else{
          dt = (double)Math.sqrt(nuachuvi*(nuachuvi-a)*(nuachuvi-b)*(nuachuvi-c));
        }

        System.out.println(dt);

    }
    public static void vehinhtron(){
        int bankinh = scanner.nextInt();
        double draw;
        for (int i=0;i<=2*bankinh;i++) {
            for (int j=0;j<=2*bankinh;j++) {
                draw = Math.sqrt((i-bankinh)*(i-bankinh)+(j-bankinh)*(j-bankinh));

                if (draw > bankinh - 0.5 && draw < bankinh + 0.5) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
}
    public static void main(String[] args){
    int number= scanner.nextInt();
    switch (number){
        case 1:
            sum();
            break;
        case 3:
            songuyento();
            break;
        case 4:
            sapxep();
            break;
        case 5:
            dientich();
            break;
        case 6:
            vehinhtron();
            break;
    }
}
}


