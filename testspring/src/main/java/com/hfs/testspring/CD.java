package com.hfs.testspring;

import org.springframework.stereotype.Component;

@Component
public class CD {
	private String[] tracks = {"row1","row2","row3"};
	public void play()
	{
		for (String string : tracks) {
			System.out.println(string);
		}
	}
}
