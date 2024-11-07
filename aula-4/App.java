public class App{

    public static void main(String[] args) {
        Person eduardo = new Person("eduardo", 60);
        Person gabriel = new Person("gabriel", 58);
        Person aline = new Person("aline", 27);
        Person malu = new Person("malu", 55);
        Person raony = new Person("raony", 26);
        Person barbara = new Person("barbara", 9);
        Person marcela = new Person("marcela", 56);
        Person tales = new Person("tales", 30);

        aline.setFather(eduardo);
        aline.setMother(marcela);
        barbara.setFather(tales);
        barbara.setMother(aline);
        tales.setFather(gabriel);
        tales.setMother(malu);
        raony.setMother(malu); 

        System.out.println("the oldest person is " + barbara.getOldest());
    }
}