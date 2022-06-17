import java.util.regex.*;
import java.util.*;
class UsernameRegEx{
public static void main(String [] args){

// username 1st character must be letter
// username min length 6 and max 15
// without 1st char numbers and underscores are allowed
  
  String regEx = "[a-zA-Z][a-zA-Z0-9_]{5,15}";
  Pattern p = Pattern.compile(regEx);

  Scanner sc = new Scanner(System.in);
  String username = sc.nextLine();
  Matcher m = p.matcher(username);

  if(m.find() && m.group().equals(username)){
   System.out.println("Valid Username");
  }
  else{
   System.out.println("Invalid Username");
  }
 }
}