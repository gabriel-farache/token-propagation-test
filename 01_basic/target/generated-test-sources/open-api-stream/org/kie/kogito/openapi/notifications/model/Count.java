package org.kie.kogito.openapi.notifications.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Count  {

    private BigDecimal unread;
    private BigDecimal read;

    /**
    * Get unread
    * @return unread
    **/
    @JsonProperty("unread")
    public BigDecimal getUnread() {
        return unread;
    }

    /**
     * Set unread
     **/
    public void setUnread(BigDecimal unread) {
        this.unread = unread;
    }

    public Count unread(BigDecimal unread) {
        this.unread = unread;
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

    public Count read(BigDecimal read) {
        this.read = read;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Count {\n");

        sb.append("    unread: ").append(toIndentedString(unread)).append("\n");
        sb.append("    read: ").append(toIndentedString(read)).append("\n");
        
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
    public static class CountQueryParam  {

        @jakarta.ws.rs.QueryParam("unread")
        private BigDecimal unread;
        @jakarta.ws.rs.QueryParam("read")
        private BigDecimal read;

        /**
        * Get unread
        * @return unread
        **/
        @JsonProperty("unread")
        public BigDecimal getUnread() {
            return unread;
        }

        /**
         * Set unread
         **/
        public void setUnread(BigDecimal unread) {
            this.unread = unread;
        }

        public CountQueryParam unread(BigDecimal unread) {
            this.unread = unread;
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

        public CountQueryParam read(BigDecimal read) {
            this.read = read;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CountQueryParam {\n");

            sb.append("    unread: ").append(toIndentedString(unread)).append("\n");
            sb.append("    read: ").append(toIndentedString(read)).append("\n");
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