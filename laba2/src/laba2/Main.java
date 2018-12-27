package laba2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handler laba2 =  Handler.getInstance();
		laba2.setN(15); // передаем в н - кол-во генерируемых элементов
		laba2.Generate();
		Thread th1 = new Thread(new ThreadHandler(0));
		Thread th2 = new Thread(new ThreadHandler(1));
		Thread th3 = new Thread(new ThreadHandler(2));
		Thread th4 = new Thread(new ThreadHandler(3));
		Thread th5 = new Thread(new ThreadHandler(4));
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		try {
            th1.join();
            th2.join();
            th3.join();
            th4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		th5.start(); // запускаем 5 поток(удаление), после завершения других потоков
	}

}
