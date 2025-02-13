package com.engineeringaakhib.journalApp.service;

import com.engineeringaakhib.journalApp.entity.User;
import com.engineeringaakhib.journalApp.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    // ✅ Constructor Injection: Correct way to inject UserRepository
    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Fetch user from the database
        User user = userRepository.findByUserName(username);

        // If user is not found, throw exception
        if (user == null) {
            throw new UsernameNotFoundException("User not found: " + username);
        }

        // Return UserDetails object for Spring Security
        return org.springframework.security.core.userdetails.User.builder()
                .username(user.getUserName())
                .password(user.getPassword())
                .roles(user.getRoles().toArray(new String[0])) // Convert List<String> to String[]
                .build();
    }
}
