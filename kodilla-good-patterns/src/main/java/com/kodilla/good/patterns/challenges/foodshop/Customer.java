package com.kodilla.good.patterns.challenges.foodshop;

public class Customer {
    private String customerName;
    private String address;

    public Customer(String customerName, String address) {
        this.customerName = customerName;
        this.address = address;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (!customerName.equals(customer.customerName)) return false;
        return address.equals(customer.address);
    }

    @Override
    public int hashCode() {
        int result = customerName.hashCode();
        result = 31 * result + address.hashCode();
        return result;
    }
}
