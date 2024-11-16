import Vehicles.NormalVehicle;
import Vehicles.OffRoadVehicle;
import Vehicles.SportVehicle;
import Vehicles.Vehicle;

public class App {
    public static void main(String[] args) throws Exception {
        Vehicle v1 = new SportVehicle();
        v1.drive();
        Vehicle v2 = new NormalVehicle();
        v2.drive();
        Vehicle v3 = new OffRoadVehicle();
        v3.drive();
    }
}
