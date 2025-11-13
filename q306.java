// WAP to print following pattern using loop statement for n row.
//  54321
//   4321
//    321
//     21
//      1
class q306 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <=n; i++) {
            for (int j=1;j<= i-1; j++) {
                System.out.print(" ");
            }
            for (int j = n+1-i; j>=1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
