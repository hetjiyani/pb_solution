//  WAP to find if the number is Armstrong Number or not. Example: - 153 is an Armstrong Number.
class q332 {
    public static void main(String[] args) {
        int a = 8;
        int b = a;
        int d = a;
        int c = 0;
        int e = 0;
        int sum = 0;
        while (b != 0) {
            b = b / 10;
            c++;
        }
        for (int i = 0; i < c; i++) {
            e = (int) Math.pow(d % 10, c);
            sum = sum + e;
            d = d / 10;
        }
        if (sum == a)
            System.out.println("angstrome");
        else
            System.out.println("not angstrome");
    }
}
