package com.tt;

public class IdProvider {

    static Long id = 0L;

    public static Long generateId() {

        return id++;

    }

}
