//package com.engineeringaakhib.journalApp.service;
//
//import com.engineeringaakhib.journalApp.entity.User;
//import com.engineeringaakhib.journalApp.repository.UserRepository;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.*;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.ArrayList;
//
//import static org.mockito.Mockito.when;
//
//public class UserDetailsServiceImplTests {
//
//    @InjectMocks
//    private UserDetailsServiceImpl userDetailsServiceImpl;
//
//    @Mock
//    private UserRepository userRepository;
//
//    @BeforeEach
//    void setUp() {
//        // Use openMocks instead of initMocks
//        MockitoAnnotations.openMocks(this);
//    }
//
//    @Test
//    void loadUserByUsernameTest() {
//        // Mocking the repository call
//        when(userRepository.findByUserName(ArgumentMatchers.anyString()))
//                .thenReturn(User.builder().userName("ram").password("erwsdlf").roles(new ArrayList<>()).build());
//
//        // Calling the method under test
//        UserDetails user = userDetailsServiceImpl.loadUserByUsername("ram");
//
//        // Assertions to ensure the user is returned and not null
//        Assertions.assertNotNull(user);
//    }
//}
