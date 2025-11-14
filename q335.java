
//  WAP to find result of 1+3/5+5/7+7/9+... series. Print addition of first N part.
import java.util.Scanner;

class q335 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 1;
        double b = 1;
        double sum=0;
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            sum=sum + a/b;
            a=a+2;
            b=b+4;
        }
        System.out.println(sum);
    }
}
