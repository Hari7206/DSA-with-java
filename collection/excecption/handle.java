package collection.excecption;
// so ghere we gonna see that how we can do the exception handling in the java when we think there can be any error 
public class handle {
    public static void main(String[] args) {
        int arr[] = new int[6];
        System.out.println(arr[4]);
// now it can be print but if we give the extra bounding no it can't be print then 

// so if we know that we have an error here we will put the try and catch means exception handling here 

try {
    // in try we can try to run the code in which we think we can have any erorr
    System.out.println(5/0);
    System.out.println(arr[7]);  
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("The sever is getting something odd here");
    // so insted of any error we can see that it will print this . so that our sever or site insted of crashing it will print this 

}   // by the end of this here we can print the multiple catch for our error we can use the multiple catch here 
 catch (ArithmeticException e) {
    // System.out.println( "there is something wronng in your adding no ");
    System.out.println("i think you enter the wrong input " + e.getMessage());  // in here we can use the e onject for the multiple method of this by the already message of the java
}


// then we have the finally  keyword here which is used to print or to run no matter what of there is any exception or not 
finally  {
    System.out.println("this will run when there is any error or not ");
// this can't be run if we put he system.exit here 
}

//  catch( first exception || second exception )   // here we can see use the 2 exception using the pipe or we can say that one or 



// System.out.println(arr[7]);  // it throw an error of arrayindecoutof bound



System.out.println("hellow world");  // and if this error occur it can cause break in this and this can't be print throw we have an error in the upper case 
    }
}
