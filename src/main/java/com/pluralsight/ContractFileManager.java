package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ContractFileManager {
    public void saveContract(Contract parameter){
        try {
            FileWriter fw=new FileWriter("contract.csv",true);
            BufferedWriter bw=new BufferedWriter(fw);

            if (parameter instanceof LeaseContract) {
                LeaseContract leaseContract = (LeaseContract) parameter;
                bw.newLine();
                bw.write(leaseContract.getCustomerName());
                bw.write("|");
                bw.write(leaseContract.getDate());
                bw.write("|");
                bw.write(leaseContract.getCustomerEmail());
                bw.write("|");
                bw.write(String.valueOf(leaseContract.getLeaseFee()));
                bw.write("|");
                bw.write(String.valueOf(leaseContract.getExpectedEndingValue()));
                bw.write("|");
                bw.write(leaseContract.getVehicleSold().toString());
            }
            if (parameter instanceof SalesContract){
                SalesContract salesContract = (SalesContract) parameter;
                bw.newLine();
                bw.write(salesContract.getCustomerName());
                bw.write("|");
                bw.write(salesContract.getDate());
                bw.write("|");
                bw.write(String.valueOf(salesContract.getSalesTaxAmount()));
                bw.write("|");
                bw.write(String.valueOf(salesContract.getProcessingFee()));
                bw.write("|");
                bw.write(String.valueOf(salesContract.getRecordingFee()));
                bw.write("|");
                bw.write(String.valueOf(salesContract.isFinanced()));
                bw.write("|");
                bw.write(String.valueOf(salesContract.getVehicleSold()));
            }


            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    }

