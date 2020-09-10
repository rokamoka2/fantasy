package com.fantasystats.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	private String playerName;
	private String position;
	private String team;
	private int fumblesLost;
	private int passingInt;
	private int passingAttempt;
	private int passingCompletion;
	private int passingTouchDowns;
	private int passingYards;
	private int receivingTouchDowns;
	private int receivingYards;
	private int receivingReceptions;
	private int receivingTargets;
	private int rushingAttempt;
	private int rushingTouchDowns;
	private int rushingYards;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String plyerName) {
		this.playerName = plyerName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getPassingInt() {
		return passingInt;
	}
	public void setPassingInt(int passingInt) {
		this.passingInt = passingInt;
	}
	public int getPassingAttempt() {
		return passingAttempt;
	}
	public void setPassingAttempt(int passingAttempt) {
		this.passingAttempt = passingAttempt;
	}
	public int getPassingCompletion() {
		return passingCompletion;
	}
	public void setPassingCompletion(int passingCompletion) {
		this.passingCompletion = passingCompletion;
	}
	public int getPassingTouchDowns() {
		return passingTouchDowns;
	}
	public void setPassingTouchDowns(int passingTouchDowns) {
		this.passingTouchDowns = passingTouchDowns;
	}
	public int getPassingYards() {
		return passingYards;
	}
	public void setPassingYards(int passingYards) {
		this.passingYards = passingYards;
	}
	public int getReceivingTouchDowns() {
		return receivingTouchDowns;
	}
	public void setReceivingTouchDowns(int receivingTouchDowns) {
		this.receivingTouchDowns = receivingTouchDowns;
	}
	public int getReceivingYards() {
		return receivingYards;
	}
	public void setReceivingYards(int receivingYards) {
		this.receivingYards = receivingYards;
	}
	public int getReceivingReceptions() {
		return receivingReceptions;
	}
	public void setReceivingReceptions(int receivingReceptions) {
		this.receivingReceptions = receivingReceptions;
	}
	public int getReceivingTargets() {
		return receivingTargets;
	}
	public void setReceivingTargets(int receivingTargets) {
		this.receivingTargets = receivingTargets;
	}
	public int getRushingAttempt() {
		return rushingAttempt;
	}
	public void setRushingAttempt(int rushingAttempt) {
		this.rushingAttempt = rushingAttempt;
	}
	public int getRushingTouchDowns() {
		return rushingTouchDowns;
	}
	public void setRushingTouchDowns(int rushingTouchDowns) {
		this.rushingTouchDowns = rushingTouchDowns;
	}
	public int getRushingYards() {
		return rushingYards;
	}
	public void setRushingYards(int rushingYards) {
		this.rushingYards = rushingYards;
	}
	public int getFumblesLost() {
		return fumblesLost;
	}
	public void setFumblesLost(int fumblesLost) {
		this.fumblesLost = fumblesLost;
	}
	
	

}
