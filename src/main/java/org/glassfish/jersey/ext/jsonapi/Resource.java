package org.glassfish.jersey.ext.jsonapi;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

public final class Resource {

    String type;
    String id;

    @JsonUnwrapped
    Meta meta;

}
