package com.company.interfaceemployee;

public class HourlyEmployee extends Employee {
    private int hour;
    private  int rates;

    @Override
    public void earning() {
        System.out.println(" Hourly Employee");
        HourlyEmployee hourlyEmployee = new HourlyEmployee();
        hourlyEmployee.setName("Aashish");
        hourlyEmployee.setAddress("sanepa");
        hourlyEmployee.setId(4);
        hourlyEmployee.setHour(3);
        hourlyEmployee.setRates(450);
        hourlyEmployee.TotalEarning();
        System.out.println(hourlyEmployee.toString());
        System.out.println(hourlyEmployee.TotalEarning());

    }

    private String TotalEarning() {
        return "total earning of employee:::" +getHour()*getRates() ;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }


    @Override
    public String toString(){
        return  super.toString() +    " hour of employee :::" +getHour() ;
    }

    public int getRates() {
        return rates;
    }

    public void setRates (int rates) {
        this.rates = rates;
    }


    @Override
    public String payment() {

        return null;
    }
}
