package com.ctbc.pcms.model.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PCMS_DOC_INFO")
public class PCMS_DOC_INFO_VO extends PCMS_BASIC_VO {

	private static final long serialVersionUID = 1L;

	@Column(name = "FLOW_MAIN_SEQ")
	private Integer flowMainSeq;

	public Integer getFlowMainSeq() {
		return flowMainSeq;
	}

	public void setFlowMainSeq(Integer flowMainSeq) {
		this.flowMainSeq = flowMainSeq;
	}

}
