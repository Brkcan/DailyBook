package com.dailybook.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dailybookmodel")
public class DailyBook {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "nickName")
	private String nickName;

	@Column(name = "daily")
	private String daily;

	@Column(name = "subjectDaily")
	private String subjectDaily;

	@Column(name = "utilDate")
	private Date utilDate;

	public DailyBook() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getDaily() {
		return daily;
	}

	public void setDaily(String daily) {
		this.daily = daily;
	}

	public String getSubjectDaily() {
		return subjectDaily;
	}

	public void setSubjectDaily(String subjectDaily) {
		this.subjectDaily = subjectDaily;
	}

	public Date getUtilDate() {
		return utilDate;
	}

	public void setUtilDate(Date utilDate) {
		this.utilDate = utilDate;
	}

	@Override
	public String toString() {
		return "DailyBook [id=" + id + ", nickName=" + nickName + ", daily=" + daily + ", subjectDaily=" + subjectDaily
				+ ", utilDate=" + utilDate + "]";
	}

}
