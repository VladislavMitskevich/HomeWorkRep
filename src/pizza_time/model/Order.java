package pizza_time.model;

import pizza_time.api.IOrder;
import pizza_time.api.IPizza;
import pizza_time.dao.EDishes;

import java.util.HashMap;
import java.util.Map;

public class Order implements IOrder {
    private HashMap<EDishes, Integer> order;

    @Override
    public void addToOrder(IPizza dishes, Integer cont) {
        order.put((EDishes) dishes, cont);
    }

    @Override
    public void removeFromOrder(IPizza dishes, Integer cont) {
        order.remove(dishes, cont);
    }

    public HashMap<EDishes, Integer> getOrder() {
        return order;
    }

    public double getSum() {
        double sum = 0;
        for (Map.Entry<EDishes, Integer> sg : order.entrySet()) {
            sum = sum + sg.getKey().getPrice() * sg.getValue();
        }
        return sum;
    }
}
