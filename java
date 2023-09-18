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

//WAP to print add name and surname

class Name
{
  String name;
  String surname;
    Name (String name, String surname)
  {
    this.name = name;
    this.surname = surname;
  }
  public static Name func (Name n1, Name n2)
  {
    return new Name (n1.name+n1.surname, n2.surname);
  }
}

class eg
{
  public static void main (String args[])
  {
    Name n1 = new Name ("Awishvarya", "Rai");
    Name n2 = new Name ("Abhishek", "Bachan");
    Name n3 =  Name.func (n1, n2);
      System.out.println (n3.name +" "+ n3.surname);
  }
}
