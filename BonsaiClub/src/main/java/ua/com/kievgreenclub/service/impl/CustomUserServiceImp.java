package ua.com.kievgreenclub.service.impl;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ua.com.kievgreenclub.model.Entities.User;
import ua.com.kievgreenclub.model.Entities.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomUserServiceImp implements UserDetailsService {

    private UserRepository userRepository;

    public CustomUserServiceImp(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(username);
        if(user==null){
            throw new UsernameNotFoundException("user not found with email - "+username);
        }

        List<GrantedAuthority> authorities = new ArrayList<>();
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), authorities);
    }
}
