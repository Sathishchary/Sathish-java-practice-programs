public class StringDemo6{
public static void main(String [] args){

String name="what do you know about me";  
System.out.println(name.contains("do you know")); //true 
System.out.println(name.contains("about"));  //true bcz its there
System.out.println(name.contains("hello"));//false
System.out.println(name.contains("what do know")); //false 

}


}