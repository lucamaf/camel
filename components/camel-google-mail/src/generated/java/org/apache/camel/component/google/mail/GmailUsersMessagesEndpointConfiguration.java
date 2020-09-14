
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.mail;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.google.api.services.gmail.Gmail$Users$Messages}.
 */
@ApiParams(apiName = "messages", description = "The messages collection of methods",
           apiMethods = {@ApiMethod(methodName = "attachments", description="An accessor for creating requests from the Attachments collection"), @ApiMethod(methodName = "batchDelete", description="Deletes many messages by message ID"), @ApiMethod(methodName = "batchModify", description="Modifies the labels on the specified messages"), @ApiMethod(methodName = "delete", description="Immediately and permanently deletes the specified message"), @ApiMethod(methodName = "get", description="Gets the specified message"), @ApiMethod(methodName = "gmailImport", description="Imports a message into only this user's mailbox, with standard email delivery scanning and classification similar to receiving via SMTP"), @ApiMethod(methodName = "insert", description="Directly inserts a message into only this user's mailbox similar to IMAP APPEND, bypassing most scanning and classification"), @ApiMethod(methodName = "list", description="Lists the messages in the user's mailbox"), @ApiMethod(methodName = "modify", description="Modifies the labels on the specified message"), @ApiMethod(methodName = "send", description="Sends the specified message to the recipients in the To, Cc, and Bcc headers"), @ApiMethod(methodName = "trash", description="Moves the specified message to the trash"), @ApiMethod(methodName = "untrash", description="Removes the specified message from the trash")})
@UriParams
@Configurer
public final class GmailUsersMessagesEndpointConfiguration extends GoogleMailConfiguration {
    @UriParam
    @ApiParam(apiMethods = "batchDelete", description = "The com.google.api.services.gmail.model.BatchDeleteMessagesRequest")
    private com.google.api.services.gmail.model.BatchDeleteMessagesRequest batchDeleteMessagesRequest;
    @UriParam
    @ApiParam(apiMethods = "batchModify", description = "The com.google.api.services.gmail.model.BatchModifyMessagesRequest")
    private com.google.api.services.gmail.model.BatchModifyMessagesRequest batchModifyMessagesRequest;
    @UriParam
    @ApiParam(apiMethods = "gmailImport,insert,send", description = "The com.google.api.services.gmail.model.Message media metadata or null if none")
    private com.google.api.services.gmail.model.Message content;
    @UriParam
    @ApiParam(apiMethods = "delete,get,modify,trash,untrash", description = "The ID of the message to delete")
    private String id;
    @UriParam
    @ApiParam(apiMethods = "gmailImport,insert,send", description = "The media HTTP content or null if none")
    private com.google.api.client.http.AbstractInputStreamContent mediaContent;
    @UriParam
    @ApiParam(apiMethods = "modify", description = "The com.google.api.services.gmail.model.ModifyMessageRequest")
    private com.google.api.services.gmail.model.ModifyMessageRequest modifyMessageRequest;
    @UriParam
    @ApiParam(apiMethods = "batchDelete,batchModify,delete,get,gmailImport,insert,list,modify,send,trash,untrash", description = "The user's email address. The special value me can be used to indicate the authenticated user. default: me")
    private String userId;

    public com.google.api.services.gmail.model.BatchDeleteMessagesRequest getBatchDeleteMessagesRequest() {
        return batchDeleteMessagesRequest;
    }

    public void setBatchDeleteMessagesRequest(com.google.api.services.gmail.model.BatchDeleteMessagesRequest batchDeleteMessagesRequest) {
        this.batchDeleteMessagesRequest = batchDeleteMessagesRequest;
    }

    public com.google.api.services.gmail.model.BatchModifyMessagesRequest getBatchModifyMessagesRequest() {
        return batchModifyMessagesRequest;
    }

    public void setBatchModifyMessagesRequest(com.google.api.services.gmail.model.BatchModifyMessagesRequest batchModifyMessagesRequest) {
        this.batchModifyMessagesRequest = batchModifyMessagesRequest;
    }

    public com.google.api.services.gmail.model.Message getContent() {
        return content;
    }

    public void setContent(com.google.api.services.gmail.model.Message content) {
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public com.google.api.client.http.AbstractInputStreamContent getMediaContent() {
        return mediaContent;
    }

    public void setMediaContent(com.google.api.client.http.AbstractInputStreamContent mediaContent) {
        this.mediaContent = mediaContent;
    }

    public com.google.api.services.gmail.model.ModifyMessageRequest getModifyMessageRequest() {
        return modifyMessageRequest;
    }

    public void setModifyMessageRequest(com.google.api.services.gmail.model.ModifyMessageRequest modifyMessageRequest) {
        this.modifyMessageRequest = modifyMessageRequest;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
