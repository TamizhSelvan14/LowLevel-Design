import java.util.ArrayList;
import java.util.List;

public class Vehicle {

    public void startEngine(){
        System.out.println("vechiclee");
    }

}

//by implementing 2 new class this can be solved vehiclewithengine and vehiclewithoutengine

class VehicleWithEngine extends Vehicle{

    @Override
    public void startEngine() {
        System.out.println("engine started ");
    }
}

class VehicleWithoutEngine extends Vehicle{

    @Override
    public void startEngine() {
        System.out.println("doesnt have engine ");

    }
}

class Car extends VehicleWithEngine{

    @Override
    public void startEngine() {
        System.out.println("car");
        super.startEngine();

    }
}

class BiCycle extends VehicleWithoutEngine{

    @Override
    public void startEngine()  {
        System.out.println("bicycle");
        super.startEngine();
        //this is violation as Bicycle doesnt have engine
//        throw new EngineNotFoundException("misising")
//        throw  new NoSuchMethodException("missing engine");
//        try {
//            throw new NoSuchMethodException();
//        } catch (NoSuchMethodException e) {
//            throw new RuntimeException(e);
//        }
    }
}

class VehicleMonitor{
    public void startvechicles(){

        List<Vehicle> li=new ArrayList<Vehicle>();
        Vehicle car=new Car();
        Vehicle cycle=new BiCycle();


        li.add(car);
        li.add(cycle);

        li.forEach(vehicle->vehicle.startEngine());


    }
}


