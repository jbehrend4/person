
package class3;

public class Class3 {

    public static void main(String[] args) {
        Person p1 = new Person("John", "Smith", 40);
        Person p2 = new Person("Jane", "Doe", 35);
        Person p3 = new Person("Joe", "Generic", 50);
        Person p4 = new Person("Jill", "Waters", 25);
        
        Person[] peopleList = new Person[] {p1, p2, p3, p4};       
        
        for (Person peopleList1 : peopleList) {
            System.out.print("Name: " + peopleList1.getFirstName() + " ");
            System.out.print(peopleList1.getLastName() + "  ");
            System.out.print("Age: " + peopleList1.getAge());
            System.out.println();
        }
    }
    
}
