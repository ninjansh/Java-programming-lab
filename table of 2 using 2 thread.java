// table of 2 usinf 2 threads( parallel thread implementation)
class TableOfTwo {
    synchronized void printTable(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " * " + 2 + " = " + (i * 2));
            try {
                wait(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread1 extends Thread {
    TableOfTwo table;

    public Thread1(TableOfTwo table) {
        this.table = table;
    }

    public void run() {
        table.printTable(5);
    }
}

class Thread2 extends Thread {
    TableOfTwo table;

    public Thread2(TableOfTwo table) {
        this.table = table;
    }

    public void run() {
        table.printTable(10);
    }
}

public class Main {
    public static void main(String[] args) {
        TableOfTwo table = new TableOfTwo();
        Thread1 t1 = new Thread1(table);
        Thread2 t2 = new Thread2(table);

        t1.start();
        t2.start();
    }
}
