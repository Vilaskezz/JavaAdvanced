package Gift;
import Sweetness.Sweetness;

/**
 * Created on 22.08.2024
 *
 * @author VSAfanasev
 */
public class Gift {
    private final Sweetness[] box; // массив с подарками
    private final String giftPerson; // Имя владельца
    private double giftWeight; // общий вес подарка
    private double giftPrice; // общая стоимость подарка
    private String giftSweetnessesDesc; // описание сладостей подарка

    public Gift(Sweetness[] box, String giftPerson) {
        this.box = box;
        this.giftPerson = giftPerson;
    }

    public double getGiftWeight() {
        return giftWeight;
    }

    public double getGiftPrice() {
        return giftPrice;
    }

    // на основании добавленных сладостей в массив сладостей расчитываются характеристики подарка
    private void calculateGift(){
        this.giftSweetnessesDesc = "Подарок " + giftPerson + "!\nСодержимое: \n";
        this.giftWeight = 0;
        this.giftPrice = 0;
        for (Sweetness someSweetness : box){
            this.giftSweetnessesDesc += someSweetness.toString() + "\n";
            this.giftWeight += someSweetness.getWeight();
            this.giftPrice += someSweetness.getPrice();
        }
    }

    /**
     * метод выводит информацию о подарке: кому предназначается подарок, состав сладостей, общий вес и сумму
     */
    public void printGiftInfo() {
        calculateGift();
        System.out.print(this);
        System.out.printf("Общий вес подарка = %.2f гр.\n", getGiftWeight());
        System.out.printf("Общая сумма подарка = %.2f руб\n", getGiftPrice());
    }
    @Override
    public String toString() {
        return giftSweetnessesDesc;
    }
}
