package org.kie.kogito.openapi.notifications.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.kie.kogito.openapi.notifications.model.Notification;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetNotifications  {

    private BigDecimal totalCount;
    private List<Notification> notifications;

    /**
    * Get totalCount
    * @return totalCount
    **/
    @JsonProperty("totalCount")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getTotalCount() {
        return totalCount;
    }

    /**
     * Set totalCount
     **/
    public void setTotalCount(BigDecimal totalCount) {
        this.totalCount = totalCount;
    }

    public GetNotifications totalCount(BigDecimal totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
    * Get notifications
    * @return notifications
    **/
    @JsonProperty("notifications")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Notification> getNotifications() {
        return notifications;
    }

    /**
     * Set notifications
     **/
    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }

    public GetNotifications notifications(List<Notification> notifications) {
        this.notifications = notifications;
        return this;
    }
    public GetNotifications addNotificationsItem(Notification notificationsItem) {
        if (this.notifications == null){
            notifications = new ArrayList<>();
        }
        this.notifications.add(notificationsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetNotifications {\n");

        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
        
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
    public static class GetNotificationsQueryParam  {

        @jakarta.ws.rs.QueryParam("totalCount")
        private BigDecimal totalCount;
        @jakarta.ws.rs.QueryParam("notifications")
        private List<Notification> notifications = null;

        /**
        * Get totalCount
        * @return totalCount
        **/
        @JsonProperty("totalCount")
        public BigDecimal getTotalCount() {
            return totalCount;
        }

        /**
         * Set totalCount
         **/
        public void setTotalCount(BigDecimal totalCount) {
            this.totalCount = totalCount;
        }

        public GetNotificationsQueryParam totalCount(BigDecimal totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
        * Get notifications
        * @return notifications
        **/
        @JsonProperty("notifications")
        public List<Notification> getNotifications() {
            return notifications;
        }

        /**
         * Set notifications
         **/
        public void setNotifications(List<Notification> notifications) {
            this.notifications = notifications;
        }

        public GetNotificationsQueryParam notifications(List<Notification> notifications) {
            this.notifications = notifications;
            return this;
        }
        public GetNotificationsQueryParam addNotificationsItem(Notification notificationsItem) {
            this.notifications.add(notificationsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetNotificationsQueryParam {\n");

            sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
            sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
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