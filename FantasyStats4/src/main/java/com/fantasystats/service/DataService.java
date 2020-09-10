package com.fantasystats.service;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Service
public class DataService {
	
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	private final OkHttpClient client = new OkHttpClient();
//	private String APIkey = "3bae16f4f3e88474695e0f0cd5000109";
	
	public String getAllPlayersByWeek(int season, int week) throws IOException
	{
		log.debug("Api lekérdezés: " + season + " week " + week);
		Request request = new Request.Builder()
				.url("https://www.fantasyfootballdatapros.com/api/players/"+ season + "/" + week)
				.get()
				.build();
		Response response = client.newCall(request).execute();
		return response.body().string();
	}
	
	public String getAllPlayersBySeason(int season) throws IOException
	{
		log.debug("Api request: " + season + " full season.");
		Request request = new Request.Builder()
				.url("https://www.fantasyfootballdatapros.com/api/players/"+ season + "/all")
				.get()
				.build();
		Response response = client.newCall(request).execute();
		return response.body().string();
	}

}
