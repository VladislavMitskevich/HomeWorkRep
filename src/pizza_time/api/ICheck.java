package pizza_time.api;

import java.time.LocalDate;

public interface ICheck {
    int getNumber();
    IOrder getOrder(IOrder order);
    LocalDate getTime();


}
