package net.kimleo.hjk.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class FeatureToggleTest {
    @Test
    public void shouldLoadToggleConfigurations() throws Exception {
        FeatureToggle toggle = FeatureToggle.instance();

        assertTrue(toggle.isEnabled("net.kimleo.hjk.helper.FeatureToggle"));
        assertFalse(toggle.isEnabled("SomeFeature"));
    }
}