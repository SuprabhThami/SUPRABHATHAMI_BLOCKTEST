import model.Items;
import model.Orders;
import model.Users;

import java.util.ArrayList;


public class main {
    public static void main(String[] args) {
        ArrayList<Items> ItemsList = new ArrayList<Items>();
        ArrayList<Users> UsersList = new ArrayList<Users>();
        ArrayList<Orders> OrdersList = new ArrayList<Orders>();
        Items i1 = new Items("mT-shirt", 5666, "Levis", 1234);
        Items i2 = new Items("oT-shirt", 5455, "BlackBerry", 1222);
        Items i3 = new Items("BlackT", 5887, "Vans", 1199);
        Items i4 = new Items("Blazer", 4555, "Alks", 1550);
        Items i5 = new Items("fT-shirt", 2555, "Nike", 1299);

        Users u1 = new Users("Danish_Shah", 12350);
        Users u2 = new Users("Ocean_Chapagain", 1300);

        Orders o1 = new Orders(4,"L");
        Orders o2 = new Orders(3, "M, L, L");

        ArrayList<Items> items_u1=new ArrayList<>();
        items_u1.add(i1);
        items_u1.add(i2);

        ArrayList<Items> items_u2=new ArrayList<>();
        items_u2.add(i3);
        items_u2.add(i4);

        OrdersList.add(o1);
        OrdersList.add(o2);
    }

}
