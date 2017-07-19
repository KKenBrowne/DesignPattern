package State;

import java.util.HashMap;
import java.util.Map;


public class VoteManager {
	//����״�崦�����
	private VoteState state = null;
	
	//��¼�û�ͶƱ�Ľ����Map<String,String>��ӦMap<�û����ƣ�ͶƱ��ѡ��>
	private Map<String,String> mapVote = new HashMap<String,String>();
	
	//��¼�û�ͶƱ������Map<String,Integer>��ӦMap<�û����ƣ�ͶƱ�Ĵ���>
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
