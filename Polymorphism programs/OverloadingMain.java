    class OverloadingMain{  
      public static void main(int a){  
      System.out.println(a);  
      }  
      public static void main(String s){
        System.out.println(s);
      }
        
      public static void main(String args[]){  
      System.out.println("main() method invoked");  
      main(10);  
      main("Sathish");
      }  
    }  