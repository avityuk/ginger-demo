package com.vityuk.ginger.examples;

import com.vityuk.ginger.Localizable;

import java.util.List;

/**
 * @author Andriy Vityuk
 */
public interface LocalizableConstants extends Localizable {
    String day();
    Integer weekStartDay();
    List<String> weekDays();
}
