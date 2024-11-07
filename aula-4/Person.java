public class Person {

    private String name;
    private Person mother, father;
    private int age;

    //Constructor

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    //Setters

    public void setFather(Person father) {
        this.father = father;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    //Getters

    public Person getFather() {
        return father;
    }

    public Person getMother() {
        return mother;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person getOldest(){
        if(this.father == null && this.mother == null) return this;

        if(this.father == null) return this.mother.getOldest();
        if(this.mother == null) return this.father.getOldest();

        return this.mother.getOldest().getAge() > this.father.getOldest().getAge() ? this.mother.getOldest() : this.father.getOldest();
    }

    //Others

    public String toString() {
        return this.name + " (" + this.age + " years old) ";
    }


}