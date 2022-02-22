package com.project3.revtech.controller;

import com.project3.revtech.controller.AuthController;
import com.project3.revtech.exception.ApplicationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.authentication.AuthenticationManager;
import com.project3.revtech.exception.GlobalExceptionHandler;
import com.project3.revtech.dao.UserRepository;
import com.project3.revtech.entity.User;
import com.project3.revtech.entity.Role;
import com.project3.revtech.entity.ERole;
import com.project3.revtech.request.LoginRequest;
import com.project3.revtech.request.SignupRequest;
import com.project3.revtech.response.MessageResponse;


import com.project3.revtech.service.UserService;
import org.junit.Before;
import org.springframework.web.bind.annotation.RequestBody;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.mockito.Mockito;

import javax.validation.Valid;


public class AuthControllerTest {

    public static UserRepository userService;
    public static AuthController authController = new AuthController();
    public static SignupRequest signupRequest;
    public static LoginRequest loginRequest;



    @BeforeClass
    public void setup(){
        userService = Mockito.mock(UserRepository.class);
        signupRequest = Mockito.mock(SignupRequest.class);
        loginRequest = Mockito.mock(LoginRequest.class);
        authController.registerUser(signupRequest);
        authController.authenticateUser(loginRequest);


    }

    //This test passes, but with authController error, it doesn't bother to run it.
    @Test
    void getUserNameServiceByIdMock(){
        User returned_user = new User("alex", "alex@alex", "alex", "alex", "lara", "53232 S Springfield Ave", "Yes");
        Mockito.when(userService.getById(1)).thenReturn(returned_user);
        User mocked_user = userService.getById(1);
        Assert.assertEquals(mocked_user.getUsername(), "alex");
    }

    //This test passes, but with authController error, it doesn't bother to run it.
    @Test
    void getEmailServiceByIdMock(){
        User returned_user = new User("alex", "alex@alex", "alex", "alex", "lara", "53423 S Hardfield Ave", "Yes");
        Mockito.when(userService.getById(1)).thenReturn(returned_user);
        User mocked_user = userService.getById(1);
        Assert.assertEquals(mocked_user.getEmail(), "alex@alex");
    }

    //This test passes, but with authController error, it doesn't bother to run it.
    @Test
    void getUsernameServiceDuplicateMock(){
        Mockito.when(userService.existsByUsername("david")).thenReturn(true);
        User created_user = new User("david", "david@david", "david", "david", "Zazulak", "45343 S Avers Ave", "Perhaps");
        Mockito.when(userService.getById(2)).thenReturn(created_user);
        User mocked_created_user = userService.getById(2);
        Assert.assertEquals(mocked_created_user.getUsername(), "david");
    }

    //Not sure if it works or not, because of the error
    @Test
    void checkUsernameAndPasswordServiceMock(){
        User returned_user_login = new User("Alex", "Alex@Alex", "Alex", "Alex", "Lara", "54342 S Hardland Ave", "Chicago");
        Mockito.when(loginRequest.getUsername()).thenReturn("Alex");
        String mocked_created_user = loginRequest.getUsername();
        Assert.assertEquals(mocked_created_user, "Alex");


    }

    //Not sure if it works or not, because of the error
    @Test
    void checkUsernameAndEmailServiceMock(){
        User created_user = new User("eric", "eric@eric", "eric", "eric", "jennings", "3423423 S Texas", "Texas");
        Mockito.when(signupRequest.getEmail()).thenReturn(String.valueOf(created_user));
        String mocked_created_user = signupRequest.getEmail();
        Assert.assertEquals(mocked_created_user, "eric@eric");
    }


}
