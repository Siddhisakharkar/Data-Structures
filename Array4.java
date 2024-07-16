import java.util.Arrays;
class Array4
{
  public static void main(String args[])
  {
    int [] a = {10,20,30};
    
    int sum = 0;
    
    for(int i = 0 ; i < a.length ; i++)
    {
      sum = sum + a[i];
      
    }
    
    double avg = sum / a.length;
    System.out.println("The average of arrays is :" + avg);
  }
}