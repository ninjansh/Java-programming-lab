import java.util.Scanner;
class array
{
	public static void main(String[] args) 
	{
	 int size;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter size: ");
	 size=sc.nextInt();
	 int a[]=new int [size];
	 for(int i=0;i<size;i++)
	 {
	     a[i]=i;
	     System.out.println(a[i]);
	 }
	 
	}
}
// save as 'array.java'
