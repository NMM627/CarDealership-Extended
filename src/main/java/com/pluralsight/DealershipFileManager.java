package com.pluralsight;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManager {

    public static final String FILE_NAME = "dealership.csv";

    public Dealership getDealership() {

        try {

            FileReader fileReader = new FileReader(FILE_NAME);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            if (line != null) {
                String[] dealershipParts = line.split("\\|");
                String name = dealershipParts[0];
                String address = dealershipParts[1];
                String phoneNumber = dealershipParts[2];
                Dealership dealership = new Dealership(name, address, phoneNumber);

                while ((line = bufferedReader.readLine()) != null) {
                    String[] parts = line.split("\\|");

                    int vehicleIdentificationNumber = Integer.parseInt(parts[0]);
                    int vehicleYear = Integer.parseInt(parts[1]);
                    String vehicleMake = parts[2];
                    String vehicleModel = parts[3];
                    String vehicleType = parts[4];
                    String vehicleColor = parts[5];
                    int vehicleMileage = Integer.parseInt(parts[6]);
                    double vehiclePrice = Double.parseDouble(parts[7]);

                    Vehicle vehicleName = new Vehicle(vehicleIdentificationNumber, vehicleYear, vehicleMake, vehicleModel, vehicleType, vehicleColor, vehicleMileage, vehiclePrice);

                    dealership.addVehicle(vehicleName);
                }

                return dealership;
            }
            return null;
        } catch (IOException e) {
            return null;
        }
    }
}
