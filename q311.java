// Write a program to print following pattern using nested loop. (use Scanner class for input)
//  1
//  2 3
//  6 5 4
//  7 8 9 10
//  15 14 13 12 11
class q311{
    public static void main(String[] args) {
        int n = 5;
        int a = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
               System.out.print(a+" ");
               a++;
            }
            System.out.println();
        }
    }
}