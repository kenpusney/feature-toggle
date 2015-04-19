package net.kimleo.hjk.helper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FeatureToggle {
    public static final String FEATURE_TOGGLE_ON = "on";
    private static FeatureToggle instance;

    private Properties properties = new Properties();

    public static FeatureToggle instance() {
        if(instance == null) {
            instance = new FeatureToggle();
        }
        return instance;
    }

    private FeatureToggle() {
        InputStream propertyFile = getClass().getClassLoader().getResourceAsStream("features.properties");

        try {
            properties.load(propertyFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isEnabled(String feature) {
        return properties.containsKey(feature) && FEATURE_TOGGLE_ON.equals(properties.get(feature));
    }
}
