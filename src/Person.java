public class Person {
    public static void main(String[] args) {
        Person Jack = new Person("Jack");
        Jack.sayHello();

        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

        Person person3 = new Person("Sam");
        Person person4 = person3;
        System.out.println(person3 == person4);

        Person person5 = new Person("Antonio");
        Person person6 = person5;
        System.out.println(person5.getName());
        System.out.println(person6.getName());
        person6.setName("Antonia");
        System.out.println(person5.getName());
        System.out.println(person6.getName());

    }
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void sayHello() {
        System.out.printf("Hello %s.%n", getName());
    }
    public Person(String name) {
        this.name = name;
    }

}
