// public class PrimeNumber {
//     static int temp=0;
//     public static void main(String[] args) {
//         printNumber(10);
//     }
//      static void printNumber(int no){
//         for(int i=2;i<=no-1;i++){
//             if(no%i==0){
//                 temp=temp+1;
//             }
//         }
//         if(temp==0){
//             System.out.println(no+" is prime.");
//         }
//         else{
//             System.out.println(no+" is not prime.");
//         }

//     }

    
// }

//print 1to 100 prime number
public class PrimeNumber{
static int temp=0;
    public static void main(String[] args) {
        System.out.println("prime numbers are:");
    for(int i=1;i<=100;i++){
        for(int j=2;j<=i-1;j++){
            if(i%j==0){
                temp=temp+1;
            }
        }
       
    if(temp==0){
        System.out.print(" "+i);
    }
    else{
       temp=0;
    }
}

}
}