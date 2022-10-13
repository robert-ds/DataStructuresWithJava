package arrayobjects;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 13/10/22
 * Time: 5:55 p. m.
 */

public class AgeOld {

  public static int personOld(Person[] person){
    int max = person[0].getAge();
    int i = 1;

    while(i < person.length){
      if(person[i].getAge() > max){
        max = person[i].getAge();
      }
      i++;
    }

    return max;
  }

}
