package com.housepoints.housepointsapi;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SystemPropertiesLoader {
    public static void loadProperties() {
        Properties properties = new Properties();
        try (FileInputStream input = new FileInputStream(".env.local.properties")) {
            System.out.println(input);
            properties.load(input);

            for (String key : properties.stringPropertyNames()) {
                String value = properties.getProperty(key);
                System.setProperty(key, value);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
