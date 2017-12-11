package com.bdqn.bean;

import java.util.List;

public class Blog {
    	
    	private Integer blogId;
    	
    	private String blogTitle;
    	
    	private String blogContent;
    	
    	private List<Comment> comments;

	public Integer getBlogId() {
	    return blogId;
	}

	public void setBlogId(Integer blogId) {
	    this.blogId = blogId;
	}

	public String getBlogTitle() {
	    return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
	    this.blogTitle = blogTitle;
	}

	public String getBlogContent() {
	    return blogContent;
	}

	public void setBlogContent(String blogContent) {
	    this.blogContent = blogContent;
	}

	public List<Comment> getComments() {
	    return comments;
	}

	public void setComments(List<Comment> comments) {
	    this.comments = comments;
	}

	@Override
	public String toString() {
	    return "Blog [blogId=" + blogId + ", blogTitle=" + blogTitle + ", blogContent=" + blogContent
		    + ", comments=" + comments + "]";
	}
    	
    	
    	
}
