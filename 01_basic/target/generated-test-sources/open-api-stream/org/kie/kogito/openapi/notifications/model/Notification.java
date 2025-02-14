package org.kie.kogito.openapi.notifications.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import org.kie.kogito.openapi.notifications.model.NotificationPayload;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Notification  {

    private String id;
    private String user;
    private OffsetDateTime created;
    private OffsetDateTime saved;
    private BigDecimal read;
    private OffsetDateTime updated;
    private String origin;
    private NotificationPayload payload;

    /**
    * Get id
    * @return id
    **/
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Set id
     **/
    public void setId(String id) {
        this.id = id;
    }

    public Notification id(String id) {
        this.id = id;
        return this;
    }

    /**
    * Get user
    * @return user
    **/
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * Set user
     **/
    public void setUser(String user) {
        this.user = user;
    }

    public Notification user(String user) {
        this.user = user;
        return this;
    }

    /**
    * Get created
    * @return created
    **/
    @JsonProperty("created")
    public OffsetDateTime getCreated() {
        return created;
    }

    /**
     * Set created
     **/
    public void setCreated(OffsetDateTime created) {
        this.created = created;
    }

    public Notification created(OffsetDateTime created) {
        this.created = created;
        return this;
    }

    /**
    * Get saved
    * @return saved
    **/
    @JsonProperty("saved")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public OffsetDateTime getSaved() {
        return saved;
    }

    /**
     * Set saved
     **/
    public void setSaved(OffsetDateTime saved) {
        this.saved = saved;
    }

    public Notification saved(OffsetDateTime saved) {
        this.saved = saved;
        return this;
    }

    /**
    * Get read
    * @return read
    **/
    @JsonProperty("read")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getRead() {
        return read;
    }

    /**
     * Set read
     **/
    public void setRead(BigDecimal read) {
        this.read = read;
    }

    public Notification read(BigDecimal read) {
        this.read = read;
        return this;
    }

    /**
    * Get updated
    * @return updated
    **/
    @JsonProperty("updated")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public OffsetDateTime getUpdated() {
        return updated;
    }

    /**
     * Set updated
     **/
    public void setUpdated(OffsetDateTime updated) {
        this.updated = updated;
    }

    public Notification updated(OffsetDateTime updated) {
        this.updated = updated;
        return this;
    }

    /**
    * Get origin
    * @return origin
    **/
    @JsonProperty("origin")
    public String getOrigin() {
        return origin;
    }

    /**
     * Set origin
     **/
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Notification origin(String origin) {
        this.origin = origin;
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

    public Notification payload(NotificationPayload payload) {
        this.payload = payload;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Notification {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    saved: ").append(toIndentedString(saved)).append("\n");
        sb.append("    read: ").append(toIndentedString(read)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
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
    public static class NotificationQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private String id;
        @jakarta.ws.rs.QueryParam("user")
        private String user;
        @jakarta.ws.rs.QueryParam("created")
        private OffsetDateTime created;
        @jakarta.ws.rs.QueryParam("saved")
        private OffsetDateTime saved;
        @jakarta.ws.rs.QueryParam("read")
        private BigDecimal read;
        @jakarta.ws.rs.QueryParam("updated")
        private OffsetDateTime updated;
        @jakarta.ws.rs.QueryParam("origin")
        private String origin;
        @jakarta.ws.rs.QueryParam("payload")
        private NotificationPayload payload;

        /**
        * Get id
        * @return id
        **/
        @JsonProperty("id")
        public String getId() {
            return id;
        }

        /**
         * Set id
         **/
        public void setId(String id) {
            this.id = id;
        }

        public NotificationQueryParam id(String id) {
            this.id = id;
            return this;
        }

        /**
        * Get user
        * @return user
        **/
        @JsonProperty("user")
        public String getUser() {
            return user;
        }

        /**
         * Set user
         **/
        public void setUser(String user) {
            this.user = user;
        }

        public NotificationQueryParam user(String user) {
            this.user = user;
            return this;
        }

        /**
        * Get created
        * @return created
        **/
        @JsonProperty("created")
        public OffsetDateTime getCreated() {
            return created;
        }

        /**
         * Set created
         **/
        public void setCreated(OffsetDateTime created) {
            this.created = created;
        }

        public NotificationQueryParam created(OffsetDateTime created) {
            this.created = created;
            return this;
        }

        /**
        * Get saved
        * @return saved
        **/
        @JsonProperty("saved")
        public OffsetDateTime getSaved() {
            return saved;
        }

        /**
         * Set saved
         **/
        public void setSaved(OffsetDateTime saved) {
            this.saved = saved;
        }

        public NotificationQueryParam saved(OffsetDateTime saved) {
            this.saved = saved;
            return this;
        }

        /**
        * Get read
        * @return read
        **/
        @JsonProperty("read")
        public BigDecimal getRead() {
            return read;
        }

        /**
         * Set read
         **/
        public void setRead(BigDecimal read) {
            this.read = read;
        }

        public NotificationQueryParam read(BigDecimal read) {
            this.read = read;
            return this;
        }

        /**
        * Get updated
        * @return updated
        **/
        @JsonProperty("updated")
        public OffsetDateTime getUpdated() {
            return updated;
        }

        /**
         * Set updated
         **/
        public void setUpdated(OffsetDateTime updated) {
            this.updated = updated;
        }

        public NotificationQueryParam updated(OffsetDateTime updated) {
            this.updated = updated;
            return this;
        }

        /**
        * Get origin
        * @return origin
        **/
        @JsonProperty("origin")
        public String getOrigin() {
            return origin;
        }

        /**
         * Set origin
         **/
        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public NotificationQueryParam origin(String origin) {
            this.origin = origin;
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

        public NotificationQueryParam payload(NotificationPayload payload) {
            this.payload = payload;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class NotificationQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    user: ").append(toIndentedString(user)).append("\n");
            sb.append("    created: ").append(toIndentedString(created)).append("\n");
            sb.append("    saved: ").append(toIndentedString(saved)).append("\n");
            sb.append("    read: ").append(toIndentedString(read)).append("\n");
            sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
            sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
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