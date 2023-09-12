// run on Online Java Compiler IDE

public class Main{
    public static void main(String args[]){
        for(int i=0;i<args.length;i++)
        System.out.println(args[i]);
    }
}

// command line argument

public class eg
{
    static int sum=0;
    public static void main(String s[])
    {
        for(int i=0;i<s.length;i++)
        {
            sum=sum+Integer.parseInt(s[i]);
        }
       System.out.println(sum); 
    }
}

// command line argument

//WAP argument prog to add complex number

class Complex
{
  int real;
  int imag;
    Complex (int real, int imag)
  {
    this.real = real;
    this.imag = imag;
  }
  public static Complex add (Complex x, Complex y)
  {
    return new Complex (x.real + y.real, x.imag + y.imag);
  }
}
  class eg
  {
    public static void main (String args[])
    {
      Complex x = new Complex (3, 4);
      Complex y = new Complex (2, 3);
      Complex z = Complex.add (x, y);
        System.out.println (z.real + "+" + z.imag + "i");
    }
  }

//WAP argument prog to add complex number

class Complex
{
  int real;
  int imag;
    Complex (int real, int imag)
  {
    this.real = real;
    this.imag = imag;
  }
  public static Complex add (Complex x, Complex y)
  {
    return new Complex (x.real - y.real, x.imag - y.imag);
  }
}
  class eg
  {
    public static void main (String args[])
    {
      Complex x = new Complex (3, 4);
      Complex y = new Complex (2, 3);
      Complex z = Complex.add (x, y);
        System.out.println (z.real + "+" + z.imag + "i");
    }
  }
