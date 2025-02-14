package org.kie.kogito.openapi.test.api.auth;

import jakarta.inject.Inject;
import jakarta.annotation.PostConstruct;
import jakarta.ws.rs.Priorities;

import jakarta.annotation.Priority;

import io.quarkiverse.openapi.generator.OpenApiGeneratorConfig;

import io.quarkiverse.openapi.generator.providers.AbstractCompositeAuthenticationProvider;
import io.quarkiverse.openapi.generator.providers.OperationAuthInfo;

import java.util.Optional;

@Priority(Priorities.AUTHENTICATION)
public class CompositeAuthenticationProvider extends AbstractCompositeAuthenticationProvider {

    @jakarta.inject.Inject
    OpenApiGeneratorConfig generatorConfig;

    @jakarta.inject.Inject
    io.quarkiverse.openapi.generator.providers.OAuth2AuthenticationProvider oAuth2Provider0;

    @jakarta.inject.Inject
    OidcClientRequestFilterDelegateImpl0 oidcClientRequestFilterDelegate0;

    @PostConstruct
    public void init() {
        oAuth2Provider0.init(sanitizeAuthName("BearerToken"), "test_yaml", oidcClientRequestFilterDelegate0);

        this.addAuthenticationProvider(oAuth2Provider0);
        oAuth2Provider0.addOperation(OperationAuthInfo.builder()
            .withPath("")
            .withId("test")
            .withMethod("GET")
            .build());
    }

    @jakarta.enterprise.context.Dependent
    static class OidcClientRequestFilterDelegateImpl0 extends io.quarkus.oidc.client.filter.OidcClientRequestFilter implements io.quarkiverse.openapi.generator.providers.OAuth2AuthenticationProvider.OidcClientRequestFilterDelegate {
        private final String clientId = io.quarkiverse.openapi.generator.OpenApiGeneratorConfig.getSanitizedSecuritySchemeName("BearerToken");

        @Override
        protected Optional<String> clientId() {
            return Optional.of(clientId);
        }
    }
}