package ng.com.nokt.demo_Jethro.repository;

import ng.com.nokt.demo_Jethro.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {


}
