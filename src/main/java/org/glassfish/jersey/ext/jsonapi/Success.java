package org.glassfish.jersey.ext.jsonapi;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

public abstract class Success {

    @JsonUnwrapped
    Meta meta;

    Resource[] included;

    Payload data;

}
