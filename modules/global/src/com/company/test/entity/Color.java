package com.company.test.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Color implements EnumClass<String> {

    WHITE("White"),
    GREY("Grey"),
    BLACK("Black"),
    BROWN("Brown"),
    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    LIGHT_BLUE("Light Blue"),
    BLUE("Blue"),
    PURPLE("Purple"),
    PINK("Pink");

    private String id;

    Color(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Color fromId(String id) {
        for (Color at : Color.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}