package Memento;

//�����˽�ɫ�࣬�����˽�ɫ���𱣴汸��¼���󣬵��ǴӲ��޸ģ��������鿴������¼��������ݡ�
public class Caretaker {
	
	private Memento memento;
	
	/**
     * ����¼��ȡֵ����
     */
    public Memento retrieveMemento(){
        return this.memento;
    }
    /**
     * ����¼�ĸ�ֵ����
     */
    public void saveMemento(Memento memento){
        this.memento = memento;
    }



}
