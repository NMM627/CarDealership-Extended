package com.pluralsight;

public class LeaseContract extends Contract{
    private double expectedEndingValue;
    private double leaseFee;

    @Override
    public double getTotalPrice() {
        return getVehicleSold().getPrice() + leaseFee;
    }

    @Override
    public double getMonthlyPayment() {
        return getVehicleSold().getPrice()*.04;
    }

    public LeaseContract(String date, String customerName, String customerEmail, Vehicle vehicleSold) {
        super(date, customerName, customerEmail, vehicleSold);
        expectedEndingValue=vehicleSold.getPrice()*.5;
        leaseFee=vehicleSold.getPrice()*.07;
    }

    public double getExpectedEndingValue() {
        return expectedEndingValue;
    }

    public void setExpectedEndingValue(double expectedEndingValue) {
        this.expectedEndingValue = expectedEndingValue;
    }

    public double getLeaseFee() {
        return leaseFee;
    }

    public void setLeaseFee(double leaseFee) {
        this.leaseFee = leaseFee;
    }
}
