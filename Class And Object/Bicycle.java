public class Bicycle{
 int cadence = 0;
 int speed = 0;
 int gear = 1;
 
void changeCadence(int newCadence){
 cadence = newCadence;
}

void changeGear(int newGear){
gear = newGear;

}
void changeSpeed(int newSpeed){
speed = newSpeed;

}
void printStates(){

System.out.println("cadence:"+cadence+"speed :"+speed+ "gear:"+gear);
}


public static void main(String [] args){

Bicycle byc1 = new Bicycle();
Bicycle byc2 = new Bicycle();  

byc1.printStates();
byc1.changeCadence(2);
byc1.changeSpeed(5);
byc1.changeGear(3);
byc1.printStates();
byc2.printStates();







}


}




