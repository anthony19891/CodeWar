package net.anthonyferrillo.codewar.test;

/**
 * Name:
 * Smallest value of an array
 * 
 * Description:
 * Write a function that can return the smallest value of an array or 
 * the index of that value. 
 * The function's 2nd parameter will tell whether it should return the value or the index.
 * Assume the first parameter will always be an array filled 
 * with at least 1 number and no duplicates. 
 * Assume the second parameter will be 
 * a string holding one of two values: 'value' and 'index'.
 * 
 */
public class Arrays {
	
	public static int findSmallest( final int[] numbers, final String toReturn ) {
		// check if is array
		int ret = 0;
		if(!(numbers instanceof int[])) {
			return ret;
		}
		
		// add first index and first value of array
		int index = 0;
		int smallest = numbers[index];
		
		// find smallest number
		for(int i = 1; i < numbers.length; i++) {
			if(numbers[i] < smallest) {
				index = i;
				smallest = numbers[i];
			}
		}
	    
		// check return
		switch(toReturn) {
			case "index": default:
				ret = index;
				break;
	      
			case "value":
				ret = smallest;
				break;
	    }
		
	    return ret;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.findSmallest(new int [] {100, 22, 13} , "index"));
	}

}
