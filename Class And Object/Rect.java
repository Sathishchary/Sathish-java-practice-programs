class Rect{
int length;
int width;
Rect(int l,int w){
length = l;
width = w;
}
void area(Rect r1){
     int areaOf = r1.length * r1.width;
     System.out.println("areaOf :"+areaOf);
   }
public static void main(String [] args){

 Rect r1 = new Rect(10,20);
    r1.area(r1);
// Rect r2 = new Rect();

   //r1.length = 10;
   //r1.width = 12;
 //r2.area(r1.length,r1.width);
}
}
