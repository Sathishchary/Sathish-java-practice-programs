public class Rectangle{
int length;
int width;
Rectangle(){
 length =10;
 width =12;
  }
  Rectangle(int l ,int w ){
    length = l;
     width = w;
  }
void area(Rectangle Object){
 int areaOfRectangle = Object.length * Object.width;
 System.out.println("Area of Rectangle :"+areaOfRectangle);
}
void area(){
 int area1 = length * width;
 System.out.println("Area of Rectangle :"+area1);
}


public static void main(String [] args){
Rectangle Object = new Rectangle(10,20);
 Object.area(Object);
Rectangle r2 = new Rectangle();
  r2.area();

}
}