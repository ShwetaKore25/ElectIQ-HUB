package com.eci.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eci.entity.Candidate;

@Repository
public class CandidateDao {
	
	@Autowired
	SessionFactory sf;
	

	public Candidate getCandidate(int c_id) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Candidate candidate = session.get(Candidate.class, c_id);
		tx.commit();
		return candidate;
	}

	@SuppressWarnings("deprecation")
	public String setCandidate(Candidate c) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(c);
		tx.commit();
		return "Candidate Added";
	}

	@SuppressWarnings("deprecation")
	public String setCandidates(List<Candidate> c) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		for (Candidate candidate : c) {
			session.save(candidate);
		}
		tx.commit();
		return "Added Sucessfully.";
	}

	@SuppressWarnings("deprecation")
	public List<Candidate> getCandidates() {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Candidate> list = session.createQuery("from Candidate").list();
		tx.commit();
		return list;
	}

	@SuppressWarnings("deprecation")
	public String updateCandidate(int c_id, String name,String assembly,String statename, String partyname,int age, String gender) 
			{
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Candidate candidate = session.get(Candidate.class, c_id);
		candidate.setName(name);
		candidate.setAge(age);
		candidate.setGender(gender);
		candidate.setAssembly(assembly);
		candidate.setPartyname(partyname);
		candidate.setStatename(statename);
		session.saveOrUpdate(candidate);
		tx.commit();
		return "Candidate Updated";
	}

	@SuppressWarnings("deprecation")
	public String updateCandidateName(int c_id, String name) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Candidate candidate = session.get(Candidate.class, c_id);
		candidate.setName(name);
		session.saveOrUpdate(candidate);
		tx.commit();
		return "Name Update";
	}

	public List<Candidate> getCandidateByParty(String partyname) {
		List<Candidate> candidates = this.getCandidates();
		ArrayList<Candidate> db = new ArrayList<Candidate>();
		for (Candidate candidate : candidates) {
			if (candidate.getPartyname().equalsIgnoreCase(partyname)) {
				db.add(candidate);
			}
		}
		return db;
	}

	public List<Candidate> getCandidateByGender(String gender) {
		List<Candidate> candidates = this.getCandidates();
		ArrayList<Candidate> db = new ArrayList<Candidate>();
		for (Candidate candidate : candidates) {
			if (candidate.getGender().equalsIgnoreCase(gender)) {
				db.add(candidate);
			}
		}
		return db;
	}

	

}
