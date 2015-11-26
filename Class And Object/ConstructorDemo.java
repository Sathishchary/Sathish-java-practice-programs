class ConstructorDemo{
int value = 0;
String name = "Sathish";
ConstructorDemo(){
value = 1;
name ="charykotha";
 }
ConstructorDemo(int val ,String name1){
 value = val;
 name = name1;
 
}
void printDetails(){
System.out.println("value" +value+"name "+name);
}

public static void main(String [] args){

ConstructorDemo p = new ConstructorDemo();
p.printDetails();
ConstructorDemo p1 = new ConstructorDemo(12,"SathishKotha");
p1.printDetails();
//System.out.println("name" +name+" value :"+value);

}



}