package org.glassfish.jersey.ext.jsonapi;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

public final class CollectionResponse<T> implements Payload {

    @JsonUnwrapped
    T[] resources;

    public T[] getResources() {
        return resources;
    }

    public void setResources(T[] resources) {
        this.resources = resources;
    }
}
