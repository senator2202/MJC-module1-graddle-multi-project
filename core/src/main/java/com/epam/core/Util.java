package com.epam.core;

import com.kharitonov.utils.StringUtils;

public class Util {

    private Util() {
    }

    public static boolean isAllPositiveNumbers(String... str) {
        for (String s : str) {
            if (!StringUtils.isPositiveNumber(s)) {
                return false;
            }
        }
        return true;
    }
}
