public class Kvartira implements komUsluga{
    private Person[] uiBuloo;
    public Kvartira(Person[] uiBuloo){
        this.uiBuloo = uiBuloo;
    }
    @Override
    public void komUslugaToloo(){
        System.out.println("Biz komUsluga toloibuz!");
    }
    public void getUiBuloo(){
        System.out.println("Kvartirada jawagan adamdar:");
        for (Person i : uiBuloo){
            System.out.println(i.getName());
        }
    }
}
