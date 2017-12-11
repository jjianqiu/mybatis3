package com.bdqn.bean;

import java.util.List;

public class Author {
    	
    	private Integer authorId;
    	
    	private String authorName;
    	
    	private List<Blog> blogs;

	public Integer getAuthorId() {
	    return authorId;
	}

	public void setAuthorId(Integer authorId) {
	    this.authorId = authorId;
	}

	public String getAuthorName() {
	    return authorName;
	}

	public void setAuthorName(String authorName) {
	    this.authorName = authorName;
	}

	public List<Blog> getBlogs() {
	    return blogs;
	}

	public void setBlogs(List<Blog> blogs) {
	    this.blogs = blogs;
	}

	@Override
	public String toString() {
	    return "Author [authorId=" + authorId + ", authorName=" + authorName + ", blogs=" + blogs + "]";
	}
    	
    	
    
}
