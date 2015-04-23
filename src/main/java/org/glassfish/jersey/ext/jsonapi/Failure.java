package org.glassfish.jersey.ext.jsonapi;

public final class Failure {

    Error[] errors;

    public Error[] getErrors() {
        return errors;
    }

    public void setErrors(Error[] errors) {
        this.errors = errors;
    }
}
