package org.wso2.carbon.apimgt.rest.api.publisher.dto;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.*;
import org.codehaus.jackson.annotate.*;

import javax.validation.constraints.NotNull;



/**
 * Throttling Conditions
 **/

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = org.wso2.carbon.apimgt.rest.api.publisher.dto.DateConditionDTO.class, name = "DateCondition"),
    @JsonSubTypes.Type(value = org.wso2.carbon.apimgt.rest.api.publisher.dto.DateRangeConditionDTO.class, name = "DateRangeCondition"),
    @JsonSubTypes.Type(value = org.wso2.carbon.apimgt.rest.api.publisher.dto.HTTPVerbConditionDTO.class, name = "HTTPVerbCondition"),
    @JsonSubTypes.Type(value = org.wso2.carbon.apimgt.rest.api.publisher.dto.HeaderConditionDTO.class, name = "HeaderCondition"),
    @JsonSubTypes.Type(value = org.wso2.carbon.apimgt.rest.api.publisher.dto.IPConditionDTO.class, name = "IPCondition"),
    @JsonSubTypes.Type(value = org.wso2.carbon.apimgt.rest.api.publisher.dto.JWTClaimsConditionDTO.class, name = "JWTClaimsCondition"),
    @JsonSubTypes.Type(value = org.wso2.carbon.apimgt.rest.api.publisher.dto.QueryParameterConditionDTO.class, name = "QueryParameterCondition"),
})
@ApiModel(description = "Throttling Conditions")
public class ThrottleConditionDTO  {
  
  
  @NotNull
  private String type = null;
  
  
  private Boolean invertCondition = null;
  
  
  private Boolean enabled = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("invertCondition")
  public Boolean getInvertCondition() {
    return invertCondition;
  }
  public void setInvertCondition(Boolean invertCondition) {
    this.invertCondition = invertCondition;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThrottleConditionDTO {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  invertCondition: ").append(invertCondition).append("\n");
    sb.append("  enabled: ").append(enabled).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
