package pizza_time.model;

import pizza_time.api.ICheck;
import pizza_time.api.IOrder;

import java.time.LocalDate;

public class Check implements ICheck {
    private int count = 0;

    @Override
    public int getNumber() {
        return count++;
    }

    @Override
    public IOrder getOrder(IOrder order) {
        return order;
    }

    @Override
    public LocalDate getTime() {
        return LocalDate.now();
    }
}
