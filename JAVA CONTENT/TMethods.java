class TMethods
{
public static void main(String[]args)
{
ThreadMethods t1 = new ThreadMethods();
t1.start();
String str = t1.getName();
System.out.println("Thread Name:" +t1.getName());
}

}