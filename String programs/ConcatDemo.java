public class ConcatDemo{
public static void main(String [] args){
String s = (new StringBuilder()).append("Sathish").append("kotha").append("Chary").toString();
String s1 = "sathish" +"Chary";
System.out.println(s);
System.out.println(s1);
  }
}