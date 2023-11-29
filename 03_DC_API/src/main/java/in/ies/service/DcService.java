package in.ies.service;

import java.util.Map;

import in.ies.binding.DcSummary;
import in.ies.binding.Education;
import in.ies.binding.Income;
import in.ies.binding.Kids;
import in.ies.binding.PlanSelection;

public interface DcService {
	
	public Map<Integer,String> getPlans();

	public boolean savePlanSelection(PlanSelection planSel);
	
	public boolean saveIncome(Income income);
	
	public boolean saveEducation(Education education);
	
	public boolean saveKids(Kids kids);
	
	public DcSummary fetchSummaryInfo(Long caseNum);
	
}
