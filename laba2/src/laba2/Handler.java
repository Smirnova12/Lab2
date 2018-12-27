package laba2;

import java.util.ArrayList;
import java.util.Random;

public class Handler {
	private static Handler instance; 
	private  ArrayList<Integer> numList;
	private Random random;
	private int n;
	private Handler() {
		
		this.random = new Random();
		this.numList = new ArrayList<Integer>();	

	}
	public void setN(int n) {
		this.n = n;
	}
	public static Handler getInstance() {
		if (instance == null) {
			instance = new Handler();
		}
		return instance;
	}
	public int Max() {
		int max1 = 0;
		for (int i = 0; i < this.n; i++) {
		if (this.numList.get(i) > max1) {
			max1 = this.numList.get(i);
			}
		}
		return max1;
		//функция максимума с масивом
	}
	public int Min() {
		int min = 100;
		for (int i = 0; i < this.n; i++) {
			if (this.numList.get(i) < min){
				min = this.numList.get(i);
			}
		}	
		return min;
		//функция минимума
	}
	public int Sum() {
		int sum = 0;
		//функция суммы
		for (int i = 0; i < this.n; i++) {
			sum = sum + this.numList.get(i);
		}
		return sum;
	}
	public double Avg() {
		double sred = 0.0;
		double sum = this.Sum();
		sred = sum / this.n;
		//функция среднего значения
		return sred;
	}
	public ArrayList<Integer> Del() {
		for (int i = 0; i < this.numList.size(); i++) {
			if ((this.numList.get(i) % 2) != 0) { // ==0 удаляем четные, != нечетные
				this.numList.remove(i);
				i--;
			}		
		}
		return numList;
		//функция удаления 
	}
	
	public void Generate () {
		if(n > 0) {    // 
			for(int i = 0; i < this.n; i++) {
				this.numList.add(random.nextInt(101)); 
				System.out.println(this.numList.get(i));
			}
		}
		else {
			System.out.println("Ошибка");
		}
	}
}
