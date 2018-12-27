package laba2;

public class ThreadHandler implements Runnable{
	private int numFunction;
	private Handler handler =  Handler.getInstance();
	public ThreadHandler(int function) {
		this.numFunction = function;
	}
	@Override
	public void run() {
		// �������� ��� �������� ������ - ����� ���������� �������
		switch (numFunction) {
		case 0:
			System.out.println("����: "+ handler.Max());
			break;
		case 1:
			System.out.println("���: "+ handler.Min());
			break;
		case 2:
			System.out.println("����: "+ handler.Sum());
			break;
		case 3:
			System.out.println("����: "+ handler.Avg());
			break;
		case 4:
			System.out.println("��������: "+ handler.Del().toString());
			break;
		}
	}

}
