package com.example.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "subtopic")
public class Subtopic {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "subtopic_topic",
            joinColumns = {
                    @JoinColumn(name = "subtopicid", referencedColumnName = "id",
                            nullable = false, updatable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name = "topicid", referencedColumnName = "id",
                            nullable = false, updatable = false)})
    
    private Set<Topic> topic = new HashSet<>();
    
    public Set<Topic> getTopic() {
		return topic;
	}


	public void setTopic(Set<Topic> topic) {
		this.topic = topic;
	}
	private String subtopic_name;
    private int topictype;
    private int topicid;
    
    public Subtopic() {}
    
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTopicid() {
		return topicid;
	}
	public void setTopicid(int topicid) {
		this.topicid = topicid;
	}
	
	public String getSubtopic_name() {
		return subtopic_name;
	}
	public void setSubtopic_name(String subtopic_name) {
		this.subtopic_name = subtopic_name;
	}
	public int getTopictype() {
		return topictype;
	}
	public void setTopictype(int topictype) {
		this.topictype = topictype;
	}
}