package com.prueba.Banitsmo.tasks;

import com.prueba.Banitsmo.userinterfaces.ElementosDOM;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Download implements Task {
    public static Download DownloadPdf() {
        return Tasks.instrumented(Download.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Click.on(ElementosDOM.BTNDOWLOADCONTRACT));
    }
}
