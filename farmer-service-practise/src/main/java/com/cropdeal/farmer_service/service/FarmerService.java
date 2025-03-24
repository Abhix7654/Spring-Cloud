package com.cropdeal.farmer_service.service;
import  com.cropdeal.farmer_service.model.Farmer;
import com.cropdeal.farmer_service.repository.FarmerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import  java.util.List;
import java.util.Optional;

@Service
public class FarmerService {
    @Autowired
    private FarmerRepository farmerRepository;

    public List<Farmer> getAllFramers(){
        return farmerRepository.findAll();
    }

    public Farmer getFarmerById(Long id){
        return farmerRepository.findById(id).orElse(null);
    }
    public Farmer addFarmer(Farmer farmer){
        return farmerRepository.save(farmer);
    }
    public Farmer updateFarmer(Long id, Farmer farmerDetails) {
        Optional<Farmer> optionalFarmer = farmerRepository.findById(id);
        if (optionalFarmer.isPresent()) {
            Farmer farmer = optionalFarmer.get();
            farmer.setName(farmerDetails.getName());
            farmer.setEmail(farmerDetails.getEmail());
            farmer.setPhone(farmerDetails.getPhone());
            farmer.setLocation(farmerDetails.getLocation());
            return farmerRepository.save(farmer);
        }
        return null;
    }

    public void deleteFarmer(Long id) {
        farmerRepository.deleteById(id);
    }
}
