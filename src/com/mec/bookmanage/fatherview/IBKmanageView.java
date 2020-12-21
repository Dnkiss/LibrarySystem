package com.mec.bookmanage.fatherview;

import java.awt.Font;

public interface IBKmanageView {
		
	public final Font topicFont = new Font("宋体", Font.BOLD, 50);
	public final Font topicFont1 = new Font("宋体", Font.BOLD, 25);
	public final Font textfield1font = new Font("宋体", Font.BOLD, 20);
	public final Font TextTopicfont = new Font("宋体", Font.BOLD, 20);
	public final Font warningTopicfont = new Font("宋体", Font.BOLD, 40);
	
	public void init();
	public void dealAction();
	public void showView();
	public void exitView();	
}
