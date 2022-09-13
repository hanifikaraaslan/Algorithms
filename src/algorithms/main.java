package algorithms;

import java.util.ArrayList;

import algorithms.methods.BracketControl;
import algorithms.methods.KmControll;

public class main {

	public static void main(String[] args) {
		//BracketControl bracketControl=new BracketControl();
	//	bracketControl.controller("{(({}()))}");
		
		KmControll kmControll=new KmControll();
		ArrayList<Integer> speed=new ArrayList<>();
		ArrayList<Integer> time=new ArrayList<>();
		speed.add(10);
		time.add(2);
		speed.add(20);
		time.add(3);
		int total=kmControll.kmCalculation(speed, time);
		System.out.println(total);
	}

}
