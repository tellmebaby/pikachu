package aaa.bbb.ccc.entity;

public class Reply {
	//속성:
	private int id;
	//댓글 단사람 아이디
	private String instaId;
	//댓글 내용 
	private String description;
	//댓글 라이크
	private boolean replyLike;
	//포스트아이디
	private long postId;
	
	
	
	public long getPostId() {
		return postId;
	}
	public void setPostId(long postId) {
		this.postId = postId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInstaId() {
		return instaId;
	}
	public void setInstaId(String instaId) {
		this.instaId = instaId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isReplyLike() {
		return replyLike;
	}
	public void setReplyLike(boolean replyLike) {
		this.replyLike = replyLike;
	}
	
	
}
