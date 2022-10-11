package arrays;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 11/10/22
 * Time: 4:43 p. m.
 */

import javax.swing.JOptionPane;

  /*
  We are asked to enter the 6 grades of a student in an array.
  Then we will show the approved grades.
  And we will also show how many grades you passed.
  */

public class secondExample {

  public static void main(String[] args){

    double calif[] = new double[6];
    System.out.println("Insert grades");
    System.out.println("###########################");

    for(int i = 0; i < calif.length ; i++){
      calif[i] = Double.parseDouble(JOptionPane.showInputDialog(null,"Insert grades: "+ (i+1)));
    }

    // Print all grades insert
    for(int i = 0; i < calif.length ; i++){
      System.out.println("Grades: " + calif[i]);
    }

    System.out.println("###########################");

    int counter = 0;
    for(int i = 0; i < calif.length; i++){
      if(calif[i] >= 6){
        System.out.println("Grades approved: " + calif[i]);
        counter++;
      }
    }

    System.out.println("Total grades: " + counter);

  }

}
