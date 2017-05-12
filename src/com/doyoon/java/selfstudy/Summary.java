package com.doyoon.java.selfstudy;

import java.text.SimpleDateFormat;

public class Summary {

	
	
	public Summary() {
		
		/* Diferrence between StringBuilder and String Buffer */
		/* StringBuilder is not synchronized, But fater than String Buffer */
		
		/* Simple Date Format Class */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		String date = sdf.format(System.currentTimeMillis());
		
		
		
	}
}
