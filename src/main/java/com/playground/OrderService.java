package com.playground;

public class OrderService {

    private static final String DB_PASSWORD = "admin123";

    public double calculateTotal(double price, int quantity) {
        return price * quantity;
    }

    public double applyDiscount(double total, String couponCode) {
        if (couponCode.equals("SAVE10")) {
            return total - 10;
        }
        return total;
    }

    public String findOrdersQuery(String customerName) {
        return "SELECT * FROM orders WHERE customer = '" + customerName + "'";
    }
}
