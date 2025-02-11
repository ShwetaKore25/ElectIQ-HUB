package com.eci.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Candidate {
	
	
	@Id
	private int c_id;
	private String name;
	private String assembly;
	private String statename;
	private String partyname;
	private int age;
	private String gender;
	
	public Candidate() {
		super();
	}

	public Candidate(int c_id, String name, String assembly, String statename, String partyname, int age,
			String gender) {
		super();
		this.c_id = c_id;
		this.name = name;
		this.assembly = assembly;
		this.statename = statename;
		this.partyname = partyname;
		this.age = age;
		this.gender = gender;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAssembly() {
		return assembly;
	}

	public void setAssembly(String assembly) {
		this.assembly = assembly;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public String getPartyname() {
		return partyname;
	}

	public void setPartyname(String partyname) {
		this.partyname = partyname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Candidate [c_id=" + c_id + ", name=" + name + ", assembly=" + assembly + ", statename=" + statename
				+ ", partyname=" + partyname + ", age=" + age + ", gender=" + gender + "]";
	}
	
	

}
