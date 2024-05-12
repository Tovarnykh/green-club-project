package ua.com.kievgreenclub.service.impl;

import org.springframework.stereotype.Service;
import ua.com.kievgreenclub.config.JwtProvider;
import ua.com.kievgreenclub.model.Entities.User;
import ua.com.kievgreenclub.model.repository.UserRepository;
import ua.com.kievgreenclub.service.UserService;
import ua.com.kievgreenclub.service.exception.UserException;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private JwtProvider jwtProvider;

    public UserServiceImpl(UserRepository userRepository, JwtProvider jwtProvider) {
        this.userRepository = userRepository;
        this.jwtProvider = jwtProvider;
    }

    @Override
    public User findUserById(Long userId) throws UserException {
        Optional<User> user = userRepository.findById(userId);

        if(user.isPresent()){
            return user.get();
        }

        throw new UserException("User not found with id" + userId);
    }

    @Override
    public User findUserProfileByJwt(String jwt) throws UserException {
        String email = jwtProvider.getEmailFromToken(jwt);
        User user =userRepository.findByEmail(email);

        if (user==null){
            throw new UserException("User not found with email " + email);
        }

        return user;
    }
}
