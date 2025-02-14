package org.kie.kogito.openapi.notifications.api.auth;

import jakarta.inject.Inject;
import jakarta.annotation.PostConstruct;
import jakarta.ws.rs.Priorities;

import jakarta.annotation.Priority;

import io.quarkiverse.openapi.generator.OpenApiGeneratorConfig;

import io.quarkiverse.openapi.generator.providers.BearerAuthenticationProvider;
import io.quarkiverse.openapi.generator.providers.AbstractCompositeAuthenticationProvider;
import io.quarkiverse.openapi.generator.providers.OperationAuthInfo;

import java.util.Optional;

@Priority(Priorities.AUTHENTICATION)
public class CompositeAuthenticationProvider extends AbstractCompositeAuthenticationProvider {

    @jakarta.inject.Inject
    OpenApiGeneratorConfig generatorConfig;


    @PostConstruct
    public void init() {

        BearerAuthenticationProvider bearerProvider0 = new BearerAuthenticationProvider("notifications", sanitizeAuthName("BearerToken"), "bearer", generatorConfig);
        this.addAuthenticationProvider(bearerProvider0);
        bearerProvider0.addOperation(OperationAuthInfo.builder()
            .withPath("/api/notifications")
            .withId("createNotification")
            .withMethod("POST")
            .build());
        bearerProvider0.addOperation(OperationAuthInfo.builder()
            .withPath("/api/notifications")
            .withId("getNotifications")
            .withMethod("GET")
            .build());
        bearerProvider0.addOperation(OperationAuthInfo.builder()
            .withPath("/api/notifications/status")
            .withId("getStatus")
            .withMethod("GET")
            .build());
        bearerProvider0.addOperation(OperationAuthInfo.builder()
            .withPath("/api/notifications/update")
            .withId("setRead")
            .withMethod("POST")
            .build());
    }

}