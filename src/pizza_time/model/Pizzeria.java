package pizza_time.model;

import pizza_time.api.ICheck;
import pizza_time.api.IMenu;
import pizza_time.api.IOrder;
import pizza_time.api.IPizzeria;

import java.time.LocalDate;

public class Pizzeria implements IPizzeria {
    @Override
    public IMenu giveMenu() {
        return null;
    }

    @Override
    public ICheck getCheck() {
        return null;
    }

    @Override
    public LocalDate doPizza(IOrder order, int minute) {
        currentTime = order.getTime();
        return currentTime.plusMinutes(minute);
    }

    @Override
    public String getInfo() {
        return null;
    }
}
