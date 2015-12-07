public class CheckingEncapsulation{
 int i = 10;
 String name = "sathish";
void setName(){
  name = "chary";
 }

void getName(){
System.out.println(name);
}
int a =11;
String sa = "I am a developr";
System.out.println("job"+sa);
public static void main(String [] args){
 CheckingEncapsulation ce = new CheckingEncapsulation();

  ce.setName();
  ce.getName();


 }


}