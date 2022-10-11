package arrays;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 11/10/22
 * Time: 4:22 p. m.
 */

public class Main {

  public static void main(String[] args){

    // Define array and print in console
    int myArray[] = {2,4,5,100,1000};
    System.out.println(myArray[4]);

    System.out.println("Find number in array");

    for(int i = 0 ; i < myArray.length; i++){
      if(myArray[i] == 1000){
        System.out.println("Found number: " + myArray[i]);
      }else{
        System.out.println("Number not Found");
      }
    }

  }

}
