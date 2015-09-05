package net.anthonyferrillo.codewar.test;

/**
 * Name: 
 * Breaking chocolate problem
 * 
 * Description:
 * Your task is to split the chocolate bar of given dimension n x m into small squares. 
 * Each square is of size 1x1 and unbreakable. 
 * Implement a function that will return minimum number of breaks needed.
 * For example if you are given a chocolate bar of size 2 x 1 you can split it 
 * to single squares in just one break, but for size 3 x 1 you must do two breaks.
 * If input data is invalid you should return 0 (as in no breaks 
 * are needed if we do not have any chocolate to split). 
 * Input will always be a non-negative integer.
 * 
 */

public class Chocolate{
  public static int breakChocolate(int n, int m) {
	  
	  int breaks = 0;
	  if(n > 1 && m > 1)
		  breaks = Math.max(n * m - 1, 0);
	  return breaks;
  }
  
  public static void main(String[] args) {
	  System.out.println(Chocolate.breakChocolate(5, 5));
  }
}