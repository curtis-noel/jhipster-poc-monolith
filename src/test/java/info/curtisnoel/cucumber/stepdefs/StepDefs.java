package info.curtisnoel.cucumber.stepdefs;

import info.curtisnoel.JhmonolithpocApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhmonolithpocApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
