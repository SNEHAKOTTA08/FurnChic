class Emp{
public static void main(String args[]){
 EmployeeD em = new EmployeeD();
em.setDesignation("Developer");
em.setSalary(100000);

System.out.println("Designation: "+em.getDesignation());
System.out.println("Salary: "+em.getSalary());
}
}