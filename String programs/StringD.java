//string str= abcdefglllllgsssssssabcd
class StringD{
public static void main(String [] args){

 String url = "videos/2/16102015/natureshort.mp4";
 //int length = str.length();
 String strrcut = url.substring(0,url.lastIndexOf("."))+".m3u8";
 
  System.out.println("the strcut is "+strrcut);

}
}



