//First letter capital

// public class AllString {
  
//   public static void main(String[] args) {
//      java.lang.String str="arati";
//        java.lang.String upperFirst = ( str.substring(0, 1)).toUpperCase() + str.substring(1);
//            System.out.println(upperFirst);
//        }
//    } 



//duplicate charcter in string   
//    public class AllString {
//     public static void main(String[] args) {
//         String str="Programming";
//         findDuplicate(str);
//     }
//     public static void findDuplicate(String str){
//         char[] ch=str.toCharArray();
//         System.out.println("Duplicates are ....");
//         for(int i=0;i<str.length();i++){
//             for(int j=i+1;j<str.length();j++){
//                 if(ch[i]==ch[j]){
//                     System.out.print(" "+ch[j]);
//                     break;
//                 }
//             }
//         }
        
//     }
// } 


// public class AllString {
//     public static void main(String[] args) {
//       int[] arr1={2,23,45,11,34,28,39};
//       int[] arr2={12,16,19,23,38,34,45};
//       System.out.println("Duplicate elements are ...");
//       for(int i=0;i<arr1.length;i++){
//           for(int j=0;j<arr2.length;j++){
//               if(arr1[i]==arr2[j]){
//                   System.out.print(" "+arr1[i]);
//               }
//           }
//       }

//     }
//   }


import java.util.Arrays;
import java.util.Scanner;

public class AllString {

    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
      System.out.println("Enter two String:");
      java.lang.String str1=sc.nextLine();
      java.lang.String str2=sc.nextLine();
      
      char[] ch1=str1.toCharArray();
      char[] ch2=str2.toCharArray();
      
      Arrays.sort(ch1);
      Arrays.sort(ch2);
      
      if(Arrays.equals(ch1,ch2)){
          System.out.print("Two strings are Anagram : "+ch1+"and"+ch2);
      }
      else{
            System.out.print("Two strings are not Anagram : "+ch1+"and"+ch2);
      }
     
    
      }
    }
  
