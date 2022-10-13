package arrayobjects;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 13/10/22
 * Time: 5:52 p. m.
 */

public class Main {

  public static void main(String[] args) {

    Person per[] = new Person[5];
    per[0] = new Person("Pedro",20);
    per[1] = new Person("Jaime",22);
    per[2] = new Person("Bulma",21);
    per[3] = new Person("Sam",29);
    per[4] = new Person("Carlos",26);

    Person myPer[] = {new Person("Hector", 10), new Person("Sabi", 20)};


    System.out.println("The old person is: " + AgeOld.personOld(per));
    System.out.println("################");
    System.out.println("The old person is: " + AgeOld.personOld(myPer));


  }

}
