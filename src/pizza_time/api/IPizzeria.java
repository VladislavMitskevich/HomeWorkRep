package pizza_time.api;

import java.time.LocalDate;

public interface IPizzeria {
    IMenu giveMenu();
    ICheck getCheck();
    LocalDate doPizza(int minute);
    String getInfo();


}
