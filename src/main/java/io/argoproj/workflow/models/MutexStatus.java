/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: v2.11.4
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
import io.argoproj.workflow.models.MutexHolding;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MutexStatus contains which objects hold  mutex locks, and which objects this workflow is waiting on to release locks.
 */
@ApiModel(description = "MutexStatus contains which objects hold  mutex locks, and which objects this workflow is waiting on to release locks.")

public class MutexStatus {
  public static final String SERIALIZED_NAME_HOLDING = "holding";
  @SerializedName(SERIALIZED_NAME_HOLDING)
  private List<MutexHolding> holding = null;

  public static final String SERIALIZED_NAME_WAITING = "waiting";
  @SerializedName(SERIALIZED_NAME_WAITING)
  private List<MutexHolding> waiting = null;


  public MutexStatus holding(List<MutexHolding> holding) {
    
    this.holding = holding;
    return this;
  }

  public MutexStatus addHoldingItem(MutexHolding holdingItem) {
    if (this.holding == null) {
      this.holding = new ArrayList<MutexHolding>();
    }
    this.holding.add(holdingItem);
    return this;
  }

   /**
   * Holding is a list of mutexes and their respective objects that are held by mutex lock for this 
   * @return holding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Holding is a list of mutexes and their respective objects that are held by mutex lock for this ")

  public List<MutexHolding> getHolding() {
    return holding;
  }


  public void setHolding(List<MutexHolding> holding) {
    this.holding = holding;
  }


  public MutexStatus waiting(List<MutexHolding> waiting) {
    
    this.waiting = waiting;
    return this;
  }

  public MutexStatus addWaitingItem(MutexHolding waitingItem) {
    if (this.waiting == null) {
      this.waiting = new ArrayList<MutexHolding>();
    }
    this.waiting.add(waitingItem);
    return this;
  }

   /**
   * Waiting is a list of mutexes and their respective objects this workflow is waiting for.
   * @return waiting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Waiting is a list of mutexes and their respective objects this workflow is waiting for.")

  public List<MutexHolding> getWaiting() {
    return waiting;
  }


  public void setWaiting(List<MutexHolding> waiting) {
    this.waiting = waiting;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MutexStatus mutexStatus = (MutexStatus) o;
    return Objects.equals(this.holding, mutexStatus.holding) &&
        Objects.equals(this.waiting, mutexStatus.waiting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holding, waiting);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MutexStatus {\n");
    sb.append("    holding: ").append(toIndentedString(holding)).append("\n");
    sb.append("    waiting: ").append(toIndentedString(waiting)).append("\n");
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

