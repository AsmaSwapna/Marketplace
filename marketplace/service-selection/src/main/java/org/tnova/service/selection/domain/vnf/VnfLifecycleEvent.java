
package org.tnova.service.selection.domain.vnf;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "authentication_username",
    "driver",
    "authentication_type",
    "authentication",
    "authentication_port",
    "flavor_id_ref",
    "events",
    "vnf_container"
})
public class VnfLifecycleEvent {

    @JsonProperty("authentication_username")
    private String authenticationUsername;
    @JsonProperty("driver")
    private String driver;
    @JsonProperty("authentication_type")
    private String authenticationType;
    @JsonProperty("authentication")
    private String authentication;
    @JsonProperty("authentication_port")
    private Integer authenticationPort;
    @JsonProperty("flavor_id_ref")
    private String flavorIdRef;
    @JsonProperty("events")
    private Events events;
    @JsonProperty("vnf_container")
    private String vnfContainer;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public VnfLifecycleEvent() {
    }

    /**
     * 
     * @param authenticationPort
     * @param events
     * @param authentication
     * @param authenticationUsername
     * @param driver
     * @param vnfContainer
     * @param authenticationType
     * @param flavorIdRef
     */
    public VnfLifecycleEvent(String authenticationUsername, String driver, String authenticationType, String authentication, Integer authenticationPort, String flavorIdRef, Events events, String vnfContainer) {
        this.authenticationUsername = authenticationUsername;
        this.driver = driver;
        this.authenticationType = authenticationType;
        this.authentication = authentication;
        this.authenticationPort = authenticationPort;
        this.flavorIdRef = flavorIdRef;
        this.events = events;
        this.vnfContainer = vnfContainer;
    }

    /**
     * 
     * @return
     *     The authenticationUsername
     */
    @JsonProperty("authentication_username")
    public String getAuthenticationUsername() {
        return authenticationUsername;
    }

    /**
     * 
     * @param authenticationUsername
     *     The authentication_username
     */
    @JsonProperty("authentication_username")
    public void setAuthenticationUsername(String authenticationUsername) {
        this.authenticationUsername = authenticationUsername;
    }

    public VnfLifecycleEvent withAuthenticationUsername(String authenticationUsername) {
        this.authenticationUsername = authenticationUsername;
        return this;
    }

    /**
     * 
     * @return
     *     The driver
     */
    @JsonProperty("driver")
    public String getDriver() {
        return driver;
    }

    /**
     * 
     * @param driver
     *     The driver
     */
    @JsonProperty("driver")
    public void setDriver(String driver) {
        this.driver = driver;
    }

    public VnfLifecycleEvent withDriver(String driver) {
        this.driver = driver;
        return this;
    }

    /**
     * 
     * @return
     *     The authenticationType
     */
    @JsonProperty("authentication_type")
    public String getAuthenticationType() {
        return authenticationType;
    }

    /**
     * 
     * @param authenticationType
     *     The authentication_type
     */
    @JsonProperty("authentication_type")
    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    public VnfLifecycleEvent withAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * 
     * @return
     *     The authentication
     */
    @JsonProperty("authentication")
    public String getAuthentication() {
        return authentication;
    }

    /**
     * 
     * @param authentication
     *     The authentication
     */
    @JsonProperty("authentication")
    public void setAuthentication(String authentication) {
        this.authentication = authentication;
    }

    public VnfLifecycleEvent withAuthentication(String authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * 
     * @return
     *     The authenticationPort
     */
    @JsonProperty("authentication_port")
    public Integer getAuthenticationPort() {
        return authenticationPort;
    }

    /**
     * 
     * @param authenticationPort
     *     The authentication_port
     */
    @JsonProperty("authentication_port")
    public void setAuthenticationPort(Integer authenticationPort) {
        this.authenticationPort = authenticationPort;
    }

    public VnfLifecycleEvent withAuthenticationPort(Integer authenticationPort) {
        this.authenticationPort = authenticationPort;
        return this;
    }

    /**
     * 
     * @return
     *     The flavorIdRef
     */
    @JsonProperty("flavor_id_ref")
    public String getFlavorIdRef() {
        return flavorIdRef;
    }

    /**
     * 
     * @param flavorIdRef
     *     The flavor_id_ref
     */
    @JsonProperty("flavor_id_ref")
    public void setFlavorIdRef(String flavorIdRef) {
        this.flavorIdRef = flavorIdRef;
    }

    public VnfLifecycleEvent withFlavorIdRef(String flavorIdRef) {
        this.flavorIdRef = flavorIdRef;
        return this;
    }

    /**
     * 
     * @return
     *     The events
     */
    @JsonProperty("events")
    public Events getEvents() {
        return events;
    }

    /**
     * 
     * @param events
     *     The events
     */
    @JsonProperty("events")
    public void setEvents(Events events) {
        this.events = events;
    }

    public VnfLifecycleEvent withEvents(Events events) {
        this.events = events;
        return this;
    }

    /**
     * 
     * @return
     *     The vnfContainer
     */
    @JsonProperty("vnf_container")
    public String getVnfContainer() {
        return vnfContainer;
    }

    /**
     * 
     * @param vnfContainer
     *     The vnf_container
     */
    @JsonProperty("vnf_container")
    public void setVnfContainer(String vnfContainer) {
        this.vnfContainer = vnfContainer;
    }

    public VnfLifecycleEvent withVnfContainer(String vnfContainer) {
        this.vnfContainer = vnfContainer;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public VnfLifecycleEvent withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(authenticationUsername).append(driver).append(authenticationType).append(authentication).append(authenticationPort).append(flavorIdRef).append(events).append(vnfContainer).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VnfLifecycleEvent) == false) {
            return false;
        }
        VnfLifecycleEvent rhs = ((VnfLifecycleEvent) other);
        return new EqualsBuilder().append(authenticationUsername, rhs.authenticationUsername).append(driver, rhs.driver).append(authenticationType, rhs.authenticationType).append(authentication, rhs.authentication).append(authenticationPort, rhs.authenticationPort).append(flavorIdRef, rhs.flavorIdRef).append(events, rhs.events).append(vnfContainer, rhs.vnfContainer).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
