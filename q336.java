// WAP to reverse a number. 
class q336 {
    public static void main(String[] args) {
        int a = 1234;
        int b = a;
        int e = 0;
        while (b != 0) {
            e = (e * 10) + (b % 10);
            b = b / 10;
        }
        System.out.println(e);
    }
}
