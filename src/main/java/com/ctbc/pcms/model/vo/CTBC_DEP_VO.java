package com.ctbc.pcms.model.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CTBC_DEP")
public class CTBC_DEP_VO extends PCMS_BASIC_VO {

	private static final long serialVersionUID = 1L;

	@Column(name = "DEP_ID")
	private String depId;

	@Column(name = "DEP_NAME")
	private String depName;

	public CTBC_DEP_VO() {
	}

	public String getDepId() {
		return depId;
	}

	public void setDepId(String depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

}