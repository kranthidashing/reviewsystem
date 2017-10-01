package com.spring.reviewsystem;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


//Admin
@Entity
@Table(name = "providedservices", catalog = "reviewsystem")
public class providedservices {
	
	@Id
	@Column(name="psid")
	private Integer PSid;
	@Column(name="psname")
	private String PSname;
	
	
	@ManyToMany(mappedBy = "providedservices", fetch = FetchType.EAGER)
	private Set<vendor> vendor;
	
	public providedservices() {
		
	}
	
	public providedservices(Integer PSid,String PSname) {
		this.PSid=PSid;
		this.PSname=PSname;
	}
	public providedservices(Integer PSid,String PSname,Set<vendor> vendor) {
		super();
		this.PSid=PSid;
		this.PSname=PSname;
		this.vendor=vendor;
	}
	
	public Integer getPSid() {
		return PSid;
	}
	public void setPSid(Integer PSid) {
		this.PSid=PSid;
	}
	public String getPSname() {
		return PSname;
	}
	public void setPSname(String PSname) {
		this.PSname=PSname;
	}
	public Set<vendor> getVendor() {
		return vendor;
	}
	
	public void setVendor(Set<vendor> vendor) {
		this.vendor=vendor;
	}
	
}
