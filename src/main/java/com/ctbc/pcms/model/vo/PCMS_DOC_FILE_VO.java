package com.ctbc.pcms.model.vo;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PCMS_DOC_FILE")
public class PCMS_DOC_FILE_VO extends PCMS_BASIC_VO {

	private static final long serialVersionUID = 1L;

	@Column(name = "DOC_INFO_SEQ")
	private Integer docInfoSeq;

	@Column(name = "DOC_CONTENT")
	private Blob docContent;

	public Integer getDocInfoSeq() {
		return docInfoSeq;
	}

	public void setDocInfoSeq(Integer docInfoSeq) {
		this.docInfoSeq = docInfoSeq;
	}

	public Blob getDocContent() {
		return docContent;
	}

	public void setDocContent(Blob docContent) {
		this.docContent = docContent;
	}

}
