//WAP in java to create a class named Light. It contains a variable: On and two methods: switchOn() and switchOff(). Inside the Main class, create two objects: led and halogen of the Light class. Then use the objects to call the methods of the class
//led.turnOn() - It sets the On variable to true and prints the output.
//halogen.turnOff() - It sets the On variable to false and prints the output.
public class Lamp
{
    boolean on;
    void switchon()
    {
        on=true;
        System.out.println(on);
    }
    void switchoff()
    {
        on=false;
        System.out.println(on);
    }
	public static void main(String[] args)
	{
		Lamp led=new Lamp();
		Lamp halogen=new Lamp();
		led.switchon();
		halogen.switchoff();
	}
}
//save as "Lamp.java"
