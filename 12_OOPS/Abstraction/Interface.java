
interface Bank{
   public abstract  void payment(int amount);

}

class UPI implements Bank{
    public void payment(int amount){
        System.out.println(amount+" paid by UPI");
    }
}
class Card implements Bank{
    public void payment(int amount){
        System.out.println(amount+" paid by Card");
    }
}


public class Interface{
    public static void main(String[] args) {
        Bank b = new UPI();
        b.payment(3000);
        Bank card = new Card();
        card.payment(6000);

    }
}