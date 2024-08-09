class Employee2{

private String designation;
private int salary;

private String getDesignation(){
return designation;
}

private void setDesignation(String designation){
this.designation = designation;
}

private int getSalary()
{
return salary;
}

private void setSalary(int salary)
{
this.salary = salary;
}

public static void main(String args[]){
 Employee2 em = new Employee2();
em.setDesignation("Developer");
em.setSalary(10000);

System.out.println("Designation: "+em.getDesignation());
System.out.println("Salary: "+em.getSalary());
}
}
