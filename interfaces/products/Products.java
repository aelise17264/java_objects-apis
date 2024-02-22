package interfaces.products;

public interface Products {
    
    String getName();
    void setName(String name);

    default double getPrice(){ return 50;};
    default void setPrice(double price){};

}
