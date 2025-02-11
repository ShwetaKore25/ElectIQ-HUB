package com.eci.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eci.entity.Candidate;
import com.eci.service.CandidateService;

@RestController
public class CandidateController {
	
	
	@Autowired
	CandidateService service;

	@GetMapping("/showCandidate")
	public Candidate getCandidateAPI(@RequestParam int c_id) {		
		return service.getCandidate(c_id);
	}

	@GetMapping("/showCandidates")
	public List<Candidate> getCandidatesAPI() {
		return service.getCandidates();
	}

	@PostMapping("/addCandidate")
	public String setCandidateAPI(@RequestBody Candidate c) {
		return service.setCandidate(c);
	}

	@PostMapping("/addCandidates")
	public String setCandidatesAPI(@RequestBody List<Candidate> c) {
		return service.setCandidates(c);
	}

	@PutMapping("/updateCandidate")
	public String updateCandidateAPI(@RequestParam int c_id, @RequestParam String name, @RequestParam String assembly, @RequestParam String partyname,
			@RequestParam String statename,@RequestParam int age,@RequestParam String gender) {
		return service.updateCandidate(c_id, name, assembly, partyname, statename,age, gender);
	}

	@PatchMapping("/updateCandidateName")
	public String updateCandidateNameAPI(@RequestParam("id") int c_id, @RequestParam String name) {
		return service.updateCandidateName(c_id, name);
	}

	@GetMapping("/showCandidateByParty")
	public List<Candidate> getCandidateByPartyAPI(@RequestParam String partyname) {
		return service.getCandidateByParty(partyname);
	}

	@GetMapping("/showCandidateByGender")
	public List<Candidate> getCandidateByGenderAPI(@RequestParam String gender) {
		return service.getCandidateByGender(gender);
	}


}
