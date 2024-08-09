class SuperChild extends SuperParent
{

int a=40;

void display()
{

System.out.println("Inside Super-Child");
System.out.println(a);

super.display();
System.out.println(super.a);
}

}