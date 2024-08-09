class LearnStringBuffer{
public static void main(String[] args){
StringBuffer sb = new StringBuffer("I like");
System.out.println(sb);

System.out.println("buffer = "+sb);
System.out.println("length = "+sb.length());
System.out.println("Capacity = " +sb.capacity());

sb.append(" Java");
System.out.println(sb);
}
}