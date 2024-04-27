package ua.com.kievgreenclub.Model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.kievgreenclub.Model.Entity.Plant;

import java.util.List;

@Repository
public interface PlantRepository extends JpaRepository<Plant, Long> {

    List<Plant> findByNameContainingIgnoreCase(String name);

}
