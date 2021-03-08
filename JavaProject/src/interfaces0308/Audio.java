package interfaces0308;

public class Audio implements RemoteControl{
	
	int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
		
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
		System.out.println("���� Audio ������ " + volume);
	}
		
	}
	

