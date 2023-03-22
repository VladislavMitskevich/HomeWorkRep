package pizza_time.api;

public interface IOrder {
    void addToOrder(IPizza dishes, Integer count);
    void removeFromOrder(IPizza dishes, Integer count);


}
