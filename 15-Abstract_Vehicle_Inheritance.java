// 15. Create an abstract 'Vehicle' class with derived classes 'Car' and `Bike'.

import java.util.*;
abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with a Key.");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with a Kick or Button.");
    }
}
