package ua.com.kievgreenclub.Model.Service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ua.com.kievgreenclub.Model.Entity.Plant;
import ua.com.kievgreenclub.Model.Repository.PlantRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PlantServiceTest {

    @Mock
    private PlantRepository plantRepository;

    @InjectMocks
    private PlantService plantService;

    @Test
    void testFindAllPlants() {
        List<Plant> plants = new ArrayList<>();
        plants.add(new Plant());
        plants.add(new Plant());
        when(plantRepository.findAll()).thenReturn(plants);
        List<Plant> result = plantService.findAllPlants();

        assertNotNull(result);
        assertEquals(2, result.size()); // Check if the list contains exactly 2 plants
    }

    @Test
    void testFindPlantById() {
        Plant plant = new Plant();
        plant.setId(1L);
        when(plantRepository.findById(1L)).thenReturn(Optional.of(plant));

        Optional<Plant> found = plantService.findPlantById(1L);

        assertTrue(found.isPresent()); // Check that the plant was found
        assertEquals(1L, found.get().getId()); // Check that the found plant's ID matches the expected ID
    }

    @Test
    void testSavePlant() {
        Plant plant = new Plant();
        plant.setName("Aloe Vera");
        when(plantRepository.save(any(Plant.class))).thenReturn(plant);

        Plant savedPlant = plantService.savePlant(plant);

        assertNotNull(savedPlant); // Ensure the plant was saved (not null)
        assertEquals("Aloe Vera", savedPlant.getName()); // Check that the saved plant's name is correct
    }

    @Test
    void testFindPlantsByName() {
        List<Plant> plants = new ArrayList<>();
        Plant plant1 = new Plant();
        plant1.setName("Basil");
        plants.add(plant1);
        when(plantRepository.findByNameContainingIgnoreCase("basil")).thenReturn(plants);

        List<Plant> result = plantService.findPlantsByName("basil");

        assertNotNull(result); // Check that the result is not null
        assertFalse(result.isEmpty()); // Check that the result list is not empty
        assertEquals("Basil", result.get(0).getName()); // Check that the plant's name matches the search query
    }

}
