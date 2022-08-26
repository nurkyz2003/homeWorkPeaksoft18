public class Obwaga implements Arenda {
    private Person[] uiBuloo;
    public Obwaga (Person[] uiBuloo){
        this.uiBuloo = uiBuloo;
    }
    @Override
    public void arendaToloo(){
        System.out.println("Biz arenda toloibuz!");
    }
    public void getUiBuloo(){
        System.out.println("Obwagada jawagan adamdar:");
        for (Person i : uiBuloo){
            System.out.println(i.getName());
        }
    }
}
