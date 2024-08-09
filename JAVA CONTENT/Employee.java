class Employee {

private String name;
private int age;

private String getName()
{

return name;

}

private void setName(String name)
{

this.name = name;
}

private int getAge()
{

return age;

}

private void setAge(int age)
{
this.age = age;

}
public static void main(String[] args)
{

Employee emp = new Employee();
emp.setName("Sneha");
emp.setAge(20);

System.out.println("Name: "+emp.getName());
System.out.println("Age: "+emp.getAge());
}

}
