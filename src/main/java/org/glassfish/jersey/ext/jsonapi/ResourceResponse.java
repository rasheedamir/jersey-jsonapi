package org.glassfish.jersey.ext.jsonapi;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

public final class ResourceResponse<T> implements Payload {

    @JsonUnwrapped
    T resource;

    public T getResource() {
        return resource;
    }

    public void setResource(T resource) {
        this.resource = resource;
    }

}
