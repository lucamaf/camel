
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.drive;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.google.api.services.drive.Drive$Files}.
 */
@ApiParams(apiName = "drive-files", description = "The files collection of methods",
           apiMethods = {@ApiMethod(methodName = "copy", description="Creates a copy of the specified file"), @ApiMethod(methodName = "delete", description="Permanently deletes a file by ID"), @ApiMethod(methodName = "emptyTrash", description="Permanently deletes all of the user's trashed files"), @ApiMethod(methodName = "export", description="Exports a Google Doc to the requested MIME type and returns the exported content"), @ApiMethod(methodName = "generateIds", description="Generates a set of file IDs which can be provided in insert requests"), @ApiMethod(methodName = "get", description="Gets a file's metadata by ID"), @ApiMethod(methodName = "insert", description="Insert a new file"), @ApiMethod(methodName = "list", description="Lists the user's files"), @ApiMethod(methodName = "patch", description="Updates file metadata and/or content"), @ApiMethod(methodName = "touch", description="Set the file's updated time to the current server time"), @ApiMethod(methodName = "trash", description="Moves a file to the trash"), @ApiMethod(methodName = "untrash", description="Restores a file from the trash"), @ApiMethod(methodName = "update", description="Updates file metadata and/or content"), @ApiMethod(methodName = "watch", description="Subscribe to changes on a file")})
@UriParams
@Configurer
public final class DriveFilesEndpointConfiguration extends GoogleDriveConfiguration {
    @UriParam
    @ApiParam(apiMethods = "copy,insert,patch,update", description = "The com.google.api.services.drive.model.File")
    private com.google.api.services.drive.model.File content;
    @UriParam
    @ApiParam(apiMethods = "watch", description = "The com.google.api.services.drive.model.Channel")
    private com.google.api.services.drive.model.Channel contentChannel;
    @UriParam
    @ApiParam(apiMethods = "copy,delete,export,get,patch,touch,trash,untrash,update,watch", description = "The ID of the file to copy")
    private String fileId;
    @UriParam
    @ApiParam(apiMethods = "insert,update", description = "The media HTTP content or null if none")
    private com.google.api.client.http.AbstractInputStreamContent mediaContent;
    @UriParam
    @ApiParam(apiMethods = "export", description = "The MIME type of the format requested for this export")
    private String mimeType;

    public com.google.api.services.drive.model.File getContent() {
        return content;
    }

    public void setContent(com.google.api.services.drive.model.File content) {
        this.content = content;
    }

    public com.google.api.services.drive.model.Channel getContentChannel() {
        return contentChannel;
    }

    public void setContentChannel(com.google.api.services.drive.model.Channel contentChannel) {
        this.contentChannel = contentChannel;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public com.google.api.client.http.AbstractInputStreamContent getMediaContent() {
        return mediaContent;
    }

    public void setMediaContent(com.google.api.client.http.AbstractInputStreamContent mediaContent) {
        this.mediaContent = mediaContent;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }
}
