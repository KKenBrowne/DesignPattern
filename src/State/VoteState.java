package State;

import sun.awt.image.VolatileSurfaceManager;

/**
 * ����һ������ͶƱϵͳ��Ӧ�ã�Ҫʵ�ֿ���ͬһ���û�ֻ��ͶһƱ�����һ���û�����ͶƱ������ͶƱ��������5�Σ����ж�Ϊ����ˢƱ
 * ��Ҫȡ�����û�ͶƱ���ʸ񣬵�ȻͬʱҲҪȡ������Ͷ��Ʊ�����һ���û���ͶƱ��������8�Σ����������������ֹ�ٵ�¼��ʹ��ϵͳ��
	Ҫʹ��״̬ģʽʵ�֣�������Ҫ��ͶƱ���̵ĸ���״̬�������
	���������������·�Ϊ����״̬������ͶƱ������ͶƱ������ˢƱ�������������Ȼ�󴴽�һ��ͶƱ��������൱��Context����

 * @author Administrator
 *
 */
public interface VoteState {
	
	public void vote(String user,String voteItem,VoteManager votemanager);

}
