class LearnString{
public static void main(String[] args){
String str = new String("Java");
System.out.println(str);

String str1 = "Sneha";
System.out.println(str1);

str = str.concat(" I like");
System.out.println(str);

str = str1.concat(" I like");
System.out.println(str);

System.out.println(str1.length());

System.out.println(str1.indexOf("n"));

System.out.println(str1.indexOf("z"));

System.out.println(str1.charAt(3));

System.out.println(str.toUpperCase());

System.out.println(str1.compareTo("Sneha"));
System.out.println(str1.compareTo("Sanskrit"));

}
}