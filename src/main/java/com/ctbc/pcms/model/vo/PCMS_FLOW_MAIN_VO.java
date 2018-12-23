package com.ctbc.pcms.model.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PCMS_FLOW_MAIN")
public class PCMS_FLOW_MAIN_VO extends PCMS_BASIC_VO {

	private static final long serialVersionUID = 1L;

	@Column(name = "CUSTOMER_ID")
	private String customerId;

	@Column(name = "CUSTOMER_NAME")
	private String customerName;

	@Column(name = "BUSINESS_ID")
	private String businessId;

	@Column(name = "BUSINESS_SEQ")
	private Integer businessSeq;

	@Column(name = "DEP_ID")
	private String depId;

	@Column(name = "ROC_DATE")
	private String rocDate;

	@Column(name = "BRANCH")
	private Integer branch;

	@Column(name = "STATUS")
	private String status;

	public PCMS_FLOW_MAIN_VO() {
	}

	public String getBusinessId() {
		return businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public Integer getBusinessSeq() {
		return businessSeq;
	}

	public void setBusinessSeq(Integer businessSeq) {
		this.businessSeq = businessSeq;
	}

	public String getDepId() {
		return depId;
	}

	public void setDepId(String depId) {
		this.depId = depId;
	}

	public String getRocDate() {
		return rocDate;
	}

	public void setRocDate(String rocDate) {
		this.rocDate = rocDate;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getBranch() {
		return branch;
	}

	public void setBranch(Integer branch) {
		this.branch = branch;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}