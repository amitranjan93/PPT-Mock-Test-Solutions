import java.util.Scanner;

public class fibonacci {

    static void fibonacciSeries(int n) {

        int n1 = 0;
        int n2 = 1;
        int n3;
        if (n == 1) {
            System.out.println(n1 + " ");
        } else {

            System.out.print(n1 + " " + n2 + " ");
        }
        for (int i = 2; i < n; i++) {

            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3 + " ");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth term of fibonacci series: ");
        int n = sc.nextInt();
        fibonacciSeries(n);
    }
}
