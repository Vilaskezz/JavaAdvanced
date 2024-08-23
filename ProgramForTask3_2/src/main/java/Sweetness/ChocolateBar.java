package Sweetness;

/**
 * Created on 22.08.2024
 *
 * @author VSAfanasev
 */
public class ChocolateBar extends Sweetness {
    private final double cocoaPercentage; // информация о проценте какао в плитке

    public ChocolateBar(String sweetness_name,
            double weight,
            double price,
            double cocoaPercentage) {
        super(sweetness_name, weight, price);
        this.cocoaPercentage = cocoaPercentage;
    }

    @Override
    public String toString() {
        return super.toString() + ", процент какао " + cocoaPercentage + ";";
    }
}
