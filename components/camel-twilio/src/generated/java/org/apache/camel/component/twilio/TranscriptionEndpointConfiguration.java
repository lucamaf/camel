
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.Transcription}.
 */
@ApiParams(apiName = "transcription", description = "",
           apiMethods = {@ApiMethod(methodName = "deleter", description="Create a TranscriptionDeleter to execute delete"), @ApiMethod(methodName = "fetcher", description="Create a TranscriptionFetcher to execute fetch"), @ApiMethod(methodName = "reader", description="Create a TranscriptionReader to execute read"), })
@UriParams
@Configurer
public final class TranscriptionEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(apiMethods = "deleter,fetcher,reader", description = "The SID of the Account that created the resources to delete")
    private String pathAccountSid;
    @UriParam
    @ApiParam(apiMethods = "deleter,fetcher", description = "The unique string that identifies the resource")
    private String pathSid;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }
}
