package ua.com.kievgreenclub.model.Entities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.kievgreenclub.model.Entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
