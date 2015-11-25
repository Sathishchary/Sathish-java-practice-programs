public class Maxvalue{
public static void main(String [] args){

double [] values = {1.1,2.2,13.3,3.3,4.4,5.5};

 double max = values[0];
for(int i=1;i<values.length;i++){
 
 if(values[i]>max){
   max=values[i];
   }
 }
System.out.println("The Max Values is "+max);



}



}