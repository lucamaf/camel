
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.fhir;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link org.apache.camel.component.fhir.api.FhirTransaction}.
 */
@ApiParams(apiName = "transaction", description = "API for sending a transaction (collection of resources) to the server to be executed as a single unit",
           apiMethods = {@ApiMethod(methodName = "withBundle", description="Use the given raw text (should be a Bundle resource) as the transaction input"), @ApiMethod(methodName = "withResources", description="Use a list of resources as the transaction input")})
@UriParams
@Configurer
public final class FhirTransactionEndpointConfiguration extends FhirConfiguration {
    @UriParam
    @ApiParam(apiMethods = "withBundle", description = "Bundle to use in the transaction")
    private org.hl7.fhir.instance.model.api.IBaseBundle bundle;
    @UriParam
    @ApiParam(apiMethods = "withBundle,withResources", description = "See ExtraParameters for a full list of parameters that can be passed, may be NULL")
    private java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters,Object> extraParameters;
    @UriParam
    @ApiParam(apiMethods = "withResources", description = "Resources to use in the transaction")
    private java.util.List<org.hl7.fhir.instance.model.api.IBaseResource> resources;
    @UriParam
    @ApiParam(apiMethods = "withBundle", description = "Bundle to use in the transaction")
    private String stringBundle;

    public org.hl7.fhir.instance.model.api.IBaseBundle getBundle() {
        return bundle;
    }

    public void setBundle(org.hl7.fhir.instance.model.api.IBaseBundle bundle) {
        this.bundle = bundle;
    }

    public java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters,Object> getExtraParameters() {
        return extraParameters;
    }

    public void setExtraParameters(java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters,Object> extraParameters) {
        this.extraParameters = extraParameters;
    }

    public java.util.List<org.hl7.fhir.instance.model.api.IBaseResource> getResources() {
        return resources;
    }

    public void setResources(java.util.List<org.hl7.fhir.instance.model.api.IBaseResource> resources) {
        this.resources = resources;
    }

    public String getStringBundle() {
        return stringBundle;
    }

    public void setStringBundle(String stringBundle) {
        this.stringBundle = stringBundle;
    }
}
