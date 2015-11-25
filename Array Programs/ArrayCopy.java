class ArrayCopy{
public static void main(String [] args){

char [] copyFrom = {'d','e','f','s','t','a','b','l','k','m','n'};
char [] copyTo = new char[7];

 System.arraycopy(copyFrom,2,copyTo,0,7);
 System.out.println(new String(copyTo));


 }







}