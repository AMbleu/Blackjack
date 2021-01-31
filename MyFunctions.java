public class MyFunctions{
  public void printArray(int[] arrayToPrint){
    for(int i = 0; i < arrayToPrint.length; i++){
      System.out.println(i + ": " + arrayToPrint[i]);
    }
  }
  public void printArray(int[] arrayToPrint, int[] arrayToPrint2){
    for(int i = 0; i < arrayToPrint.length; i++){
      System.out.println(i + ": " + arrayToPrint[i] + " | " + arrayToPrint2[i]);
    }
  }
  //Method to fill an integer array with random numbers
  public int[] fillArray(int[] arrayToFill){
    for(int i = 0; i < arrayToFill.length; i++){
      arrayToFill[i] = (int) (Math.random() * 10);
    }
    return arrayToFill;
  }
  public int[] resetArray(int[] arrayToZero){
    int[] zeroArray = new int[arrayToZero.length];
    for(int i = 0; i < arrayToZero.length; i++){
      zeroArray[i] = 0;
    }
    return zeroArray;
  }
  public int addArray(int[] arrayToAdd){
    int sum = 0;
    for(int i = 0; i< arrayToAdd.length; i++){
      sum += arrayToAdd[i];
    }
    return sum%100;
  }
}
