package State;

import java.util.HashMap;
import java.util.Map;


public class VoteManager {
	//持有状体处理对象
	private VoteState state = null;
	
	//记录用户投票的结果，Map<String,String>对应Map<用户名称，投票的选项>
	private Map<String,String> mapVote = new HashMap<String,String>();
	
	//记录用户投票次数，Map<String,Integer>对应Map<用户名称，投票的次数>
	private Map<String,Integer> mapVoteCount = new HashMap<String,Integer>();
	
	public Map<String, String> getMapVote(){
		return mapVote;
	}
	
	
	public void vote(String user,String voteItem){
		Integer  oldVoteCount = mapVoteCount.get(user);
		if(oldVoteCount==null){
			oldVoteCount = 0;
		}
		oldVoteCount+=1;
		System.out.println(oldVoteCount);
		mapVoteCount.put(user, oldVoteCount);
		
		
		if(oldVoteCount==1){
			state = new NormalVoteState();
		}
		else if(oldVoteCount > 1 && oldVoteCount < 5){
            state = new RepeatVoteState();
        }
		
		else if(oldVoteCount >= 5 && oldVoteCount <8){
            state = new SpiteVoteState();
        }
		
		else if(oldVoteCount > 8){
            state = new BlackVoteState();
        }
		
		state.vote(user, voteItem, this);


	}
	
	
	
	
	
	


}
