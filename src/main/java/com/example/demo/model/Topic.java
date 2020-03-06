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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "topic")
public class Topic  {
    /**
	 * 
	 */
	private static final long serialVersionUID = -8886715004118418256L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

	@NotNull
    private int unit_no;

	private String topic_name;
	
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "unit_topic",
            joinColumns = {
                    @JoinColumn(name = "topic_id", referencedColumnName = "id",
                            nullable = false, updatable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name = "unit_id", referencedColumnName = "id",
                            nullable = false, updatable = false)})
    
    private Set<Unit> unit = new HashSet<>();
    
    public Set<Unit> getUnit() {
		return unit;
	}

	public void setUnit(Set<Unit> unit) {
		this.unit = unit;
	}

	@NotNull
    private int unit_id;
    
    public int getUnit_id() {
		return unit_id;
	}

	public void setUnit_id(int unit_id) {
		this.unit_id = unit_id;
	}

	public Topic() {}
    

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getUnit_no() {
		return unit_no;
	}

	public void setUnit_no(int unit_no) {
		this.unit_no = unit_no;
	}

	public String getTopic_name() {
		return topic_name;
	}

	public void setTopic_name(String topic_name) {
		this.topic_name = topic_name;
	}
}
    