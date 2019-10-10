/**
 * --------------------------------------------------------------------------------------------
 * NAME         : ALAN THOMAS PAUL MUNDADAN
 * CLASS        : CSE 360
 * DATE         : 10/09/2019
 * CLASS NUMBER : 70642
 * PURPOSE      : PERFORM THE FUNCTIONS OF A BASIC CALCULATOR
 * --------------------------------------------------------------------------------------------               
 */

package cse360assign2;

public class AddingMachine {

	private int total;
	private String ophistory = "0";
	//--RETURNS THE TOTAL
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	//--FUNCTION TO ADD VALUE
	public void add (int value) {
		total = total+value;
		ophistory = ophistory + " + " + value;
		
	}
	//--FUNCTION TO SUBTRACT VALUE
	public void subtract (int value) {
		total = total - value;
		ophistory = ophistory + " - " + value;
		
	}
	//--FUNTION TO CONVERT TO STRING	
	public String toString () {
		return ophistory;
	}
    //--FUNCTION TO THE CLEAR THE DATA
	public void clear() {
		total = 0;
		ophistory = "";
	
	}
}
