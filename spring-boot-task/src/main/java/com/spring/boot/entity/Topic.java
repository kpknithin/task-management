package com.spring.boot.entity;

public class Topic {

	private int id;
	private String topicName;
	private String taskName;
	
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getTopicName() {
		return topicName;
	}
	void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	String getTaskName() {
		return taskName;
	}
	void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
}
