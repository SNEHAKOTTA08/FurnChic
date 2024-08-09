class PolyOverload
{
public void add(byte a, int b)
{
System.out.println("hello");
}
public void add(byte c, int y)
{
System.out.println("hello again");
}
public static void main(String[] args)
{
PolyOverload pol = new PolyOverload();
pol.add(3,4);
pol.add(5,6);
}
}