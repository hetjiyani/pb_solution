// Write a program for following given pattern using nested loops.
//  1
//  24
//  135
//  2468
//  13579
class q310 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int o = 1;
            int e = 2;
            for (int j = 1; j <= i; j++) {
                if (i % 2 != 0) {
                    System.out.print(o);
                    o=o+2;
                } else {
                    System.out.print(e);
                    e=e+2;
                }
            }
            System.out.println();
        }
    }
}