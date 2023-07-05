//this is a example of class, object, state and method

public class CJava1 { // class corejava1 - cjava1
    int carSpeed;
    String carColor;

    public static void main(String[] args) {
        CJava1 car = new CJava1(); // car object created

        car.carSpeed = 0; // 0 value -> carSpeed
        car.carColor = "White"; // carColor set to white

        System.out.println("My car color  is " + car.carColor); // printing car color

        car.carAccelerates(); // method call on car
        car.carAccelerates();

        car.carBrakes(); // car brake method call
    }

    void carAccelerates() {//accelerates +10
        carSpeed += 10;
        System.out.println("Car Accelerating... \nCurrent speed = " + carSpeed + " km/h");
    }

    void carBrakes() {//brakes -10
        carSpeed -= 10;
        System.out.println("Car Braking... \nCurrent speed = " + carSpeed + " km/h");
    }
}