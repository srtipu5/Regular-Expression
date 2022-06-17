import java.util.regex.*;
import java.util.*;
class EmailRegEx{
public static void main(String [] args){

// To Check valid gmail and yahoo email only
  
  String regEx = "[a-zA-Z0-9][a-zA-Z0-9._]*@(gmail|yahoo)[.]com";
  Pattern p = Pattern.compile(regEx);

  Scanner sc = new Scanner(System.in);
  String email = sc.nextLine();
  Matcher m = p.matcher(email);

  if(m.find() && m.group().equals(email)){
   System.out.println("Valid Email");
  }
  else{
   System.out.println("Invalid Email");
  }
 }
}