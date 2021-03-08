package interfaces0308;

// RemoteControl �������̽��� �����ϴ� ��ü
public class Television implements RemoteControl {

	int volume;

	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�");

	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�");

	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUMR) {
			this.volume = RemoteControl.MAX_VOLUMR;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {

			this.volume = volume;

		}
		System.out.println("���� TV ������ " + volume);
	}

}