public class StringConstantPool{
public static void main(String [] args){

//String s = "sathish";
//String s = "sathish";
String s1 = new String("sathish");
String s2 = new String("sathish");


System.out.println(s1.equals(s2));
System.out.println(s1 == s2);

}
}