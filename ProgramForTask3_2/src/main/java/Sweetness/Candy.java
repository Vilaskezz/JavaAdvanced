package Sweetness;

/**
 * Created on 22.08.2024
 *
 * @author VSAfanasev
 */
public class Candy extends Sweetness{
    private String kind; // поле содержит наименование вида конфеты

    public Candy(String sweetness_name, double weight, double price, String kind) {
        super(sweetness_name, weight, price);
        this.kind = kind;
    }

    @Override
    public String toString() {
        return super.toString() + ", вид: " + kind + ";";
    }
}
