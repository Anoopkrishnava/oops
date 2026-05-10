import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
class filemanage{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter filename :");
String filename=sc.nextLine();

try{
FileWriter filewriter=new FileWriter(filename);
System.out.println("Enter the file contents :");
String contents=sc.nextLine();

filewriter.write(contents);
filewriter.close();
System.out.println("File contents \n");

FileReader filereader=new FileReader(filename);
int data = filereader.read();

while(data != -1){
System.out.print((char) data);
data = filereader.read();
}
filereader.close();
}
catch (Exception e)
{
System.out.println("Unable to create file ");
}
sc.close();
