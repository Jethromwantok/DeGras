package ng.com.nokt.demo_Jethro.service;

import ng.com.nokt.demo_Jethro.entities.Vehicle;
import ng.com.nokt.demo_Jethro.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class VehicleServiceImpl implements VehicleService{

    //@Autowired alternate for the constructor
    private final VehicleRepository vehicleRepository;

    public VehicleServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Vehicle createVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle updateVehicle(Long id, Vehicle vehicle) {
        Optional<Vehicle> optionalVehicle = this.vehicleRepository.findById(id);
        if (optionalVehicle.isPresent()){
            Vehicle newVehicle = optionalVehicle.get();
            newVehicle.setName(vehicle.getName());
            newVehicle.setItems(vehicle.getItems());

            vehicleRepository.save(newVehicle);
            return newVehicle;

        }else {
            throw new RuntimeException("Record Not Found!");
        }
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public Vehicle getVehicleByPlateNumber(String plateNumber) {
        return vehicleRepository.getVehicleByPlateNumber(plateNumber);
    }

    @Override
    public void deleteVehicle(Long id) {
        vehicleRepository.deleteById(id);

    }
}
