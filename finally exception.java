//finally exception
class Main
{
	public static void main(String[] args) {
	    try{
	        int d=5/0;
	    }
	    catch(ArithmeticException e){
	        System.out.println("Arithmetic Exception =>"+e.getMessage());
	    }
		finally{
		     System.out.println("This is the final block ");
		}
	}
}
