package arrayobjects;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 13/10/22
 * Time: 5:53 p. m.
 */

public class Person {

  private String name;
  private int age;

  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }

  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }

}
