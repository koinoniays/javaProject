package threads;

import java.awt.Toolkit;

class WorkerThread extends Thread { //��Ƽ������

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	

}

class NewThread implements Runnable { //Runnable �������̽�

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}	
}

public class BeepPrintExample {
	public static void main(String[] args) {
		
		// Thread ��ӹ޾Ƽ� ���ο� WorkerThread Ŭ��������
//		Thread thread = new WorkerThread();
//		thread.start();

		// Runnable �������̽��� �����ϴ� Ŭ������ Thread(new Runnable())�� ������ �Ű���
		Thread thread = new Thread(new NewThread());
		thread.start();
		
		// Runnable �������̽��� �����ϴ� �͸�Ŭ������ ����
		thread = new Thread(new Runnable() {

			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}		
				
			}
			
		});
		thread.start();
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
