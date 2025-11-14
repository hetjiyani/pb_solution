//  WAP to find out sum of first and last digit of a given number 
class q331 {
    public static void main(String[] args) {
        int a = 1234;
        int b = a;
        int c = 0;
        while (b != 0) {
            b = b / 10;
            c++;
        }
        int d = (int) Math.pow(10, c - 1);
        int sum = (a / d) + (a % 10);
        System.out.println(sum);
    }
}