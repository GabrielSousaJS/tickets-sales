package com.gabrielsousa.ticketssales.entities.enums;

public enum Category {

    BASIC(1),
    NORMAL(2),
    VIP(3);

    private int code;
    private Category(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static Category valueOf(int code) {
        for (Category value : Category.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }

        throw new IllegalArgumentException("Invalid Category code!");
    }
}
