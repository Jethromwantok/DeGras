package ng.com.nokt.demo_Jethro.service;

import ng.com.nokt.demo_Jethro.entities.Vehicle;

import java.util.List;

public interface VehicleService {

    Vehicle createVehicle(Vehicle vehicle);
    Vehicle updateVehicle(Long id, Vehicle vehicle);
    List<Vehicle> getAllVehicles();
    Vehicle getVehicleByPlateNumber(String plateNumber);
    void deleteVehicle(Long id);
}
