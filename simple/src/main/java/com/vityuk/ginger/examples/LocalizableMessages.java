package com.vityuk.ginger.examples;

import com.vityuk.ginger.Localizable;
import com.vityuk.ginger.PluralCount;
import com.vityuk.ginger.Select;

import java.util.Date;

/**
 * @author Andriy Vityuk
 */
public interface LocalizableMessages extends Localizable {
    String planetEvent(int planet, Date eventDate, String event);

    String usersFound(@PluralCount int usersCount);

    String presentSent(@Select Gender gender);
}
