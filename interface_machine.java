// interface machine using paint method
interface Machine {
    public void start();
    public void stop();
}

class Car implements Machine {
    public void start() {
        System.out.println("Starting car.....");
    }

    public void stop() {
        System.out.println("Stopping car");
    }
}

public class Main {
    public static void main(String args[]){
        Machine mac=new Car();
        mac.start();
        mac.stop();
        paint(new Car());
    }

    public static void paint(Machine m){
        m.stop();
        System.out.println("Painting.....");
        m.start();
    }
}
