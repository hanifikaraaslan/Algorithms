package algorithms;

import algorithms.methods.BracketControl;

public class main {

	public static void main(String[] args) {
		BracketControl bracketControl=new BracketControl();
		bracketControl.controller("[]{(({}()))}");

	}

}
