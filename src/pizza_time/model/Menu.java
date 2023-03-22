package pizza_time.model;

import pizza_time.api.IMenu;
import pizza_time.api.IPizza;
import pizza_time.dao.EDishes;

import java.util.List;

public class Menu implements IMenu {
    private List<IPizza> menu;

    public Menu() {
        EDishes[] dishes = EDishes.values();
        for (EDishes value: dishes){
            menu.add(value);
        }
    }

    @Override
    public void addDishes(IPizza dishes) {
        menu.add(dishes);

    }

    @Override
    public void removeDishes(IPizza dishes) {
        menu.remove(dishes);
    }
}
