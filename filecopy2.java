import java.io.*;
import java.util.*;

class filecopy2{
public static void main(String[] args){
Scanner sc=new  Scanner(System.in);
System.out.println("Enter the source filename :");
String source=sc.nextLine();
System.out.println("Where do you want to copy the contents :");
String destination=sc.nextLine();

try{
FileInputStream fin=new FileInputStream(source);
FileOutputStream fout=new FileOutputStream(destination);

int data;

while((data=fin.read()) != -1){
fout.write(data);
}
System.out.println("File copied successfully");
fin.close();
fout.close();
}
catch (Exception e){
System.out.println("Error "+e);
}
sc.close();
}
}
