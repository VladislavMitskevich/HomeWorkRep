package pizza_time.dao;

import pizza_time.api.IPizza;

public enum EDishes implements IPizza {
    PEPPERONI(25.2),
    FOURCHEESE(21.0),
    RUNCH(27.2),
    HAWAIIAN(26.4),
    MEAT(24.8);
    private double price;

    EDishes(double price) {
        this.price = price;
    }

    public double getPrice(){
        return price;
    }
}
