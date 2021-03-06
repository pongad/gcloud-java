// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface CancelOperationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.CancelOperationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.lang.String getProjectId();
  /**
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the operation resides.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.lang.String getZone();
  /**
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the operation resides.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getZoneBytes();

  /**
   * <pre>
   * Deprecated. The server-assigned `name` of the operation.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string operation_id = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.lang.String getOperationId();
  /**
   * <pre>
   * Deprecated. The server-assigned `name` of the operation.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string operation_id = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getOperationIdBytes();

  /**
   * <pre>
   * The name (project, location, operation id) of the operation to cancel.
   * Specified in the format 'projects/&#42;&#47;locations/&#42;&#47;operations/&#42;'.
   * </pre>
   *
   * <code>string name = 4;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name (project, location, operation id) of the operation to cancel.
   * Specified in the format 'projects/&#42;&#47;locations/&#42;&#47;operations/&#42;'.
   * </pre>
   *
   * <code>string name = 4;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
