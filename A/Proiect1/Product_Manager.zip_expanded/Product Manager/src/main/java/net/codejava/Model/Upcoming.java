package net.codejava.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Upcoming {
	
	
	private Long idu;
	private String dataa;
	private String plans;
	public Upcoming() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getIdu() {
		return idu;
	}
	public void setIdu(Long idu) {
		this.idu = idu;
	}
	public String getDataa() {
		return dataa;
	}
	public void setDataa(String dataa) {
		this.dataa = dataa;
	}
	public String getPlans() {
		return plans;
	}
	public void setPlans(String plans) {
		this.plans = plans;
	}
	
	

	
	

}
