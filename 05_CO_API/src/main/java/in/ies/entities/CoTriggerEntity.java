package in.ies.entities;

import javax.persistence.Entity;

@Entity
public class CoTriggerEntity {
	
	private String trgStatus;
	
	private Long CaseNum;

	public String getNoticeStatus() {
		return trgStatus;
	}

	public void setNoticeStatus(String trgStatus) {
		this.trgStatus = trgStatus;
	}

	public Long getCaseNum() {
		return CaseNum;
	}

	public void setCaseNum(Long caseNum) {
		CaseNum = caseNum;
	}
	
	

}
