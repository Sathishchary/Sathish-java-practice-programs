//three dimensional 
public class ThreeDim{
public static void main(String [] args){
  
 int [][][] threeDim = new int[2][3][2];
   
       
 for(int i=0;i<2;i++){
     for(int j=0;j<3;j++){
       for(int k=0;k<2;k++){
           System.out.println(threeDim[i][j][k]);
       }
     }
  }
}

}