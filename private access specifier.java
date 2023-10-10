class Data
{
  private String name;
  public void setter(String s){
      name=s;
  }
  public String getter(){
      System.out.println(name);
      return name;
  }
}
public class Main
{
  public static void main (String[]args)
  {
    Data d = new Data ();
     d.setter("Java");
     d.getter();
  }
}
