package sec03.exam01_name_implement_class;
//����Ŭ����
public class Audio implements RemoteControl {
	//�ʵ�
	private int volume;
	
	//�������̽��� ��� �޼ҵ�� public ���� �����ڸ� �����Ƿ�
	//�߻�޼ҵ带 ��ü�޼ҵ�� �ۼ��� public �������Ѻ��� ���� ���������� �� �� ����.
	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME){
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME){
			this.volume = RemoteControl.MIN_VOLUME;
		}else{
			this.volume = volume;
		}
		System.out.println("���� Audio ���� : " + volume);
	}

}