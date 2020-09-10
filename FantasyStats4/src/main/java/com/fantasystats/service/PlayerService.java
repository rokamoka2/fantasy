package com.fantasystats.service;
import java.io.IOException;
import java.util.ArrayList;

import org.json.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fantasystats.domain.Player;

@Service
public class PlayerService {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	DataService ds;
	
	public ArrayList<Player> getAllPlayersByWeek(int season, int week) throws IOException{
		ArrayList<Player> list = new ArrayList<Player>();
		String response = ds.getAllPlayersByWeek(season, week);		
		JSONArray arr = new JSONArray(response);
		for (int i=0; i<arr.length(); i++) 
		{ 
			Player player = new Player();
			player.setPlayerName(arr.getJSONObject(i).getString("player_name"));
			player.setPosition(arr.getJSONObject(i).getString("position"));
			player.setTeam(arr.getJSONObject(i).getString("team"));
			log.debug("Új játékos: " + player.getPlayerName());
			list.add(player);
		}		
		return list;		
	}
	public ArrayList<Player> getAllPlayersBySeason(int season) throws IOException{
		ArrayList<Player> list = new ArrayList<Player>();
		String response = ds.getAllPlayersBySeason(season);
		JSONArray arr = new JSONArray(response);
		for (int i=0; i<arr.length(); i++) 
		{ 
			Player player = new Player();
			player.setPlayerName(arr.getJSONObject(i).getString("player_name"));
			player.setPosition(arr.getJSONObject(i).getString("position"));
			player.setTeam(arr.getJSONObject(i).getString("team"));
			log.debug("Új játékos: " + player.getPlayerName());
			list.add(player);
		}		
		return list;		
	}

}
