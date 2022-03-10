import java.time.LocalDateTime;

public class FeedBack {
	private LocalDateTime createdAt;
	private LocalDateTime sentAt;
	private Collaborator from;
	private Collaborator to;
	private String content;
	private boolean isRead;
	
	public FeedBack(Collaborator from, Collaborator to, String content) {
		this.from = from;
		this.to = to;
		this.content = content;
		this.createdAt.now();
	}
	
	public void markAsRead() {
		this.isRead = true;
	}
}
