package model;

public class Users {
    String Name;
    double paid_amount;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPaid_amount() {
        return paid_amount;
    }

    public void setPaid_amount(double paid_amount) {
        this.paid_amount = paid_amount;
    }

    public Users(String name, double paid_amount) {
        Name = name;
        this.paid_amount = paid_amount;
    }
}
