package org.wso2.carbon.apimgt.rest.api.publisher.dto;

import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.apimgt.rest.api.publisher.dto.SubscriptionThrottlePolicyDTO;

import io.swagger.annotations.*;
import org.codehaus.jackson.annotate.*;

import javax.validation.constraints.NotNull;





@ApiModel(description = "")
public class SubscriptionThrottlePolicyListDTO  {
  
  
  
  private Integer count = null;
  
  
  private String next = null;
  
  
  private String previous = null;
  
  
  private List<SubscriptionThrottlePolicyDTO> list = new ArrayList<SubscriptionThrottlePolicyDTO>();

  
  /**
   * Number of Subscription throttle policies returned.\n
   **/
  @ApiModelProperty(value = "Number of Subscription throttle policies returned.\n")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  
  /**
   * Link to the next subset of resources qualified.\nEmpty if no more resources are to be returned.\nexample: \"/throttling/policies/subscription?limit=1&offset=2&query=\"\n
   **/
  @ApiModelProperty(value = "Link to the next subset of resources qualified.\nEmpty if no more resources are to be returned.\nexample: \"/throttling/policies/subscription?limit=1&offset=2&query=\"\n")
  @JsonProperty("next")
  public String getNext() {
    return next;
  }
  public void setNext(String next) {
    this.next = next;
  }

  
  /**
   * Link to the previous subset of resources qualified.\nEmpty if current subset is the first subset returned.\nexample: \"/throttling/policies/subscription?limit=1&offset=0&query=\"\n
   **/
  @ApiModelProperty(value = "Link to the previous subset of resources qualified.\nEmpty if current subset is the first subset returned.\nexample: \"/throttling/policies/subscription?limit=1&offset=0&query=\"\n")
  @JsonProperty("previous")
  public String getPrevious() {
    return previous;
  }
  public void setPrevious(String previous) {
    this.previous = previous;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("list")
  public List<SubscriptionThrottlePolicyDTO> getList() {
    return list;
  }
  public void setList(List<SubscriptionThrottlePolicyDTO> list) {
    this.list = list;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionThrottlePolicyListDTO {\n");
    
    sb.append("  count: ").append(count).append("\n");
    sb.append("  next: ").append(next).append("\n");
    sb.append("  previous: ").append(previous).append("\n");
    sb.append("  list: ").append(list).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
