package com.ducky.model;

public class UserDatabase {
	private int id;
	private String title;
	private String staticlink;
	private String content;
	private String posttime;
	private String email;
	private String mobile;
	private String tag;
	private boolean posted;
	public UserDatabase(int id, String title, String staticlink, String content, String posttime, String email, String mobile,
			String tag, boolean posted) {
		super();
		this.id = id;
		this.title = title;
		this.staticlink = staticlink;
		this.content = content;
		this.posttime = posttime;
		this.email = email;
		this.mobile = mobile;
		this.tag = tag;
		this.posted = posted;
	}
	public UserDatabase() {
		super();
	}
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
	public String getStaticlink() {
		return staticlink;
	}
	public void setStaticlink(String staticlink) {
		this.staticlink = staticlink;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPosttime() {
		return posttime;
	}
	public void setPosttime(String posttime) {
		this.posttime = posttime;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public boolean isPosted() {
		return posted;
	}
	public void setPosted(boolean posted) {
		this.posted = posted;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+" "+this.title+" "+this.content+" "+this.staticlink+" "+this.email+" "+this.mobile+" "+this.tag+" "+this.posttime+" "+this.posted;
	}
}
