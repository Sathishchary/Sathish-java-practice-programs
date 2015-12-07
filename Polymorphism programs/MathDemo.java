public class MathDemo{

public void divideValue(int a,int b){
 System.out.println(a/b);
}
public void divideValue(int a,double b){
 System.out.println(a/b);
}
public void divideValue(double a,double b){
 System.out.println(a/b);
}
public static void main(String [] args){
 MathDemo md = new MathDemo();
         md.divideValue(3,2);
         md.divideValue(3,2.0);
         md.divideValue(3.0,2.0);
 

}

}