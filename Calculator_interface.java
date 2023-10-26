interface calculator{
    public void add(int a,int b);
    public void sub(int a,int b);
    public void mul(int a,int b);
    public void div(int a,int b);
}
class user implements calculator{
    public void add(int a,int b){
        System.out.println("Add: "+(a+b));
    }
    public void sub(int a,int b){
         System.out.println("Sub: "+(a-b));
    }
    public void mul(int a,int b){
         System.out.println("Mul: "+(a*b));
    }
    public void div(int a,int b){
        System.out.println("Div: "+(a/b));
    }
}
public class Main{
    public static void main(String args[]){
        user a=new user();
        a.add(6,5);
        a.sub(9,3);
        a.mul(4,5);
        a.div(9,2);
    }
}
