/*******************************************************************************
* Name: Feras
* Description: A program that uses a recursive method to return
* the largest integer in an Array
 ******************************************************************************/

import java.util.Scanner;
public class LargestNumArrayRecursive {
    public static void main(String[] args) {
        
        //Create an array to store 7 int values
        int[] intNumbers = new int[7];
        
        //Create scanner obj
       Scanner input = new Scanner(System.in);
       
       //Prompt for user input of 7 values
        System.out.println("Enter 7 integers: ");
        
        //loop each element to store in the array
        for (int i = 0; i < intNumbers.length; i++)
            intNumbers[i] = input.nextInt();
        
       //display largest element
        System.out.println("The largest element is: " + 
                getLargestElement(intNumbers));
        
    }//end main
    
      // Recursion call to find the largest element
    private static int getLargestElement ( int[] intNumbers){
        return getLargestElement(intNumbers,0,intNumbers[0]);
    }//end recursive helper method

    // Recursive helper method 
    private static int getLargestElement(int[] intNumbers, int low, int high) {
        if (low == intNumbers.length) {
            return high;
        }
        
        
        if(high < intNumbers[low]){
            high = intNumbers[low];
        }
            
        return getLargestElement(intNumbers, low + 1, high);

    }//end recursive largest element method
}//end class
