package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    void display() {
        init();
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;
        while (shouldContinue) {
            System.out.println("1-Find vehicles within a price range");
            System.out.println("2-Find vehicles by make / model");
            System.out.println("3-Find vehicles by year range");
            System.out.println("4-Find vehicles by color");
            System.out.println("5-Find vehicles by mileage range");
            System.out.println("6-Find vehicles by type(car,truck,SUV,van");
            System.out.println("7-List ALL vehicles");
            System.out.println("8-Add a vehicle");
            System.out.println("9-Remove a vehicle");
            System.out.println("99-Quit");

            String input = scanner.nextLine();

            switch (input) {
                case "1" -> { processGetByPriceRequest(); }
                case "2" -> { processGetByMakeModelRequest();}
                case "3" -> { processGetByYearRequest();}
                case "4" -> { processGetByColorRequest();}
                case "5" -> { processGetByMileageRequest();}
                case "6" -> { processGetVehicleTypeRequest();}
                case "7" -> { processAllVehiclesRequest();}
                case "8" -> { processAddVehicleRequest();}
                case "9" -> { processRemoveVehicleRequest();}
                case "99" -> {
                    shouldContinue = false;
                }
            }
        }
    }

    private void init() {
    }

    private void displayVehicles(List<Vehicle> parameter) {
    }

    private void processAllVehiclesRequest(){

    }

    void processGetByPriceRequest() {


    }

    void processGetByMakeModelRequest() {

    }

    void processGetByYearRequest() {


    }

    void processGetByColorRequest() {
    }

    void processGetByMileageRequest() {
    }

    void processGetVehicleTypeRequest() {
    }

    void processGetAllVehiclesRequest() {
    }

    void processAddVehicleRequest() {
    }

    void processRemoveVehicleRequest() {

    }
}

