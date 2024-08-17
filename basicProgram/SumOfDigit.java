import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int num = sc.nextInt();
        int digit;
        int result=0;        
        while(num != 0){
            digit = num % 10;
            result += digit;
            num /= 10;
        }
          System.out.print("Sum of digit : "+result);
    }
}
