// Assume that you want to make the sum of 1 to 100. Give the necessary code to perform the same 
// using 
// (1) For loop (2) While loop (3) Do-while loop
class q333 {
    public static void main(String[] args) {
        // (1) For loop
        int sum1=0;
        for (int i = 1; i <=100; i++) {
            sum1=sum1+i;
        }
        System.out.println(sum1);

        
        // (2) While loop
        int i=1;
        int sum2=0;
        while (i!=101) {
            sum2=sum2+i;
            i++;
        }
        System.out.println(sum2);


        // (3) Do-while loop
        int sum3 =0; 
        int j=0;
        do {
            sum3=sum3+j;
            j++;
        } while (j!=101);
        System.out.println(sum3);
    }
}
