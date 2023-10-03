public class linsearch2
{
    int i;
  public int linearsearch (int[]arr, int key)
  {
    for (int i = 0; i < arr.length; i++)
      if (arr[i] == key)
	{
	  return i;
	}
    return -1;
  }
  public static void main (String args[])
  {
    int a[] = { 10, 20, 30, 40, 50, 60 };
    int key = 50;
    linsearch2 l = new linsearch2 ();
    l.linearsearch (a, key);
    System.out.println (key + "is found at index: "+i);
  }
}
