package com.vityuk.ginger.examples;

import com.vityuk.ginger.Localization;
import com.vityuk.ginger.LocalizationBuilder;

import java.util.Date;
import java.util.Locale;

public class Application {
    private final LocalizableConstants constants;
    private final LocalizableMessages messages;

    public Application(Localization localization) {
        this.constants = localization.getLocalizable(LocalizableConstants.class);
        this.messages = localization.getLocalizable(LocalizableMessages.class);
    }

    public static void main(String[] args) {
        Localization localization = createLocalization();
        Application application = new Application(localization);

        setEnglishLocale();

        application.constants();
        application.messages();
        application.plurals();
        application.selectors();
    }


    public void constants() {
        System.out.println(constants.day());
        System.out.println(constants.weekStartDay());
        System.out.println(constants.weekDays());
    }

    public void messages() {
        int planet = 7;
        String event = "a disturbance in the Force";
        System.out.println(messages.planetEvent(planet, new Date(), event));
    }

    public void plurals() {
        System.out.println(messages.usersFound(0));
        System.out.println(messages.usersFound(1));
        System.out.println(messages.usersFound(2));
    }

    public void selectors() {
        System.out.println(messages.presentSent(Gender.FEMALE));
        System.out.println(messages.presentSent(Gender.MALE));
    }

    private static Localization createLocalization() {
        return new LocalizationBuilder()
                .withResourceLocation("classpath:demo.properties")
                .build();
    }

    private static void setEnglishLocale() {
        Locale.setDefault(Locale.ENGLISH);
    }
}
