package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="game")
public class Game {
	@Id
	private int id;
	private String title;
	private String imageUrl;
	private Date start_date; 
	private Date end_date;
	
	@ManyToOne()
    @JoinColumn(name="title")
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	@Override
	public String toString() {
		return "Game [id=" + id + ", title=" + title + ", imageUrl=" + imageUrl + ", start_date=" + start_date
				+ ", end_date=" + end_date + "]";
	}
	
}
