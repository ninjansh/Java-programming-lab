// WAP to count the no of objects created by the program
class Program {
    static int count = 0;

    Program() {
        count++;
    }

    public static void main(String[] args) {
        Program obj1 = new Program();
        Program obj2 = new Program();
        Program obj3 = new Program();

        System.out.println("Number of objects created: " + count);
    }
}
