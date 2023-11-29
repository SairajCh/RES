package in.ies.bindings;

import java.time.LocalDate;

public class EdResponse {

	private Long caseNum;

	private String planName;

	private String planStatus;

	private Double benefitAmt;

	private LocalDate eligStartDae;

	private LocalDate eligEndDate;

	private String denialRsn;

	public Long getCaseNum() {
		return caseNum;
	}

	public void setCaseNum(Long caseNum) {
		this.caseNum = caseNum;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanStatus() {
		return planStatus;
	}

	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	public Double getBenefitAmt() {
		return benefitAmt;
	}

	public void setBenefitAmt(Double benefitAmt) {
		this.benefitAmt = benefitAmt;
	}

	public LocalDate getEligStartDae() {
		return eligStartDae;
	}

	public void setEligStartDae(LocalDate eligStartDae) {
		this.eligStartDae = eligStartDae;
	}

	public LocalDate getEligEndDate() {
		return eligEndDate;
	}

	public void setEligEndDate(LocalDate eligEndDate) {
		this.eligEndDate = eligEndDate;
	}

	public String getDenialRsn() {
		return denialRsn;
	}

	public void setDenialRsn(String denialRsn) {
		this.denialRsn = denialRsn;
	}

}
