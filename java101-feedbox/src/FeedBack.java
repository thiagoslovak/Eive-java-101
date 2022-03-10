import java.time.LocalDateTime;

public class FeedBack {
	private LocalDateTime createdAt;
	private LocalDateTime sentAt;
	private Collaborator from;
	private Collaborator to;
	private String content;
	private boolean isRead;
	
	public void markAsRead() {
		this.isRead = true;
	}
}
