package com.ctbc.pcms.model.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PCMS_FLOW_BRANCH")
public class PCMS_FLOW_BRANCH_VO extends PCMS_BASIC_VO {

	private static final long serialVersionUID = 1L;

	@Column(name = "BRANCH")
	private Integer branch;

	@Column(name = "DELIVERY_USER")
	private String deliveryUser;

	@Column(name = "FLOW_MAIN_SEQ")
	private Integer flowMainSeq;

	@Column(name = "PROCESS_USER")
	private String processUser;

	@Column(name = "TRADE_ID")
	private String tradeId;

	@Column(name = "STATUS")
	private String status;

	public PCMS_FLOW_BRANCH_VO() {
	}

	public Integer getBranch() {
		return branch;
	}

	public void setBranch(Integer branch) {
		this.branch = branch;
	}

	public String getDeliveryUser() {
		return deliveryUser;
	}

	public void setDeliveryUser(String deliveryUser) {
		this.deliveryUser = deliveryUser;
	}

	public Integer getFlowMainSeq() {
		return flowMainSeq;
	}

	public void setFlowMainSeq(Integer flowMainSeq) {
		this.flowMainSeq = flowMainSeq;
	}

	public String getProcessUser() {
		return processUser;
	}

	public void setProcessUser(String processUser) {
		this.processUser = processUser;
	}

	public String getTradeId() {
		return tradeId;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}