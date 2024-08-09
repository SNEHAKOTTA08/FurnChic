import java.io.*;

class FileWriterDemo
{
public static void main(String args[]) throws IOException
{

String source="We are learning Java";

char buffer[]=new char[source.length()];

FileWriter fw=new FileWriter("file1.txt");
fw.write(source);
fw.close();
}
}