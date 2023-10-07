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
// save as 'Lamp.java'
