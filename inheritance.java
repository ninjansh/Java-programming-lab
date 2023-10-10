// demonstrate inheritance
class Parent{
        void display(){
            System.out.println("This is the parebnt class");
        }
        void show(int num){
            System.out.println("The number in parent class is: "+num);
        }
    }
    class Child extends Parent{
        void display(){
            System.out.println("This is child class");
        }
        void show(double num){
            System.out.println("The number in child class is: "+num);
        }
    }
    public class Main{
        public static void main(String args[]){
            Parent parentObj=new Parent();
            Parent childObj=new Child();
            parentObj.show(5);
            childObj.show(75);
            parentObj.display();
            childObj.display();
        }
    }
