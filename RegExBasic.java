import java.util.regex.*;
class RegExBasic{
public static void main(String [] args){
// public static Pattern compile(String regEx);
 Pattern p = Pattern.compile("ab");

// public Matcher matcher(String mainString);
 Matcher m = p.matcher("abcabdababs");

 int count = 0;

// public boolean find();
while(m.find()){
count++;
// public String group();
System.out.print("Search Group: " + m.group());

// public int start(); return first index
// public int end(); return (last index + 1)
System.out.println(" Start Index: "+ m.start()+" End Index: "+ (m.end()-1));
}
System.out.println("Total Occurance: " + count);
}
}