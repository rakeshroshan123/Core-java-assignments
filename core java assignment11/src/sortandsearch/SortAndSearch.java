package sortandsearch;

import java.util.Arrays;

public class SortAndSearch {


		    public static void main(String args[]) throws Exception
		    {
		  
		        // Sorted Array
		        int array[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		  
		        // Using binarySearch to search for desired element
		        int index = Arrays.binarySearch(array, 19);
		  
		        // Printing result
		        if (index >= 0)
		            System.out.println("Element 19 found at index: "
		                               + index);
		        else
		            System.out.println("Element not found");
		    }
		}

