import java.util.Arrays;

public class W3SchoolsTest{
  public static void main(String[] args){
    Card test = new Card();
    test.displayCard(305, 310);
    test.displayCard(209, 111);
  }

 //Method used to print all the values of an array
 public static void printArray(int[] arrayToPrint){
   for(int i = 0; i < arrayToPrint.length; i++){
     System.out.println(i + ": " + arrayToPrint[i]);
   }
 }
 public static void printArray(int[] arrayToPrint, int[] arrayToPrint2){
   for(int i = 0; i < arrayToPrint.length; i++){
     System.out.println(i + ": " + arrayToPrint[i] + " | " + arrayToPrint2[i]);
   }
 }
 //Method to fill an integer array with random numbers
 public static int[] fillArray(int[] arrayToFill){
   for(int i = 0; i < arrayToFill.length; i++){
     arrayToFill[i] = (int) (Math.random() * 10);
   }
   return arrayToFill;
 }

}
