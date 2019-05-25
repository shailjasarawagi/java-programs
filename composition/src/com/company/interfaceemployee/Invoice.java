package com.company.interfaceemployee;

public class Invoice implements Payable{
    private int partNumber;
    private int price;
    private int quantity;

    public int getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String payment() {
        System.out.println("total payment");
      return "payment ::" +getPrice()*getQuantity();
    }
}
