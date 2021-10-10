package bubble.sort;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		int temp = 0;
		System.out.println("..............................");
		System.out.println("	Buble Sort");
		System.out.println(".............................\n");
		System.out.print("Total Element in Array: ");
		int n = sc.nextInt();
		int array[] = new int[n];
		System.out.println("Enter Array Elements: ");
		for(int i=0; i< array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("Array Before: ");
	for(int i=0; i< array.length; i++) {
		System.out.print(array[i]+" ");
	}
	System.out.println("");
		
		for (int i=0; i<n; i++) {
			for(int j=0; j< n-i-1; j++) {
				if(array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		System.out.println("Array After: ");
		for(int i=0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
		System.out.println("\n..............................");
		System.out.println("\tMD.Kamrul Hasan");
		System.out.println("\tCSE 02006947");
		System.out.println("..............................");
        
    }
    
}
