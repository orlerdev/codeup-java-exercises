import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        Person person1 = new Person("John");
        Person person2 = new Person("Sally");
        Person person3 = new Person("Dave");

        Person[] personArray = {person1, person2, person3};

        for (Person person : personArray) {
            System.out.println(person.getName());
        }
    }


    public static Person[] addPerson(Person[] person, Person newPerson) {
        Person[] newPersonArray = Arrays.copyOf(person, person.length + 1);
        newPersonArray[newPersonArray.length - 1] = newPerson;
        return newPersonArray;
    }




}
