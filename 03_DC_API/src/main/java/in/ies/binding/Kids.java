package in.ies.binding;

import java.util.List;

public class Kids {

	public List<Kid> getKidsList() {
		return kidsList;
	}

	public void setKidsList(List<Kid> kidsList) {
		this.kidsList = kidsList;
	}

	public Integer getCaseNum() {
		return caseNum;
	}

	public void setCaseNum(Integer caseNum) {
		this.caseNum = caseNum;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	private List<Kid> kidsList;

	private Integer caseNum;

	private Integer userId;

}
