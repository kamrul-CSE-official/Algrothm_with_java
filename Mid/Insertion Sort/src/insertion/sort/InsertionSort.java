package insertion.sort;
import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("..............................");
        System.out.println("	Insertion Sort");
        System.out.println(".............................\n");
        
        System.out.print("Array Length: ");
        int n = sc.nextInt();
        int array [] = new int [n];
        
        System.out.println("Enter array elements: ");
        for(int i=0; i<array.length; i++){
            array[ i ] = sc.nextInt();
        }
        
        System.out.print("Before Sort: ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[ i ] + ",");
        }
        
        int j, item;
        for(int i = 1; i < array.length; i++){
            item = array[ i ];
            j = i - 1;
            while (j >= 0 && array[ j ] > item){
                array[ j+1 ] = array[ j ];
                j = j - 1;
            }
            array[ j+1 ] = item; 
        }
        
        System.out.print("\nAfter Sort: ");
        for(int i=0; i < array.length; i++){
            System.out.print(array[ i ]+",");
        }
        
         System.out.println("\n\n\n\n..............................");
	System.out.println("\tMD.Kamrul Hasan");
	System.out.println("\tCSE 02006947");
	System.out.println("..............................");
        
        
        
        
        
        
    }
    
}
