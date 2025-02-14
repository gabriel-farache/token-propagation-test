package org.kie.kogito.openapi.notifications.api;

import org.kie.kogito.openapi.notifications.model.Count;
import org.kie.kogito.openapi.notifications.model.CreateBody;
import org.kie.kogito.openapi.notifications.model.GetNotifications;
import org.kie.kogito.openapi.notifications.model.Notification;
import org.kie.kogito.openapi.notifications.model.SetReadRequest;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders;
import org.kie.kogito.openapi.notifications.api.auth.CompositeAuthenticationProvider;
import org.kie.kogito.openapi.notifications.api.auth.AuthenticationPropagationHeadersFactory;

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
  * Notifications Plugin - OpenAPI Specs
  * <p>Notifications Plugin - OpenAPI Specs</p>
  */
@Path("/api/notifications")
@RegisterRestClient( configKey="notifications")
@GeneratedClass(value="notifications", tag = "Notifications")
@RegisterProvider(CompositeAuthenticationProvider.class)
@RegisterClientHeaders(AuthenticationPropagationHeadersFactory.class)
@ApplicationScoped
public interface NotificationsApi {

     /**
     * Create a notification
     *
     * Create a notification
     *
     * @param createBody 
     */
    @POST
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @GeneratedMethod ("createNotification")
    public List<Notification> createNotification(
        CreateBody createBody
    );

     /**
     * Get user's notifications
     *
     * Get user's notifications
     *
     */
    @GET
    @Produces({"application/json"})
    @GeneratedMethod ("getNotifications")
    public GetNotifications getNotifications(
    );

     /**
     * Get user's count of unread+read notifications
     *
     * Get user's count of unread+read notifications
     *
     */
    @GET
    @Path("/status")
    @Produces({"application/json"})
    @GeneratedMethod ("getStatus")
    public Count getStatus(
    );

     /**
     * Set read/unread notifications
     *
     * Set read/unread notifications
     *
     * @param setReadRequest 
     */
    @POST
    @Path("/update")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @GeneratedMethod ("setRead")
    public List<Notification> setRead(
        SetReadRequest setReadRequest
    );

}