// Write a Java Program to determine whether a given number is a Disarium number or not?
//  (Hint: A number is said to be the Disarium number when the sum of its digit raised to the power 
// of their respective positions is equal to the number itself)
//  Eg: Input: 135 => 1^1 + 3^2 + 5^3 = 135 => 135 is a Disarium number.
//  Input: 25 => 2^1 + 5^2 = 27 => 25 is not a Disarium number.
class q337 {
    public static void main(String[] args) {
        int n=135;
        int a = n;
        int sum = 0;
        int h = a;
        int c = 0;
        while (h != 0) {
            h = h / 10;
            c++;
        }
        while (a != 0) {
            sum=sum+(int)Math.pow(a%10,c);
            a=a/10;
            c--;
        }
        if(sum==n)
        System.out.println("Disarium");
        else
        System.out.println("not Disarium");
    }
}
