package com.spring.boot.entity;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class Task {

	private int userId;
	private int day;
	private Timestamp date;
	private int topicId;
	private int status;
	private int percentage;
	private int dataReceived;
	private int dataProcessed;
	
	int getUserId() {
		return userId;
	}
	void setUserId(int userId) {
		this.userId = userId;
	}
	int getDay() {
		return day;
	}
	void setDay(int day) {
		this.day = day;
	}
	Timestamp getDate() {
		return date;
	}
	void setDate(Timestamp date) {
		this.date = date;
	}
	int getTopicId() {
		return topicId;
	}
	void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	int getStatus() {
		return status;
	}
	void setStatus(int status) {
		this.status = status;
	}
	int getPercentage() {
		return percentage;
	}
	void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	int getDataReceived() {
		return dataReceived;
	}
	void setDataReceived(int dataReceived) {
		this.dataReceived = dataReceived;
	}
	int getDataProcessed() {
		return dataProcessed;
	}
	void setDataProcessed(int dataProcessed) {
		this.dataProcessed = dataProcessed;
	}
	
}
