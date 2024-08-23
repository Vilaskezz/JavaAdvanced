package Sweetness;

/**
 * Created on 22.08.2024
 *
 * @author VSAfanasev
 */
public class Jellybean extends Sweetness {
    private final String topping; // начинка желейного торта

    public Jellybean(String sweetness_name,
            double weight,
            double price,
            String topping) {
        super(sweetness_name, weight, price);
        this.topping = topping;
    }

    @Override
    public String toString() {
        return super.toString() + ", начинка: " + topping + ";";
    }
}
