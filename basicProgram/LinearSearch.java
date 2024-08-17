// import java.util.Arrays;


// public class LinearSearchE{    
//     public static int linearSearch(int[] arr, int key){    
//             for(int i=0;i<arr.length;i++){    
//                 if(arr[i] == key){    
//                     return i;    
//                 }    
//             }    
//             return -1;    
//         }    
//         public static void main(String a[]){    
//             int[] a1= {10,20,30,50,70,90};    
//             int key = 50;    
//             System.out.println(key+" is found at index: "+linearSearch(a1, key));    
//         }    
//     }    

// public class LinearSearch {
//     public static void main(String[] args) {//binary search

//         int a[]={12,34,23,5,65,25,99,65,39,20,40,67,89,40};
//         Arrays.sort(a);
//         int hi=a.length-1;
//         int li=0;
//         int mid=(li+hi)/2;
//         int srch=39;

//         while(li<=hi){
//             if(a[mid]==srch){
//                 System.out.println(srch+" is found at index "+mid);
//                 break;
//             }
//             else if(a[mid]<srch){
//                li=mid+1;
//             }
//             else if(hi>li){
//                 System.out.println("Element is not found");
//             }
//             else{
//                 hi=mid-1;
//             }
//             mid=(hi+li)/2;
//         }
       
//     }
// }/

// public class LinearSearch {
//     static int temp=0;
//     public static void bubbleShort(int[] a){
//     for(int i=0;i<a.length-1;i++){
//         for(int j=1;j<a.length-1-i;j++){
//             if(a[j-1]>a[j]){
//                 temp=a[j-1];
//                 a[j-1]=a[j];
//                 a[j]=temp;
//             }
//     }}}
//     public static void main(String[] args) {
//         int a[]={12,34,23,5,65,25,99,65,39,20,40,67,89,40};
//         bubbleShort(a);
//         System.out.println("After the bubble sort:");
//         for(int i=0;i<=a.length-1;i++){
//             System.out.print(" "+a[i]);
//         }
    
// } 
// }

// public class LinearSearch {
         
//             public static void selectionSort(int[] a){
               
//                      for(int i=0;i<a.length-1;i++){
//                         int index=i;
//                         for(int j=i+1;j<a.length;j++){
//                             if(a[j]<a[index]){
//                                 index=j;
//                             }
//                         }
//                         int temp=a[index];
//                         a[index]=a[i];
//                         a[i]=temp;
                      
//                      }
//                     }
//                     public static void main(String[] args) {
//                         int a[]={12,34,23,5,65,25,99,65,39,20,40,67,89,40};
//         selectionSort(a);
//         System.out.println("After the selection sort:");
//         for(int i=0;i<a.length;i++){
//             System.out.print(" "+a[i]);
//         }
//          }
//         }


public class LinearSearch {  
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }
    }  
        public static void main(String[] args) {
        int a[]={12,34,23,5,65};
        insertionSort(a);
        System.out.println("After the insertion sort:");
                    for(int i=0;i<a.length;i++){
                        System.out.print(" "+a[i]);
    }
}
    }
