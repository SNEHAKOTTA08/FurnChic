class LearnException1
{
public static void main(String[] args)
{

int a=10;
int b=0;
try{
int c=a/b;
}
finally{
System.out.println("I don't care where there is exception, come here for sure!");
}
}
}