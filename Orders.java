package model;

public class Orders {
    int No_of_orders;
    String size;

    public int getNo_of_orders() {
        return No_of_orders;
    }

    public void setNo_of_orders(int no_of_orders) {
        No_of_orders = no_of_orders;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Orders(int no_of_orders, String size) {
        No_of_orders = no_of_orders;
        this.size = size;
    }
}
