package com.bdqn.bean;

public class Comment {
    	
    	private Integer commentId;
    	
    	private String commentContent;

	public Integer getCommentId() {
	    return commentId;
	}

	public void setCommentId(Integer commentId) {
	    this.commentId = commentId;
	}

	public String getCommentContent() {
	    return commentContent;
	}

	public void setCommentContent(String commentContent) {
	    this.commentContent = commentContent;
	}

	@Override
	public String toString() {
	    return "Comment [commentId=" + commentId + ", commentContent=" + commentContent + "]";
	}
    	
    	
    	
}
