package org.saucedemo.test2.utils;

import org.aeonbits.owner.Converter;
import org.saucedemo.test2.driver.DriverType;

import java.lang.reflect.Method;

public class DriverTypeConverter implements Converter<DriverType> {

    @Override
    public DriverType convert(Method method, String s) {
        return DriverType.valueOf(s);
    }
}