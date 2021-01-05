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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * S3Artifact is the location of an S3 artifact
 */
@ApiModel(description = "S3Artifact is the location of an S3 artifact")

public class S3Artifact {
  public static final String SERIALIZED_NAME_ACCESS_KEY_SECRET = "accessKeySecret";
  @SerializedName(SERIALIZED_NAME_ACCESS_KEY_SECRET)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector accessKeySecret;

  public static final String SERIALIZED_NAME_BUCKET = "bucket";
  @SerializedName(SERIALIZED_NAME_BUCKET)
  private String bucket;

  public static final String SERIALIZED_NAME_ENDPOINT = "endpoint";
  @SerializedName(SERIALIZED_NAME_ENDPOINT)
  private String endpoint;

  public static final String SERIALIZED_NAME_INSECURE = "insecure";
  @SerializedName(SERIALIZED_NAME_INSECURE)
  private Boolean insecure;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_ROLE_A_R_N = "roleARN";
  @SerializedName(SERIALIZED_NAME_ROLE_A_R_N)
  private String roleARN;

  public static final String SERIALIZED_NAME_SECRET_KEY_SECRET = "secretKeySecret";
  @SerializedName(SERIALIZED_NAME_SECRET_KEY_SECRET)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector secretKeySecret;

  public static final String SERIALIZED_NAME_USE_S_D_K_CREDS = "useSDKCreds";
  @SerializedName(SERIALIZED_NAME_USE_S_D_K_CREDS)
  private Boolean useSDKCreds;


  public S3Artifact accessKeySecret(io.kubernetes.client.openapi.models.V1SecretKeySelector accessKeySecret) {
    
    this.accessKeySecret = accessKeySecret;
    return this;
  }

   /**
   * Get accessKeySecret
   * @return accessKeySecret
  **/
  @ApiModelProperty(required = true, value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getAccessKeySecret() {
    return accessKeySecret;
  }


  public void setAccessKeySecret(io.kubernetes.client.openapi.models.V1SecretKeySelector accessKeySecret) {
    this.accessKeySecret = accessKeySecret;
  }


  public S3Artifact bucket(String bucket) {
    
    this.bucket = bucket;
    return this;
  }

   /**
   * Bucket is the name of the bucket
   * @return bucket
  **/
  @ApiModelProperty(required = true, value = "Bucket is the name of the bucket")

  public String getBucket() {
    return bucket;
  }


  public void setBucket(String bucket) {
    this.bucket = bucket;
  }


  public S3Artifact endpoint(String endpoint) {
    
    this.endpoint = endpoint;
    return this;
  }

   /**
   * Endpoint is the hostname of the bucket endpoint
   * @return endpoint
  **/
  @ApiModelProperty(required = true, value = "Endpoint is the hostname of the bucket endpoint")

  public String getEndpoint() {
    return endpoint;
  }


  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }


  public S3Artifact insecure(Boolean insecure) {
    
    this.insecure = insecure;
    return this;
  }

   /**
   * Insecure will connect to the service with TLS
   * @return insecure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Insecure will connect to the service with TLS")

  public Boolean getInsecure() {
    return insecure;
  }


  public void setInsecure(Boolean insecure) {
    this.insecure = insecure;
  }


  public S3Artifact key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Key is the key in the bucket where the artifact resides
   * @return key
  **/
  @ApiModelProperty(required = true, value = "Key is the key in the bucket where the artifact resides")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public S3Artifact region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Region contains the optional bucket region
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Region contains the optional bucket region")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public S3Artifact roleARN(String roleARN) {
    
    this.roleARN = roleARN;
    return this;
  }

   /**
   * RoleARN is the Amazon Resource Name (ARN) of the role to assume.
   * @return roleARN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RoleARN is the Amazon Resource Name (ARN) of the role to assume.")

  public String getRoleARN() {
    return roleARN;
  }


  public void setRoleARN(String roleARN) {
    this.roleARN = roleARN;
  }


  public S3Artifact secretKeySecret(io.kubernetes.client.openapi.models.V1SecretKeySelector secretKeySecret) {
    
    this.secretKeySecret = secretKeySecret;
    return this;
  }

   /**
   * Get secretKeySecret
   * @return secretKeySecret
  **/
  @ApiModelProperty(required = true, value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getSecretKeySecret() {
    return secretKeySecret;
  }


  public void setSecretKeySecret(io.kubernetes.client.openapi.models.V1SecretKeySelector secretKeySecret) {
    this.secretKeySecret = secretKeySecret;
  }


  public S3Artifact useSDKCreds(Boolean useSDKCreds) {
    
    this.useSDKCreds = useSDKCreds;
    return this;
  }

   /**
   * UseSDKCreds tells the driver to figure out credentials based on sdk defaults.
   * @return useSDKCreds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UseSDKCreds tells the driver to figure out credentials based on sdk defaults.")

  public Boolean getUseSDKCreds() {
    return useSDKCreds;
  }


  public void setUseSDKCreds(Boolean useSDKCreds) {
    this.useSDKCreds = useSDKCreds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S3Artifact s3Artifact = (S3Artifact) o;
    return Objects.equals(this.accessKeySecret, s3Artifact.accessKeySecret) &&
        Objects.equals(this.bucket, s3Artifact.bucket) &&
        Objects.equals(this.endpoint, s3Artifact.endpoint) &&
        Objects.equals(this.insecure, s3Artifact.insecure) &&
        Objects.equals(this.key, s3Artifact.key) &&
        Objects.equals(this.region, s3Artifact.region) &&
        Objects.equals(this.roleARN, s3Artifact.roleARN) &&
        Objects.equals(this.secretKeySecret, s3Artifact.secretKeySecret) &&
        Objects.equals(this.useSDKCreds, s3Artifact.useSDKCreds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeySecret, bucket, endpoint, insecure, key, region, roleARN, secretKeySecret, useSDKCreds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S3Artifact {\n");
    sb.append("    accessKeySecret: ").append(toIndentedString(accessKeySecret)).append("\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    insecure: ").append(toIndentedString(insecure)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    roleARN: ").append(toIndentedString(roleARN)).append("\n");
    sb.append("    secretKeySecret: ").append(toIndentedString(secretKeySecret)).append("\n");
    sb.append("    useSDKCreds: ").append(toIndentedString(useSDKCreds)).append("\n");
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

