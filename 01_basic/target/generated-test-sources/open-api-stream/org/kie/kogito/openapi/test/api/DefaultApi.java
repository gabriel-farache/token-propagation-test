package org.kie.kogito.openapi.test.api;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders;
import org.kie.kogito.openapi.test.api.auth.CompositeAuthenticationProvider;
import org.kie.kogito.openapi.test.api.auth.AuthenticationPropagationHeadersFactory;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import jakarta.enterprise.context.ApplicationScoped;

import io.quarkiverse.openapi.generator.annotations.GeneratedClass;
import io.quarkiverse.openapi.generator.annotations.GeneratedMethod;
import io.quarkiverse.openapi.generator.annotations.GeneratedParam;

/**
  * test
  * <p>test</p>
  */
@Path("")
@RegisterRestClient( configKey="test_yaml")
@GeneratedClass(value="test.yaml", tag = "Default")
@RegisterProvider(CompositeAuthenticationProvider.class)
@RegisterClientHeaders(AuthenticationPropagationHeadersFactory.class)
@ApplicationScoped
public interface DefaultApi {

     /**
     * Get user's notifications
     *
     * Get user's notifications
     *
     */
    @GET
    @GeneratedMethod ("test")
    public jakarta.ws.rs.core.Response test(
    );

}