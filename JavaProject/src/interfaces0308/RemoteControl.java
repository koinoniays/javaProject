package interfaces0308;
// �������̽�
public interface RemoteControl {
	static final int MAX_VOLUMR = 10;		//�������̽��� �ʵ�� ���(�ٲ� �� ���� ��)
	static final int MIN_VOLUME = 0;		//static final ���� ����
	
	void turnOn(); //�߻�޼ҵ�(�����κ��� ����)
	void turnOff();
	void setVolume(int volume);
}
