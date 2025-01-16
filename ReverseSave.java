public class ReverseSave {
    public static void main(String[] args) {
        
    
        int num=1988;
        while(num > 0){
            int lastDigit=num%10;
            // System.out.print(lastDigit);
            int rev= lastDigit;
            num=num/10;
            System.out.print(rev);
        }
        // int save=rev;
        // System.out.print(save);
        
    }
    
}
