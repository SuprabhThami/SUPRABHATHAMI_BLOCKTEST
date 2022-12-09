package model;

public class Items {
    String Item_name;
    int Code;
    String Brand;
    double Price;

    public String getItem_name() {
        return Item_name;
    }

    public void setItem_name(String item_name) {
        Item_name = item_name;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public Items(String item_name, int code, String brand, double price) {
        Item_name = item_name;
        Code = code;
        Brand = brand;
        Price = price;
    }
}
