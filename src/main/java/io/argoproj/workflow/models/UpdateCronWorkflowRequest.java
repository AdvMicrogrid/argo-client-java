/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: v2.12.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.workflow.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.workflow.models.CronWorkflow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UpdateCronWorkflowRequest
 */

public class UpdateCronWorkflowRequest {
  public static final String SERIALIZED_NAME_CRON_WORKFLOW = "cronWorkflow";
  @SerializedName(SERIALIZED_NAME_CRON_WORKFLOW)
  private CronWorkflow cronWorkflow;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;


  public UpdateCronWorkflowRequest cronWorkflow(CronWorkflow cronWorkflow) {
    
    this.cronWorkflow = cronWorkflow;
    return this;
  }

   /**
   * Get cronWorkflow
   * @return cronWorkflow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CronWorkflow getCronWorkflow() {
    return cronWorkflow;
  }


  public void setCronWorkflow(CronWorkflow cronWorkflow) {
    this.cronWorkflow = cronWorkflow;
  }


  public UpdateCronWorkflowRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * DEPRECATED: This field is ignored.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DEPRECATED: This field is ignored.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateCronWorkflowRequest namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCronWorkflowRequest updateCronWorkflowRequest = (UpdateCronWorkflowRequest) o;
    return Objects.equals(this.cronWorkflow, updateCronWorkflowRequest.cronWorkflow) &&
        Objects.equals(this.name, updateCronWorkflowRequest.name) &&
        Objects.equals(this.namespace, updateCronWorkflowRequest.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cronWorkflow, name, namespace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCronWorkflowRequest {\n");
    sb.append("    cronWorkflow: ").append(toIndentedString(cronWorkflow)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

