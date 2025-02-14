package org.kie.kogito.openapi.notifications.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SetReadRequest  {

    private List<String> ids = new ArrayList<>();
    private Boolean read;

    /**
    * Get ids
    * @return ids
    **/
    @JsonProperty("ids")
    public List<String> getIds() {
        return ids;
    }

    /**
     * Set ids
     **/
    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public SetReadRequest ids(List<String> ids) {
        this.ids = ids;
        return this;
    }
    public SetReadRequest addIdsItem(String idsItem) {
        if (this.ids == null){
            ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    /**
    * Get read
    * @return read
    **/
    @JsonProperty("read")
    public Boolean getRead() {
        return read;
    }

    /**
     * Set read
     **/
    public void setRead(Boolean read) {
        this.read = read;
    }

    public SetReadRequest read(Boolean read) {
        this.read = read;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetReadRequest {\n");

        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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
    public static class SetReadRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("ids")
        private List<String> ids = null;
        @jakarta.ws.rs.QueryParam("read")
        private Boolean read;

        /**
        * Get ids
        * @return ids
        **/
        @JsonProperty("ids")
        public List<String> getIds() {
            return ids;
        }

        /**
         * Set ids
         **/
        public void setIds(List<String> ids) {
            this.ids = ids;
        }

        public SetReadRequestQueryParam ids(List<String> ids) {
            this.ids = ids;
            return this;
        }
        public SetReadRequestQueryParam addIdsItem(String idsItem) {
            this.ids.add(idsItem);
            return this;
        }

        /**
        * Get read
        * @return read
        **/
        @JsonProperty("read")
        public Boolean getRead() {
            return read;
        }

        /**
         * Set read
         **/
        public void setRead(Boolean read) {
            this.read = read;
        }

        public SetReadRequestQueryParam read(Boolean read) {
            this.read = read;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SetReadRequestQueryParam {\n");

            sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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