package org.model;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeName;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;


@JsonTypeName("data")   
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(include=As.WRAPPER_OBJECT,use=Id.NAME)
public class AxaTopUps {
	
	String id;
	String type;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public AxaTopUpsAttributes getAttributes() {
		return attributes;
	}

	public void setAttributes(AxaTopUpsAttributes attributes) {
		this.attributes = attributes;
	}

	@JsonProperty("attributes")
	public AxaTopUpsAttributes attributes;
	/*
	{
	    "data": {
	        "id": "c2cc290e-7dc3-11e7-80c3-005056875f59",
	        "type": "axapack-topups",
	        "attributes": {
	            "master-msisdn": "99597123456",
	            "slave-msisdn": "99597123457",
	            "notify-msisdn": "99597123456",
	            "amount" : 100,
	            "transfer-datetime" : "2017-08-18T10:15:15.000+03:00"
	        }
	    }
	}*/

	@JsonIgnoreProperties(ignoreUnknown = true)
	public class AxaTopUpsAttributes{
		
		
		public String getMaster_msisdn() {
			return master_msisdn;
		}
		public void setMaster_msisdn(String master_msisdn) {
			this.master_msisdn = master_msisdn;
		}
		public String getSlave_msisdn() {
			return slave_msisdn;
		}
		public void setSlave_msisdn(String slave_msisdn) {
			this.slave_msisdn = slave_msisdn;
		}
		public String getNotify_msisdn() {
			return notify_msisdn;
		}
		public void setNotify_msisdn(String notify_msisdn) {
			this.notify_msisdn = notify_msisdn;
		}
		public String getAmount() {
			return amount;
		}
		public void setAmount(String amount) {
			this.amount = amount;
		}
		public String getTransfer_datetime() {
			return transfer_datetime;
		}
		public void setTransfer_datetime(String transfer_datetime) {
			this.transfer_datetime = transfer_datetime;
		}

		@JsonProperty("master-msisdn")
		String master_msisdn;
		@JsonProperty("slave-msisdn")
		String slave_msisdn;
		@JsonProperty("notify-msisdn")
		String notify_msisdn;
		String amount;
		@JsonProperty("transfer-datetime")
		String transfer_datetime;
	}
}
