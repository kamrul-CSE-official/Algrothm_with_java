package merge.sort;
import java.util.Scanner;
public class MergeSort {
    
    
    
        void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
  
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
  
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
  
        
        int i = 0, j = 0;
  
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    
    
    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;
  
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);
  
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
    
   
     static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
   
    public static void main(String[] args) {
        //int arr[] = { 12, 11, 13, 5, 6, 7 };
        System.out.println("..............................");
	System.out.println("	Merge Sort");
	System.out.println(".............................\n");
	System.out.print("Input Array length: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n =sc.nextInt();
        int arr[ ] = new int [n];
        System.out.println("Enter Array Elements: ");
        for(int i=0; i<arr.length; i++){
            arr[ i ] = sc.nextInt();
        }
  
        System.out.println("Before Sort: ");
        printArray(arr);
  
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);
  
        System.out.println("\nAfter Sorted: ");
        printArray(arr);  
        
        
        System.out.println("\n\n\n\n..............................");
	System.out.println("\tMD.Kamrul Hasan");
	System.out.println("\tCSE 02006947");
	System.out.println("..............................");
      
    }
    
}
