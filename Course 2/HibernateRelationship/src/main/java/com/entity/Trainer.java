package com.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;

@Entity
public class Trainer {
	
	@Id
	private int tid;
	private String tname;
	private String tech;
	@OneToMany
	private List<Student> listOfStd; // trainer may have more than one students
	//@OneToOne
	//private Student student; // trainer may have more than one students
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public List<Student> getListOfStd() {
		return listOfStd;
	}
	public void setListOfStd(List<Student> listOfStd) {
		this.listOfStd = listOfStd;
	}

}
