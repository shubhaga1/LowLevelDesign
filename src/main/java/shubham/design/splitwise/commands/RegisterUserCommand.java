package shubham.design.splitwise.commands;

import shubham.design.splitwise.controllers.UserController;
import shubham.design.splitwise.dtos.RegisterUserRequestDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RegisterUserCommand implements Command {
    private static final Logger LOGGER = LoggerFactory.getLogger(RegisterUserCommand.class);

    private UserController userController;

    @Autowired
    public RegisterUserCommand(UserController userController) {
        this.userController = userController;
    }

    @Override
    public boolean parse(String commandLine) {
        List<String> commandTokens = Arrays.stream(commandLine.split(" ")).collect(Collectors.toList());
        if (commandTokens.size() != 4) {
            LOGGER.info("This is not a Register user command");
            return false;
        }

        String firstToken = commandTokens.get(0);

        if (firstToken.equalsIgnoreCase(CommandKeywords.REGISTER_USER_TOKEN) == false) {
            return false;
        }
        return true;
    }

    @Override
    public void execute(String commandLine) {
        LOGGER.info("input command : " + commandLine);
        List<String> commandTokens = Arrays.stream(commandLine.split(" ")).collect(Collectors.toList());

        RegisterUserRequestDto request = new RegisterUserRequestDto();
        String userName = commandTokens.get(0);
        String hashedPassword = commandTokens.get(1);
        String phoneNumber = commandTokens.get(2);

        request.setUsername(userName);
        request.setPassword(hashedPassword);
        request.setPhoneNumber(phoneNumber);
        userController.registerUser(request);
    }
}
