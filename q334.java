// WAP to print multiple of N from given range of unsigned integers. For example, if N=5 and range 
// is [17, 45] it prints 20, 25, 30, 35, 40, 45. Take input using Scanner class
import java.util.Scanner;
class q334 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 17; i <=45; i++) {
            if(i%a==0)
            System.out.println(i);
        }
    }
}
