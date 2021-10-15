package Demo;
import java.io.*;
public class Equals {
	public static void main(String []args) {
	  String a = "CSS";  
      String b = "CSS";
      if(a.equals(b)){   //checking the equality of objects using equals() methods  
          System.out.println("a & b are equal variables, and their respective hashvalues are:" + " "+ a.hashCode() + " & " + b.hashCode());
      }
      else {
    	  System.out.println("a & b are not equal");  
      }
}
}
