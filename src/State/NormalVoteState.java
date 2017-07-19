package State;

public class NormalVoteState implements VoteState {

	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
		voteManager.getMapVote().put(user, voteItem);
		System.out.println("¹§Ï²Í¶Æ±³É¹¦");
	}

}
