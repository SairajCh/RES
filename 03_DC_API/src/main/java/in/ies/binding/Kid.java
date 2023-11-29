package in.ies.binding;

import java.time.LocalDate;

public class Kid {

	private String Kidname;

	public String getKidname() {
		return Kidname;
	}

	public void setKidname(String kidname) {
		Kidname = kidname;
	}

	public LocalDate getKidDob() {
		return kidDob;
	}

	public void setKidDob(LocalDate kidDob) {
		this.kidDob = kidDob;
	}

	public Long getKidSsn() {
		return kidSsn;
	}

	public void setKidSsn(Long kidSsn) {
		this.kidSsn = kidSsn;
	}

	private LocalDate kidDob;

	private Long kidSsn;
	
}
