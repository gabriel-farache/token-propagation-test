package org.kie.kogito.openapi.notifications.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NotificationPayload  {

    private String title;
    private String description;
    private String link;

    public enum SeverityEnum {
        CRITICAL(String.valueOf("critical")), HIGH(String.valueOf("high")), NORMAL(String.valueOf("normal")), LOW(String.valueOf("low"));

        // caching enum access
        private static final java.util.EnumSet<SeverityEnum> values = java.util.EnumSet.allOf(SeverityEnum.class);

        String value;

        SeverityEnum (String v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SeverityEnum fromString(String v) {
            for (SeverityEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private SeverityEnum severity;
    private String topic;
    private String scope;
    private String icon;

    /**
    * Get title
    * @return title
    **/
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Set title
     **/
    public void setTitle(String title) {
        this.title = title;
    }

    public NotificationPayload title(String title) {
        this.title = title;
        return this;
    }

    /**
    * Get description
    * @return description
    **/
    @JsonProperty("description")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Set description
     **/
    public void setDescription(String description) {
        this.description = description;
    }

    public NotificationPayload description(String description) {
        this.description = description;
        return this;
    }

    /**
    * Get link
    * @return link
    **/
    @JsonProperty("link")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLink() {
        return link;
    }

    /**
     * Set link
     **/
    public void setLink(String link) {
        this.link = link;
    }

    public NotificationPayload link(String link) {
        this.link = link;
        return this;
    }

    /**
    * Get severity
    * @return severity
    **/
    @JsonProperty("severity")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SeverityEnum getSeverity() {
        return severity;
    }

    /**
     * Set severity
     **/
    public void setSeverity(SeverityEnum severity) {
        this.severity = severity;
    }

    public NotificationPayload severity(SeverityEnum severity) {
        this.severity = severity;
        return this;
    }

    /**
    * Get topic
    * @return topic
    **/
    @JsonProperty("topic")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTopic() {
        return topic;
    }

    /**
     * Set topic
     **/
    public void setTopic(String topic) {
        this.topic = topic;
    }

    public NotificationPayload topic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
    * Get scope
    * @return scope
    **/
    @JsonProperty("scope")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getScope() {
        return scope;
    }

    /**
     * Set scope
     **/
    public void setScope(String scope) {
        this.scope = scope;
    }

    public NotificationPayload scope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
    * Get icon
    * @return icon
    **/
    @JsonProperty("icon")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getIcon() {
        return icon;
    }

    /**
     * Set icon
     **/
    public void setIcon(String icon) {
        this.icon = icon;
    }

    public NotificationPayload icon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotificationPayload {\n");

        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
        
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
    public static class NotificationPayloadQueryParam  {

        @jakarta.ws.rs.QueryParam("title")
        private String title;
        @jakarta.ws.rs.QueryParam("description")
        private String description;
        @jakarta.ws.rs.QueryParam("link")
        private String link;

    public enum SeverityEnum {
        CRITICAL(String.valueOf("critical")), HIGH(String.valueOf("high")), NORMAL(String.valueOf("normal")), LOW(String.valueOf("low"));

        // caching enum access
        private static final java.util.EnumSet<SeverityEnum> values = java.util.EnumSet.allOf(SeverityEnum.class);

        String value;

        SeverityEnum (String v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SeverityEnum fromString(String v) {
            for (SeverityEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private SeverityEnum severity;
        @jakarta.ws.rs.QueryParam("topic")
        private String topic;
        @jakarta.ws.rs.QueryParam("scope")
        private String scope;
        @jakarta.ws.rs.QueryParam("icon")
        private String icon;

        /**
        * Get title
        * @return title
        **/
        @JsonProperty("title")
        public String getTitle() {
            return title;
        }

        /**
         * Set title
         **/
        public void setTitle(String title) {
            this.title = title;
        }

        public NotificationPayloadQueryParam title(String title) {
            this.title = title;
            return this;
        }

        /**
        * Get description
        * @return description
        **/
        @JsonProperty("description")
        public String getDescription() {
            return description;
        }

        /**
         * Set description
         **/
        public void setDescription(String description) {
            this.description = description;
        }

        public NotificationPayloadQueryParam description(String description) {
            this.description = description;
            return this;
        }

        /**
        * Get link
        * @return link
        **/
        @JsonProperty("link")
        public String getLink() {
            return link;
        }

        /**
         * Set link
         **/
        public void setLink(String link) {
            this.link = link;
        }

        public NotificationPayloadQueryParam link(String link) {
            this.link = link;
            return this;
        }

        /**
        * Get severity
        * @return severity
        **/
        @JsonProperty("severity")
        public SeverityEnum getSeverity() {
            return severity;
        }

        /**
         * Set severity
         **/
        public void setSeverity(SeverityEnum severity) {
            this.severity = severity;
        }

        public NotificationPayloadQueryParam severity(SeverityEnum severity) {
            this.severity = severity;
            return this;
        }

        /**
        * Get topic
        * @return topic
        **/
        @JsonProperty("topic")
        public String getTopic() {
            return topic;
        }

        /**
         * Set topic
         **/
        public void setTopic(String topic) {
            this.topic = topic;
        }

        public NotificationPayloadQueryParam topic(String topic) {
            this.topic = topic;
            return this;
        }

        /**
        * Get scope
        * @return scope
        **/
        @JsonProperty("scope")
        public String getScope() {
            return scope;
        }

        /**
         * Set scope
         **/
        public void setScope(String scope) {
            this.scope = scope;
        }

        public NotificationPayloadQueryParam scope(String scope) {
            this.scope = scope;
            return this;
        }

        /**
        * Get icon
        * @return icon
        **/
        @JsonProperty("icon")
        public String getIcon() {
            return icon;
        }

        /**
         * Set icon
         **/
        public void setIcon(String icon) {
            this.icon = icon;
        }

        public NotificationPayloadQueryParam icon(String icon) {
            this.icon = icon;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class NotificationPayloadQueryParam {\n");

            sb.append("    title: ").append(toIndentedString(title)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    link: ").append(toIndentedString(link)).append("\n");
            sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
            sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
            sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
            sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
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