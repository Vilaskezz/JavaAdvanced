package Sweetness;

/**
 * Created on 22.08.2024
 *
 * @author VSAfanasev
 */
public abstract class Sweetness {
    private String sweetness_name; // в поле содержится название сладости
    private double weight; // вес сладости
    private double price; // стоимость сладости

    public Sweetness(String sweetness_name, double weight, double price) {
        this.sweetness_name = sweetness_name;
        this.weight = weight;
        this.price = price;
    }

    public String getSweetness_name() {
        return sweetness_name;
    }

    public void setSweetness_name(String sweetness_name) {
        this.sweetness_name = sweetness_name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "   название сладости: " + sweetness_name + ", вес: " +
                weight + " гр., цена: " + price +" руб";
    }
}

