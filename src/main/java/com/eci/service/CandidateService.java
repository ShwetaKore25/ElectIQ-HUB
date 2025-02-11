package com.eci.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eci.dao.CandidateDao;
import com.eci.entity.Candidate;

@Service
public class CandidateService {
	
	
	@Autowired
	CandidateDao cd;

	public Candidate getCandidate(int c_id) {
		return cd.getCandidate(c_id);
	}

	public String setCandidate(Candidate c) {
		return cd.setCandidate(c);
	}

	public String setCandidates(List<Candidate> c) {
		return cd.setCandidates(c);
	}

	public List<Candidate> getCandidates() {
		return cd.getCandidates();
	}

	public String updateCandidate(int c_id, String name, String assembly, String partyname,
			String statename, int age,String gender) {
		return cd.updateCandidate(c_id, name, assembly, partyname, statename,age,gender);
	}

	public String updateCandidateName(int c_id, String name) {
		return cd.updateCandidateName(c_id, name);
	}

	public List<Candidate> getCandidateByParty(String partyname) {
		return cd.getCandidateByParty(partyname);
	}

	public List<Candidate> getCandidateByGender(String gender) {
		return cd.getCandidateByGender(gender);
	}
}


