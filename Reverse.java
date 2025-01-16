public class Reverse {
    public static void main(String[] args) {
        // int n=150588;
        // while(n>0){
        //     int lastDigit=n%10;
        //     System.out.print(lastDigit);
        //     n=n/10;
        // }
        // System.out.println();

        // int num= 28012005;
        // while(num>0 ){
        //     int lastDigit=num%10;
        //      System.out.print(lastDigit);
        //     num=num/10;
            
            
        // }
        // System.out.println("=");

        int number=78652941;
        while(number > 0){
            int lastDigit=number%10;
            System.out.print(lastDigit);
            number=number /10;
            
        }

        System.out.println(number);

        
    }
    
}
