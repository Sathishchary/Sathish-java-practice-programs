public class Strings{
public static void main(String [] agrs){

String sr = "Strings are immutable";
String sr2 = "String are final";
StringBuffer sr3 = new StringBuffer("Strings are immutable");

boolean result = sr.contentEquals(sr3);


System.out.println(result);

}






}