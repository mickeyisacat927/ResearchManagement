package main.java.research.management.dao;

import java.util.List;

import main.java.research.management.model.Papers;

public interface IResearchManagementDao {
	public List<Papers> ListPapers();
	
	public Papers getPaper(Integer id);
}
