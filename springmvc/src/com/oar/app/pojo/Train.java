package com.oar.app.pojo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="train")
public class Train {
	@Id
	@GeneratedValue
	private int id;
	private int trainno;
	@Column(unique=true)
	private String trainname;
	private String source;
	private String destination;
	/*@Temporal(TemporalType.TIME)
	private Date dt;*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTrainno() {
		return trainno;
	}
	public void setTrainno(int trainno) {
		this.trainno = trainno;
	}
	public String getTrainname() {
		return trainname;
	}
	public void setTrainname(String trainname) {
		this.trainname = trainname;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	/*public Date getDt() {
		return dt;
	}
	public void setDt(Date dt) {
		this.dt = dt;
	}*/
	
	

}
