package com.bandwidth;

import com.bandwidth.voice.models.CallbackMethodEnum;
import com.bandwidth.voice.models.FallbackMethodEnum;
import com.bandwidth.voice.models.MachineDetectionConfiguration;
import com.bandwidth.voice.models.ModeEnum;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class VoiceMachineDetectionConfigurationTest {

    @Test
    public void testMachineDetectionConfigurationConstructor() {
        MachineDetectionConfiguration machineDetectionConfiguration = new MachineDetectionConfiguration(ModeEnum.ASYNC,
                3.2, 5.6, 1.2, 7.6, false,
                "https://www.example.com/", CallbackMethodEnum.GET,
                "https://www.example-fallback.com/", FallbackMethodEnum.GET,
                "neato-username", "neato-password",
                "neato-username-fallback", "neato-password-fallback");

        assertEquals(ModeEnum.ASYNC, machineDetectionConfiguration.getMode());
        assertEquals(Double.valueOf(3.2), machineDetectionConfiguration.getDetectionTimeout());
        assertEquals(Double.valueOf(5.6), machineDetectionConfiguration.getSilenceTimeout());
        assertEquals(Double.valueOf(1.2), machineDetectionConfiguration.getSpeechThreshold());
        assertEquals(Double.valueOf(7.6), machineDetectionConfiguration.getSpeechEndThreshold());
        assertFalse(machineDetectionConfiguration.getDelayResult());
        assertEquals("https://www.example.com/", machineDetectionConfiguration.getCallbackUrl());
        assertEquals(CallbackMethodEnum.GET, machineDetectionConfiguration.getCallbackMethod());
        assertEquals("https://www.example-fallback.com/", machineDetectionConfiguration.getFallbackUrl());
        assertEquals(FallbackMethodEnum.GET, machineDetectionConfiguration.getFallbackMethod());
        assertEquals("neato-username", machineDetectionConfiguration.getUsername());
        assertEquals("neato-password", machineDetectionConfiguration.getPassword());
        assertEquals("neato-username-fallback", machineDetectionConfiguration.getFallbackUsername());
        assertEquals("neato-password-fallback", machineDetectionConfiguration.getFallbackPassword());
    }

    @Test
    public void testMachineDetectionConfigurationSerialize() throws JsonProcessingException {
        MachineDetectionConfiguration machineDetectionConfiguration = new MachineDetectionConfiguration(ModeEnum.ASYNC,
                3.2, 5.6, 1.2, 7.6, false,
                "https://www.example.com/", CallbackMethodEnum.GET,
                "https://www.example-fallback.com/", FallbackMethodEnum.GET,
                "neato-username", "neato-password",
                "neato-username-fallback", "neato-password-fallback");

        String json = ApiHelper.serialize(machineDetectionConfiguration);
        assertEquals("{\"mode\":\"async\",\"detectionTimeout\":3.2,\"silenceTimeout\":5.6,\"speechThreshold\":1.2,\"speechEndThreshold\":7.6,\"delayResult\":false,\"callbackUrl\":\"https://www.example.com/\",\"callbackMethod\":\"GET\",\"fallbackUrl\":\"https://www.example-fallback.com/\",\"fallbackMethod\":\"GET\",\"username\":\"neato-username\",\"password\":\"neato-password\",\"fallbackUsername\":\"neato-username-fallback\",\"fallbackPassword\":\"neato-password-fallback\"}", json);
    }
}
