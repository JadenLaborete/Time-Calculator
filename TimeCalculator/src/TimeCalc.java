/* *
		There are 60 seconds in a minute. If the number of seconds entered by the user is greater than or equal to 60, the program should display the number of minutes in that many seconds.
		There are 3,600 seconds in an hour. If the number of seconds entered by the user is greater than or equal to 3,600, the program should display the number of hours in that many seconds. 
		There are 86,400 seconds in a day. If the number of seconds entered by the user is greater than or equal to 86,400, the program should display the number of days in that many seconds.
		
The output should look like this (it is a good idea to echo back the input): You entered 500,000 seconds, which is 5 days, 18 hours, 53 minutes and 20 seconds. (5 days 18:53:20 hours)
If the result is 0 days, then don't display the days, if the hours is 0 and the days are 0, then don't display the hours, if the minutes are 0, the hours are 0 and the days are 0, then only display the seconds.
 Also, if the result is 3 hours, 2 minutes and 5 seconds for example, don't display 3:2:5, instead display 3:02:05
Make sure you use constants in your program to represent the seconds in one minute, hour and day.
**/

import java.util.Scanner;
/**
 * 
 * @author Jaden Laborete
 * @version 09/12/2022
 *@Description The Program works by the user inputing as much seconds as they want. It converts the seconds into how much days, hours, minutes, and seconds depending how much they inputed in.  It works with the modulo operator and division.
 * Uses if else statements to display each individual time or combine time. Does not work with milliseconds.
 */
public class TimeCalc {

	/**
	 * 
	 * @param args
	 * start main
	 */
	
	public static void main(String[] args) {
		int yourTime;
		
		Scanner Keyboard = new Scanner(System.in);
		
		
		//Asking for user input seconds
		// User input 
		System.out.print("Enter number of seconds: ");
		//return user output
		yourTime = Keyboard.nextInt();
		
		//calculations for future calc.
		//used the modulo operator that I learned from python "%" that gets the remainder of a number/variable
		//seconds
		int seconds;
		seconds = yourTime % 60;
		//minutes
		int myMinutes;
		int minutes;
		myMinutes = yourTime / 60;
		minutes = myMinutes % 60;
		//hours
		int hours;
		hours = myMinutes / 60;
		hours = hours % 24;
		//days
		int yourDays;
		yourDays = yourTime / 86400;
		
		
	         
		//testing if the calculations work by printing
		/**
		System.out.println(yourDays);
		System.out.println(hours);
		System.out.println(minutes);
		System.out.println(seconds);
		**/
		//if else statements
		//for the time-like display
		if(minutes>9)
		{
		if(seconds>9)
		System.out.println(yourDays+" days "+hours+":"+minutes+":"+seconds+" hours");
		else
		System.out.println(yourDays+" days "+hours+":"+minutes+":0"+seconds+" hours");
		}
		else
		{
		if(seconds>9)
		System.out.println(yourDays+" days "+hours+":0"+minutes+":"+seconds+" hours");
		else
		System.out.println(yourDays+" days "+hours+":0"+minutes+":0"+seconds+" hours");
		}//end time-like display
		
		
		
		
		//start printing out 
		//if statements
		if(yourTime <= 59) {
			 System.out.println("You entered " + yourTime + " seconds which is " + yourTime + " second(s)." );
		 }else {
			 if(yourTime <= 3599) {
				 System.out.println("You entered " + yourTime + " seconds which is " + minutes + " minute(s) and " + seconds + " second(s).");
			 }else {
				 if(yourTime <= 86399) {
					 System.out.println("You entered " + yourTime + " seconds which is " + hours + " hour(s), " + minutes + " minute(s) and " + seconds + " second(s).");
				 }else {
					 if(yourTime >= 86400) {
						 System.out.println("You entered " + yourTime + " seconds which is " + yourDays + " day(s), " +hours + " hour(s), " + minutes + " minute(s) and " + seconds + " second(s)." );
						 if(minutes>9)
							{
							//print out/display statement determined by the final total of seconds
					 
				
					 }
					 
				 }Keyboard.close();
			 }
		 }

		 }
	}
}//end main


