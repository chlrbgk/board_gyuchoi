package com.GameC.Domain;

import java.util.Date;

public class GameVO {
	
	private int gno;
	private String gTitle;
	private String gContent;
	private int gDownCnt;
	private Date gDate;
	private String gWriter;
	private String gTag;
	
	public String getgWriter() {
		return gWriter;
	}
	public void setgWriter(String gWriter) {
		this.gWriter = gWriter;
	}
	public String getgTag() {
		return gTag;
	}
	public void setgTag(String gTag) {
		this.gTag = gTag;
	}
	public int getGno() {
		return gno;
	}
	public void setGno(int gno) {
		this.gno = gno;
	}
	public String getgTitle() {
		return gTitle;
	}
	public void setgTitle(String gTitle) {
		this.gTitle = gTitle;
	}
	public String getgContent() {
		return gContent;
	}
	public void setgContent(String gContent) {
		this.gContent = gContent;
	}
	public int getgDownCnt() {
		return gDownCnt;
	}
	public void setgDownCnt(int gDownCnt) {
		this.gDownCnt = gDownCnt;
	}
	public Date getgDate() {
		return gDate;
	}
	public void setgDate(Date gDate) {
		this.gDate = gDate;
	}
	
	
	
}
