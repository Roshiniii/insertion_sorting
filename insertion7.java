import java.util.Scanner;
class insertion1{  
    void insertionSort(int A[],int n) {  
           int key,i,j; 
           for ( i = 0; i <= n-1; i++) {  
                key = A[i];  
                j = i;  
               while ( (j > 0) && ( A[j-1] > key ) ) {  
                   A[j] = A[j-1];  
                   j--;  
               }  
               A[j] = key;  
           }  
       }  
     }
class insertion7{
    public static void main(String[] args){
        int A[] = new int[20];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=input.nextInt();
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            A[i]=input.nextInt();
        }
        insertion1 sorted= new insertion1();
        sorted.insertionSort(A,n);
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++)
           System.out.println(A[i]+" ");
       }
    }

