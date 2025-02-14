package org.kie.kogito.openapi.notifications.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.kie.kogito.openapi.notifications.model.CreateBodyRecipients;
import org.kie.kogito.openapi.notifications.model.NotificationPayload;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateBody  {

    private CreateBodyRecipients recipients;
    private NotificationPayload payload;

    /**
    * Get recipients
    * @return recipients
    **/
    @JsonProperty("recipients")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public CreateBodyRecipients getRecipients() {
        return recipients;
    }

    /**
     * Set recipients
     **/
    public void setRecipients(CreateBodyRecipients recipients) {
        this.recipients = recipients;
    }

    public CreateBody recipients(CreateBodyRecipients recipients) {
        this.recipients = recipients;
        return this;
    }

    /**
    * Get payload
    * @return payload
    **/
    @JsonProperty("payload")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public NotificationPayload getPayload() {
        return payload;
    }

    /**
     * Set payload
     **/
    public void setPayload(NotificationPayload payload) {
        this.payload = payload;
    }

    public CreateBody payload(NotificationPayload payload) {
        this.payload = payload;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBody {\n");

        sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private static String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CreateBodyQueryParam  {

        @jakarta.ws.rs.QueryParam("recipients")
        private CreateBodyRecipients recipients;
        @jakarta.ws.rs.QueryParam("payload")
        private NotificationPayload payload;

        /**
        * Get recipients
        * @return recipients
        **/
        @JsonProperty("recipients")
        public CreateBodyRecipients getRecipients() {
            return recipients;
        }

        /**
         * Set recipients
         **/
        public void setRecipients(CreateBodyRecipients recipients) {
            this.recipients = recipients;
        }

        public CreateBodyQueryParam recipients(CreateBodyRecipients recipients) {
            this.recipients = recipients;
            return this;
        }

        /**
        * Get payload
        * @return payload
        **/
        @JsonProperty("payload")
        public NotificationPayload getPayload() {
            return payload;
        }

        /**
         * Set payload
         **/
        public void setPayload(NotificationPayload payload) {
            this.payload = payload;
        }

        public CreateBodyQueryParam payload(NotificationPayload payload) {
            this.payload = payload;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CreateBodyQueryParam {\n");

            sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
            sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
            sb.append("}");
            return sb.toString();
        }

        /**
         * Convert the given object to string with each line indented by 4 spaces
         * (except the first line).
         */
        private static String toIndentedString(Object o) {
            if (o == null) {
                return "null";
            }
            return o.toString().replace("\n", "\n    ");
        }
    }}