// WAP to create int array call the sum and average of all element using for each

import java.util.*;
class array
{
  public static void main (String[]args)
  {
    int num[] = new int[]{ 10, 9, 6, 5, 4, 3, 2, 1 };
    int sum = 0;
    double avg = 0;
    for (int a:num)
      {
	sum += a;
      }
	System.out.println (sum);
	avg = (double) sum / (double) num.length;
     System.out.println (avg);
  }
}
// save as 'array.java'
