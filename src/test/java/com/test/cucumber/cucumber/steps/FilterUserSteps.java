package com.test.cucumber.cucumber.steps;

import com.test.cucumber.cucumber.IUserService;
import com.test.cucumber.cucumber.UserConfiguration;
import com.test.cucumber.cucumber.UserDto;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

@ContextConfiguration(classes = UserConfiguration.class)
public class FilterUserSteps {

    @Autowired
    private IUserService userService;

    private List<UserDto> usersWithRolUser;

    @When("^se obtiene los usuarios con rol (.*)")
    public void debeObtenerTodosLosUsuariosConRol(final String rol){
        usersWithRolUser = userService.getUsers().stream().filter(userDto -> rol.equals(userDto.getRol())).collect(Collectors.toList());
    }

    @Then("^el número de usuarios obtenidos es (\\d+)")
    public void debeValidarElNumeroDeUsuariosObtenidos(final Integer numeroDeUsuarios) {
        assertEquals(Integer.valueOf(usersWithRolUser.size()),
                Integer.valueOf(numeroDeUsuarios));
    }
}