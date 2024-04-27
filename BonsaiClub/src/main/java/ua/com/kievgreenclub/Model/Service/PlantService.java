package ua.com.kievgreenclub.Model.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.kievgreenclub.Model.Entity.Plant;
import ua.com.kievgreenclub.Model.Repository.PlantRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PlantService {

    private final PlantRepository plantRepository;

    @Autowired
    public PlantService(PlantRepository plantRepository) {
        this.plantRepository = plantRepository;
    }

    public List<Plant> findAllPlants() {
        return plantRepository.findAll();
    }

    public Optional<Plant> findPlantById(Long id) {
        return plantRepository.findById(id);
    }

    public Plant savePlant(Plant plant) {
        return plantRepository.save(plant);
    }

    public List<Plant> findPlantsByName(String name) {
        return plantRepository.findByNameContainingIgnoreCase(name);
    }

}
