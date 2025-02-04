package ng.com.nokt.demo_Jethro.repository;

import ng.com.nokt.demo_Jethro.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    @Query("SELECT vehicle FROM Vehicle vehicle WHERE vehicle.status='maintenance'")
    List<Vehicle> getVehicleStatus();
    List<Vehicle> getVehicleByCarryingWeightGreaterThan(float weight);

    Vehicle getVehicleByPlateNumber(String plateNumber);
}