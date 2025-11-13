// WAP to print following pattern using loop statement for n row.
//       1
//      A B
//     1 2 3
//    A B C D
//   1 2 3 4 5
class q307 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int a = 1;
            char b = 'A';
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            if(i%2!=0)
            {
                for (int j = 1; j <=i; j++) {
                    System.out.print(a+" ");
                    a++;
                }
            }
            else{
                for (int j = 1; j <=i; j++) {
                    System.out.print(b+" ");
                    b++;
                }
            }
            System.out.println();
        }
    }
}
