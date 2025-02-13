//package com.engineeringaakhib.journalApp.service;
//
//import com.engineeringaakhib.journalApp.entity.User;
//import com.engineeringaakhib.journalApp.repository.UserRepository;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ArgumentsSource;
//import org.junit.jupiter.params.provider.CsvSource;
//import org.junit.jupiter.params.provider.ValueSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//public class UserServiceTests {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private UserService userService;
//
//
//    @ParameterizedTest
//    @ArgumentsSource(UserArgumentsProvider.class)
//    public void testSaveNewUserName(User user) {
//        assertTrue(userService.saveNewUser(user));
//    }
//
//
//
//    @Disabled
//    @ParameterizedTest
//    @CsvSource({
//            "1, 1, 2",
//            "2, 10, 12",
//            "3, 3, 8"
//    })
//    public void test(int a, int b, int expected) {
//        assertEquals(expected, a + b);
//    }
//}
