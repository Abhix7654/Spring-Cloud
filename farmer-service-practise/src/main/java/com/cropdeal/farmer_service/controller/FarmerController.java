package com.cropdeal.farmer_service.controller;
import com.cropdeal.farmer_service.model.Farmer;
import com.cropdeal.farmer_service.service.FarmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/farmer")
public class FarmerController {

    @Autowired
    private FarmerService farmerService;

    @GetMapping
    public List<Farmer> getAllFarmers(){
        return farmerService.getAllFramers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Farmer> getFarmerById(@PathVariable Long id) {
        Farmer farmer = farmerService.getFarmerById(id);
        return farmer != null ? ResponseEntity.ok(farmer) : ResponseEntity.notFound().build();
    }
    @PostMapping
    public Farmer addFarmer(@RequestBody Farmer farmer) {
        return farmerService.addFarmer(farmer);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Farmer> updateFarmer(@PathVariable Long id, @RequestBody Farmer farmer) {
        Farmer updatedFarmer = farmerService.updateFarmer(id, farmer);
        return updatedFarmer != null ? ResponseEntity.ok(updatedFarmer) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFarmer(@PathVariable Long id) {
        farmerService.deleteFarmer(id);
        return ResponseEntity.noContent().build();
    }
}

