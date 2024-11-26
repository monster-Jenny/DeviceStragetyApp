package com.devicedtragetyapp.myapp;

import com.devicedtragetyapp.myapp.config.AsyncSyncConfiguration;
import com.devicedtragetyapp.myapp.config.EmbeddedKafka;
import com.devicedtragetyapp.myapp.config.EmbeddedRedis;
import com.devicedtragetyapp.myapp.config.EmbeddedSQL;
import com.devicedtragetyapp.myapp.config.JacksonConfiguration;
import com.devicedtragetyapp.myapp.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(
    classes = { DeviceStragetyApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class }
)
@EmbeddedRedis
@EmbeddedSQL
@EmbeddedKafka
public @interface IntegrationTest {
}
