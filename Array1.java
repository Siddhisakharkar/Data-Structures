import java.util.Arrays;
class Array1{
  public static void main(String args[])
  {
    int arr1[] = {20,10,67,54,33,89,100};
    
    System.out.println("The original array is :" + Arrays.toString(arr1));
    
    Arrays.sort(arr1);
     
    System.out.println("The Sorted array is :" + Arrays.toString(arr1));
    
    String arr2[] = {"Siddhi" , "Apurva" , "Rashmika" , "Seema" , "Kavita"};
    
    System.out.println("The original String array is :" +Arrays.toString(arr2));
    
    Arrays.sort(arr2);
    
    System.out.println("The sorted String array is :" + Arrays.toString(arr2));
    
  }
}