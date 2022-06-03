package com.prueba.Banitsmo.tasks;

import com.prueba.Banitsmo.userinterfaces.ElementosDOM;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Home implements Task {
    private ElementosDOM elementosDOM;
    public static Home Mainpage() {
        return Tasks.instrumented(Home.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(elementosDOM));
    }
}
