package org.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeName;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

@JsonTypeName("data")   
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(include=As.WRAPPER_OBJECT,use=Id.NAME)
public class AnswerSuccess {
	String status;
	String code;
	String description;
	public String getStatus() {
		return status;
	}
	public AnswerSuccess(String status, String code, String description) {
		super();
		this.status = status;
		this.code = code;
		this.description = description;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
