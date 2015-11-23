public class TestMain{
  int i=10;
  int j=20;
void getPrint(int k,int l){
 this.i=k;
 this.j=l;

}
 int showPrint(){
 System.out.println("I value is "+i+"\n"+"J value is "+j);
return 0;
}
public static void main(String [] ags){
TestMain Ts = new TestMain();
System.out.println("Sathish");
 Ts.getPrint(40,50);
 Ts.showPrint();
 Ts.getPrint(5,3);
Ts.showPrint();

}


}