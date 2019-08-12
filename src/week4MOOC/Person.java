public class Person {
    private String name;
    private int age;

    public Person (String initialName){
        this.age = 0;
        this.name = initialName;
    }

    public void printPerson (){
        System.out.println(name + ", age " + age + " years");
    }

    public static void main(String[] args) {
        Person Pancho = new Person("Pancho");
        Person Damakos = new Person("Damakos");
        Person Milo = new Person("Milo");

        Pancho.printPerson();
        Damakos.printPerson();
        Milo.printPerson();
    }

}

