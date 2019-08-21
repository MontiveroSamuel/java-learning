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
        Person pancho = new Person("pancho");
        Person damakos = new Person("damakos");
        Person milo = new Person("milo");

        pancho.printPerson();
        damakos.printPerson();
        milo.printPerson();
    }

}

