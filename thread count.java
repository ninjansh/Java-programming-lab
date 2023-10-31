import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        scanner.close();

        MultiplicationTableThread thread1 = new MultiplicationTableThread(String.valueOf(number));
        MultiplicationTableThread thread2 = new MultiplicationTableThread(String.valueOf(number * 2));
        thread1.start();
        thread2.start();
    }
}

class MultiplicationTableThread extends Thread {
    MultiplicationTableThread(String s){
        super(s);
        System.out.println("New thread created: " + this);
    }
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println(getName() + " * " + i + " = " + (Integer.parseInt(getName()) * i));
                Thread.sleep(1500);
            }
        }
        catch(Exception e){
            System.out.println("Currently executing thread is interrupted");
        }
        finally {
            System.out.println("Currently executing thread run is terminated");
        }
    }
}
