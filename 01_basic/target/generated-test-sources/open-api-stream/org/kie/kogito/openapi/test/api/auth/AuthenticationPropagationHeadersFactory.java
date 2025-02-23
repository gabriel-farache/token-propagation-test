package org.kie.kogito.openapi.test.api.auth;

import jakarta.inject.Inject;
import jakarta.enterprise.context.ApplicationScoped;

import io.quarkiverse.openapi.generator.OpenApiGeneratorConfig;
import io.quarkiverse.openapi.generator.providers.AbstractAuthenticationPropagationHeadersFactory;
import io.quarkiverse.openapi.generator.providers.HeadersProvider;

public class AuthenticationPropagationHeadersFactory extends AbstractAuthenticationPropagationHeadersFactory {

    @Inject
    public AuthenticationPropagationHeadersFactory(CompositeAuthenticationProvider compositeProvider, OpenApiGeneratorConfig generatorConfig, HeadersProvider headersProvider) {
        super(compositeProvider, generatorConfig, headersProvider);
    }

}