public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Nurkyz");
        Person person2 = new Person("Burulai");
        Person person3 = new Person("Bermet");
        Person person4 = new Person("Erjigit");
        Person person5 = new Person("Aidana");
        Person person6 = new Person("Nurasyl");
        Person person7 = new Person("Meerim");
        Person person8 = new Person("Nursultan");
        Person person9 = new Person("Nurislam");

        Person[] uiBuloo1 = {person1,person2,person3};
        Person[] uiBuloo2 = {person4,person5,person6};
        Person[] uiBuloo3 = {person7,person8,person9};

        Hotel hotel = new Hotel(uiBuloo1);
        Obwaga obwaga = new Obwaga(uiBuloo2);
        Kvartira kvartira = new Kvartira(uiBuloo3);

        System.out.println("-----------------------------HOTEL----------------------------");
        hotel.arendaToloo();
        hotel.getUiBuloo();

        System.out.println("-----------------------------OBWAGA----------------------------");
        obwaga.arendaToloo();
        obwaga.getUiBuloo();

        System.out.println("-----------------------------KVARTIRA----------------------------");
        kvartira.komUslugaToloo();
        kvartira.getUiBuloo();

    }
}