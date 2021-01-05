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
import io.argoproj.workflow.models.ObjectFieldSelector;
import io.argoproj.workflow.models.ResourceFieldSelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DownwardAPIVolumeFile represents information to create the file containing the pod field
 */
@ApiModel(description = "DownwardAPIVolumeFile represents information to create the file containing the pod field")

public class DownwardAPIVolumeFile {
  public static final String SERIALIZED_NAME_FIELD_REF = "fieldRef";
  @SerializedName(SERIALIZED_NAME_FIELD_REF)
  private ObjectFieldSelector fieldRef;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private Integer mode;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_RESOURCE_FIELD_REF = "resourceFieldRef";
  @SerializedName(SERIALIZED_NAME_RESOURCE_FIELD_REF)
  private ResourceFieldSelector resourceFieldRef;


  public DownwardAPIVolumeFile fieldRef(ObjectFieldSelector fieldRef) {
    
    this.fieldRef = fieldRef;
    return this;
  }

   /**
   * Get fieldRef
   * @return fieldRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ObjectFieldSelector getFieldRef() {
    return fieldRef;
  }


  public void setFieldRef(ObjectFieldSelector fieldRef) {
    this.fieldRef = fieldRef;
  }


  public DownwardAPIVolumeFile mode(Integer mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Optional: mode bits to use on this file, must be a value between 0 and 0777. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: mode bits to use on this file, must be a value between 0 and 0777. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")

  public Integer getMode() {
    return mode;
  }


  public void setMode(Integer mode) {
    this.mode = mode;
  }


  public DownwardAPIVolumeFile path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the &#39;..&#39; path. Must be utf-8 encoded. The first item of the relative path must not start with &#39;..&#39;
   * @return path
  **/
  @ApiModelProperty(required = true, value = "Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public DownwardAPIVolumeFile resourceFieldRef(ResourceFieldSelector resourceFieldRef) {
    
    this.resourceFieldRef = resourceFieldRef;
    return this;
  }

   /**
   * Get resourceFieldRef
   * @return resourceFieldRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResourceFieldSelector getResourceFieldRef() {
    return resourceFieldRef;
  }


  public void setResourceFieldRef(ResourceFieldSelector resourceFieldRef) {
    this.resourceFieldRef = resourceFieldRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownwardAPIVolumeFile downwardAPIVolumeFile = (DownwardAPIVolumeFile) o;
    return Objects.equals(this.fieldRef, downwardAPIVolumeFile.fieldRef) &&
        Objects.equals(this.mode, downwardAPIVolumeFile.mode) &&
        Objects.equals(this.path, downwardAPIVolumeFile.path) &&
        Objects.equals(this.resourceFieldRef, downwardAPIVolumeFile.resourceFieldRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldRef, mode, path, resourceFieldRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownwardAPIVolumeFile {\n");
    sb.append("    fieldRef: ").append(toIndentedString(fieldRef)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    resourceFieldRef: ").append(toIndentedString(resourceFieldRef)).append("\n");
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

