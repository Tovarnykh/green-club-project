package ua.com.kievgreenclub.service;

import org.springframework.stereotype.Service;
import ua.com.kievgreenclub.model.Entities.User;
import ua.com.kievgreenclub.service.exception.UserException;

public interface UserService {

    User findUserById(Long userId) throws UserException;

    User findUserProfileByJwt(String jwt) throws UserException;

}
