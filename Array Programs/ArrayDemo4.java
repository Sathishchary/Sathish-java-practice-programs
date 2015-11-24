public class ArrayDemo4{
public static void main(String [] args){
int[] ints = {0,2,4,6,8,10};

int maxVal = Integer.MIN_VALUE;
for(int i=0; i < ints.length; i++){
    if(ints[i] > maxVal){
        maxVal = ints[i];
    }
}
System.out.println("maxVal = " + maxVal);



}



}