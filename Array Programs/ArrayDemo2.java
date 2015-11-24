public class ArrayDemo2{

public static void main(String [] args){

String[] s = new String[10];

for(int i=0; i < s.length; i++) {
    s[i] = "String no " + i;
 System.out.println( s[i] );
}

}

}
//output:
/* C:\Users\ksath\Documents\Books\java programs>java ArrayDemo2
String no 0
String no 1
String no 2
String no 3
String no 4
String no 5
String no 6
String no 7
String no 8
String no 9
*/