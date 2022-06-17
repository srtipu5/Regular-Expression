import java.util.regex.*;
import java.util.*;
class MobileRex{
public static void main(String [] args){
// To print special character add double slash before like ('-','+','.') etc

// '|' use for or operator

// '?' use for may be exist or not

// {9} means no repeated occurrence 9 times

// {11,14} means min length 11 and max length 14
  
  String regEx = "((\\+88|88)?01[0-9]{9}){11,14}";
  Pattern p = Pattern.compile(regEx);

  Scanner sc = new Scanner(System.in);
  String phoneNo = sc.nextLine();
  Matcher m = p.matcher(phoneNo);

  if(m.find()){
   System.out.println("Valid Phone Number");
  }
  else{
   System.out.println("Invalid Phone Number");
  }
 }
}