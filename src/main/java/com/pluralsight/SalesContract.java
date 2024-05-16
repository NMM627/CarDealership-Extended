package com.pluralsight;

public class SalesContract extends Contract {

    private double salesTaxAmount;
    private double recordingFee;
    private double processingFee;
    private boolean financed;

    public double getSalesTaxAmount() {
        return salesTaxAmount;
    }

    public void setSalesTaxAmount(double salesTaxAmount) {
        this.salesTaxAmount = salesTaxAmount;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isFinanced() {
        return financed;
    }

    public void setFinanced(boolean financed) {
        this.financed = financed;
    }

    public SalesContract(String date, String customerName, String customerEmail, Vehicle vehicleSold, double salesTaxAmount, double recordingFee, double processingFee, boolean financed) {
        super(date, customerName, customerEmail, vehicleSold);
        this.salesTaxAmount = salesTaxAmount;
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.financed = financed;

    }

    @Override
    public double getTotalPrice() {
        return getVehicleSold().getPrice()
                + salesTaxAmount + recordingFee + processingFee;
    }

    @Override
    public double getMonthlyPayment() {
        if (financed) {
            double totalPrice = getTotalPrice();
            if (totalPrice >= 10_000) {
                return totalPrice*0.0425;
            } else {
                return totalPrice*0.0525;
            }
        } else {
            return 0;
        }
    }
}
