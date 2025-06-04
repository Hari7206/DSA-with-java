package Array.arrayproblem;

public class probl {
  public static void main(String[] args) {
   int arr[] = { 45 , 67 , 78 , 89 , 90 , 102};
    boolean result = isshorted(arr);
    System.out.println(result);
  }  
  public static  boolean isshorted (int arr[])  {
     for (int i = 1; i < arr.length; i++) {
    if (arr[i] >= arr[i-1] ) {
    return true;
    }
}
return false;
  }
}
