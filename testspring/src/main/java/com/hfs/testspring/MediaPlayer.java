package com.hfs.testspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MediaPlayer {
	private CD myCd;

	@Autowired
	public MediaPlayer(CD myCd) {
		this.myCd = myCd;
	}
	
	public void play()
	{
		myCd.play();
	}
}
