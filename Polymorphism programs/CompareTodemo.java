public class CompareTodemo{
public int compareTod(int a){
final int E = 8;
 if(E == a)return E;
 else return a;
}

public static void main(String [] args){
 CompareTodemo ct = new CompareTodemo();
  System.out.println("CompareTo Method");
   int value = ct.compareTod(6);
  System.out.println(value);
 
  int value1 = ct.compareTod(8);
System.out.println(value1);
     

}

}