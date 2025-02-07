package ng.com.nokt.demo_Jethro.controllers;


import ng.com.nokt.demo_Jethro.entities.Vehicle;
import ng.com.nokt.demo_Jethro.service.ItemService;
import ng.com.nokt.demo_Jethro.service.VehicleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/vehicle")
public class VehicleController {

    private final ItemService itemService;
    private final VehicleService vehicleService;

    public VehicleController(ItemService itemService, VehicleService vehicleService) {
        this.itemService = itemService;
        this.vehicleService = vehicleService;
    }

    @PostMapping("/create-vehicle")
    ResponseEntity<Vehicle> createVehicle(@RequestBody Vehicle vehicle){
        vehicleService.createVehicle(vehicle);
        return ResponseEntity.ok(vehicle);
    }

    @GetMapping("/get-vehicle/{plateNumber}")
    ResponseEntity<Vehicle> getVehicleByPlateNumber(@PathVariable String plateNumber){
        Vehicle vehicle = vehicleService.getVehicleByPlateNumber(plateNumber);
        return ResponseEntity.ok(vehicle);
    }
}
