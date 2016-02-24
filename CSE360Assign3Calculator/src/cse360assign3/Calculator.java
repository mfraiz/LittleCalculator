
package cse360assign3;

/** Calculator.java
 * This class represents a calculator that performs basic int operations (Add,Subtract,Divide,Multiply) on integers and stores the result as
 * an int. This class also keeps a log of all operations performed and can return this log in the form of a string. 
*
* @author Michael Fraiz
* @version Feb 24 2016.
*/

public class Calculator
{

	//Private value that represents the current int value stored in the calculator for calculations. 
	private int total;
	
	//String Builder Object that stores the log of actions performed by this class
	private StringBuilder historyLog = new StringBuilder();
	
	/**Calculator()
	 * Default constructor that creates a new calculator object with a default of 0 and an empty log String. 
	 * 
	 */
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
		
		historyLog.append("0"); //puts the starting value of the calculator into the log.
	}
	
	/** public int getTotal()
	*
	* @return total The integer value that corresponds to the current value held by
	* the calculator class.
	* 
	* This method returns the current total value stored in the calculator as an int.
	* Defaults to 0 if no calculations have been performed
	*/
	public int getTotal ()
	{
		return total;
	}
	
	/** public void add(int value)
	*
	* @param int value 				value to be added to total
	* This performs the addition operation, adding the param to the stored total
	* * Stores the resulting calculation back into total.
	*/
	public void add (int value) 
	{
		total = total + value;
		
		//Update String Log
		historyLog.append(" + " + value);
	}
	
	/** public void subtract(int value)
	*
	* @param int value 				value to be subtracted from total
	* This performs the subtraction operation, subtracting the param from the stored total
	* * Stores the resulting calculation back into total.
	*/
	public void subtract (int value) 
	{
		total = total - value;
		
		//Update String Log
		historyLog.append(" - " + value);
	}
	
	/** public void multiply (int value)
	*
	* @param int value 				value to be multiplied with total
	* This performs the multiplication operation and multiplies the param with the stored total
	* Stores the resulting calculation back into total. 
	*/
	public void multiply (int value)
	{
		total = total * value;
		
		//Update String Log
		historyLog.append(" * " + value);

	}
	
	/** public void divide (int value)
	*
	* @param int value 				value that total is divided by
	* This performs the integer division operation and divides the total by parameter value.
	* Stores the resulting calculation back into total. 
	*/
	public void divide (int value) 
	{
		//Check if divide by zero
		if (value == 0)
		{
			total = 0;
		}
		else
		{
			total = total / value;
		}
		
		//Update String Log
		historyLog.append(" / " + value);

	}
	
	/** public String getHistory ()
	*
	* @return String   This string contains the history of operations performed by that particular instance of the calculator class.
	
		This method returns the history of operations performed by the calculator class as a series of characters in a String.
		For example, if you subtract 5 then multiply by 2, this will return "- 5 * 2" and so on.
		Additionally, for purposes of this class, dividing by zero will reset the total to zero instead of NaN.
	*/
	public String getHistory () 
	{
		return historyLog.toString();
	}
}
