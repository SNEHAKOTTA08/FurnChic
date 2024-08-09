class SangeethaException extends Exception
{
public SangeethaException(String str)
{}
}



class LearnException11
{
public static void main(String[] args) 
{
int a=10;
int b=0;
try{
if(b==0)
{
throw new SangeethaException("Please dont give a zero value !");
}
int c=a/b;
}
catch(SangeethaException ae)
{
System.out.println("sorry for the inconvenvience");
}
}
}