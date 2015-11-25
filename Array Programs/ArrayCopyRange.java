class ArrayCopyRange{
public static void main(String [] args){

char [] copyFrom = {'d','e','f','s','t','a','b','l','k','m','n'};

char[] copyTo = java.util.Arrays.copyOfRange(copyFrom,2,8); 

 System.out.println(new String(copyTo));


 }







}