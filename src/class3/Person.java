
package class3;

public class Person implements Weighable {
    private String firstName;
    private String lastName;
    private int age;
    private static boolean alive = true;

    public static boolean isAlive() {
        return alive;
    }

    public Person() {
    }

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public double addWeight() {
        double addWeight = 15;
        return addWeight;
    }

    @Override
    public double loseWeight() {
        double loseWeight = 15;
        return loseWeight;
    }
 
}
