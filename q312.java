// WAP to print following pattern using loop statement for 5 row.
//  L  J  L  J  L
//   L  J  L  J
//     L  J  L
//       L  J
//         L
class q312 {
    public static void main(String[] args) {
        int n = 5;
        int a = 1;
        for (int i = 1; i <= n; i++) {
            char d = 'L';
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(d+" ");
                if (d == 'L') {
                    d = 'J';
                } else {
                    d = 'L';
                }
            }
            System.out.println();
        }
    }
}