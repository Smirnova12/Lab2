package laba2;

public class ThreadHandler implements Runnable{
	private int numFunction;
	private Handler handler =  Handler.getInstance();
	public ThreadHandler(int function) {
		this.numFunction = function;
	}
	@Override
	public void run() {
		// получаем при создание потока - номер вызываемой функции
		switch (numFunction) {
		case 0:
			System.out.println("макс: "+ handler.Max());
			break;
		case 1:
			System.out.println("мин: "+ handler.Min());
			break;
		case 2:
			System.out.println("сумм: "+ handler.Sum());
			break;
		case 3:
			System.out.println("сред: "+ handler.Avg());
			break;
		case 4:
			System.out.println("удаление: "+ handler.Del().toString());
			break;
		}
	}

}
