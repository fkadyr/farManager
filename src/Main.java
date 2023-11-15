package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;



public class Main {
    public static void main(String[] args) {
        Car[] cars1 = new Car[500];

        for (int i = 0; i< 500; i++) {
            int randomValue = ThreadLocalRandom.current().nextInt(0, 3);
            if (randomValue == 0) {
                cars1[i] = new ElectricCar();
            } else if (randomValue == 1) {
                cars1[i] = new PetrolCar();
            } else if (randomValue == 2) {
                cars1[i] = new HybridCar();
            }
        }

        for (Car car:cars1){
            System.out.println(car.description());
        }
    }
}
