package shubham.design.splitwise.controllers;

import shubham.design.splitwise.dtos.RegisterUserRequestDto;
import shubham.design.splitwise.dtos.RegisterUserResponseDto;
import shubham.design.splitwise.models.User;
import shubham.design.splitwise.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@Controller
public class UserController {

    @Inject
    private UserService userService;

    public RegisterUserResponseDto registerUser(RegisterUserRequestDto request) {
        User user = userService.registerUser(request.getUsername(), request.getPassword(), request.getPhoneNumber());

        // create response
        RegisterUserResponseDto response = new RegisterUserResponseDto();
        response.setUsername(user.getUsername());
        response.setPassword(user.getUsername());
        response.setPhoneNumber(user.getPhoneNumber());
        return response;
    }
}
