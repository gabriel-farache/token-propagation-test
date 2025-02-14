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
public class CreateBodyRecipients  {


    public enum TypeEnum {
        BROADCAST(String.valueOf("broadcast")), ENTITY(String.valueOf("entity"));

        // caching enum access
        private static final java.util.EnumSet<TypeEnum> values = java.util.EnumSet.allOf(TypeEnum.class);

        String value;

        TypeEnum (String v) {
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
        public static TypeEnum fromString(String v) {
            for (TypeEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private TypeEnum type;
    private List<String> entityRef;
    private List<String> excludeEntityRef;

    /**
    * Get type
    * @return type
    **/
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    /**
     * Set type
     **/
    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CreateBodyRecipients type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
    * Get entityRef
    * @return entityRef
    **/
    @JsonProperty("entityRef")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getEntityRef() {
        return entityRef;
    }

    /**
     * Set entityRef
     **/
    public void setEntityRef(List<String> entityRef) {
        this.entityRef = entityRef;
    }

    public CreateBodyRecipients entityRef(List<String> entityRef) {
        this.entityRef = entityRef;
        return this;
    }
    public CreateBodyRecipients addEntityRefItem(String entityRefItem) {
        if (this.entityRef == null){
            entityRef = new ArrayList<>();
        }
        this.entityRef.add(entityRefItem);
        return this;
    }

    /**
    * Get excludeEntityRef
    * @return excludeEntityRef
    **/
    @JsonProperty("excludeEntityRef")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getExcludeEntityRef() {
        return excludeEntityRef;
    }

    /**
     * Set excludeEntityRef
     **/
    public void setExcludeEntityRef(List<String> excludeEntityRef) {
        this.excludeEntityRef = excludeEntityRef;
    }

    public CreateBodyRecipients excludeEntityRef(List<String> excludeEntityRef) {
        this.excludeEntityRef = excludeEntityRef;
        return this;
    }
    public CreateBodyRecipients addExcludeEntityRefItem(String excludeEntityRefItem) {
        if (this.excludeEntityRef == null){
            excludeEntityRef = new ArrayList<>();
        }
        this.excludeEntityRef.add(excludeEntityRefItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBodyRecipients {\n");

        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    entityRef: ").append(toIndentedString(entityRef)).append("\n");
        sb.append("    excludeEntityRef: ").append(toIndentedString(excludeEntityRef)).append("\n");
        
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
    public static class CreateBodyRecipientsQueryParam  {


    public enum TypeEnum {
        BROADCAST(String.valueOf("broadcast")), ENTITY(String.valueOf("entity"));

        // caching enum access
        private static final java.util.EnumSet<TypeEnum> values = java.util.EnumSet.allOf(TypeEnum.class);

        String value;

        TypeEnum (String v) {
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
        public static TypeEnum fromString(String v) {
            for (TypeEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private TypeEnum type;
        @jakarta.ws.rs.QueryParam("entityRef")
        private List<String> entityRef = null;
        @jakarta.ws.rs.QueryParam("excludeEntityRef")
        private List<String> excludeEntityRef = null;

        /**
        * Get type
        * @return type
        **/
        @JsonProperty("type")
        public TypeEnum getType() {
            return type;
        }

        /**
         * Set type
         **/
        public void setType(TypeEnum type) {
            this.type = type;
        }

        public CreateBodyRecipientsQueryParam type(TypeEnum type) {
            this.type = type;
            return this;
        }

        /**
        * Get entityRef
        * @return entityRef
        **/
        @JsonProperty("entityRef")
        public List<String> getEntityRef() {
            return entityRef;
        }

        /**
         * Set entityRef
         **/
        public void setEntityRef(List<String> entityRef) {
            this.entityRef = entityRef;
        }

        public CreateBodyRecipientsQueryParam entityRef(List<String> entityRef) {
            this.entityRef = entityRef;
            return this;
        }
        public CreateBodyRecipientsQueryParam addEntityRefItem(String entityRefItem) {
            this.entityRef.add(entityRefItem);
            return this;
        }

        /**
        * Get excludeEntityRef
        * @return excludeEntityRef
        **/
        @JsonProperty("excludeEntityRef")
        public List<String> getExcludeEntityRef() {
            return excludeEntityRef;
        }

        /**
         * Set excludeEntityRef
         **/
        public void setExcludeEntityRef(List<String> excludeEntityRef) {
            this.excludeEntityRef = excludeEntityRef;
        }

        public CreateBodyRecipientsQueryParam excludeEntityRef(List<String> excludeEntityRef) {
            this.excludeEntityRef = excludeEntityRef;
            return this;
        }
        public CreateBodyRecipientsQueryParam addExcludeEntityRefItem(String excludeEntityRefItem) {
            this.excludeEntityRef.add(excludeEntityRefItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CreateBodyRecipientsQueryParam {\n");

            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    entityRef: ").append(toIndentedString(entityRef)).append("\n");
            sb.append("    excludeEntityRef: ").append(toIndentedString(excludeEntityRef)).append("\n");
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