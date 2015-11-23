public class StringDemo5{
public static void main(String [] args){

String name="sathish";  
String s1=String.format("name is %44s",name);  
String s2=String.format("value is %f",32.33434);  
String s2=String.format("value is %44d",32);
String s3=String.format("value is %44f",32.33434);//returns 12 char fractional part filling with 0  
  
System.out.println(s1);  
System.out.println(s2);  
System.out.println(s3);  

}


}