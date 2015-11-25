//passing arrays to methods
public class PrintArray{
public static void printArray(int [] array){
  for(int i=0;i<array.length;i++){
       System.out.println(array[i] + ""); 
    }

}
public static void main(String [] args){

int [] arrayValues = {1,2,3,5,8,3,6,0};
   printArray(arrayValues);
System.out.println("Passing array to methods");

}



}
