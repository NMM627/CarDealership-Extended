package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dealership {

    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;

    }

    public List<Vehicle> getVehiclesByPrice(double min, double max) {
        return null; // remove this line
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        return null; // remove this line
    }

    public List<Vehicle> getVehiclesByYear(double min, double max) {
        return null; // remove this line
    }

    public List<Vehicle> getVehiclesByColor(String color) {
        return null; // remove this line
    }

    public List<Vehicle> getVehiclesByMileage() {
        return null; // remove this line
    }

    public List<Vehicle> getVehiclesByType() {
        return null; // remove this line
    }

    public List<Vehicle> getAllVehicles() {
        return inventory;
    }
    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle){

    }

}

