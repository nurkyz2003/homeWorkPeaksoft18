public class Hotel implements  Arenda{
    private Person[] uiBuloo;
    public Hotel(Person[] uiBuloo){
        this.uiBuloo = uiBuloo;
    }
    @Override
    public void arendaToloo(){
        System.out.println("Biz arenda toloibuz!");
    }
    public void getUiBuloo(){
        System.out.println("Otelde jawagan adamdar: ");
        for (Person i : uiBuloo){
            System.out.println(i.getName());
        }
    }
}
