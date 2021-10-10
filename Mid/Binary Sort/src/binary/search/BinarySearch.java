package binary.search;
import java.util.Scanner;
public class BinarySearch {
    
    public static void main(String[] args) {       
       
       Scanner sc = new Scanner(System.in);
		System.out.println("..............................");
		System.out.println("	Selection Sort");
		System.out.println(".............................\n");
		System.out.print("Input Array length: ");		
		int n = sc.nextInt();
		int array[] = new int[n];
                System.out.println("Array element input: ");
		for(int i=0; i< array.length; i++) {
			array[i] = sc.nextInt();
		}	
		
		
		System.out.print("Before Sort: ");
		for(int i=0; i<array.length; i++) {
			 System.out.print(array[i]+",");
		 }
		
		 for (int i = 0; i < array.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < array.length; j++){  
	                if (array[j] < array[index]){  
	                    index = j; 
	                }  
	            }  
	            int smallerNumber = array[index];   
	            array[index] = array[i];  
	            array[i] = smallerNumber;  
	        }		 
		 
		 
		 System.out.print("\nAfter Sort: ");
		 for(int i=0; i<array.length; i++) {
			 System.out.print(array[i]+",");
		 }
		 
		 
		 System.out.println("\n\n\n\n..............................");
			System.out.println("\tMD.Kamrul Hasan");
			System.out.println("\tCSE 02006947");
			System.out.println("..............................");
    }
    
}
