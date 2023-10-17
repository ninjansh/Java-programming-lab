// null pointer Exception
public class NassMultiCatch {
    public static void main(String[] args) {
        String s=null;
        int[] arr = {10, 20, 30};

        try {
            System.out.println(s.length());
            System.out.println(arr[2]);
        } catch (ArrayIndexOutOfBoundsException el) {
            System.out.println("Exception Index Out of Bounds: " + el);
        } catch (NullPointerException e2) {
            System.out.println("Exception Null Pointer: " + e2);
        }
    }
}
