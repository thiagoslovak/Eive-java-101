
public class Collaborator {
	private String surname;
	private String user;
	
	public Collaborator(String surname, String user) {
		this.surname = surname;
		this.user = surname;
	}
	
	public void sendFeedBack(Collaborator to, String cotent) {
		FeedBack feedback = new FeedBack(to, to, cotent);
	}
}
