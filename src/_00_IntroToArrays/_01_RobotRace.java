package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		//2. create an array of 5 robots.
		Robot[] robotArr = new Robot[10];
		
		for(int i = 0; i < robotArr.length; i++) {
			//3. use a for loop to initialize the robots.
			robotArr[i] = new Robot();
			robotArr[i].miniaturize();
			//4. make each robot start at the bottom of the screen, side by side, facing up
			robotArr[i].setY(500);
			robotArr[i].setX(i*100+50);
			robotArr[i].setSpeed(50);
		}
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
		for(int i = 0; i < robotArr.length; i++) {
			int randDist = (int)(Math.random()*50);
			robotArr[i].move(randDist);
		}
    	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		boolean allBelow = true;
		int winnerBot = 0;
		while(allBelow) {
			for(int i = 0; i < robotArr.length; i++) {
				int randDist = (int)(Math.random()*50);
				robotArr[i].move(randDist);
				if(robotArr[i].getY()<75) {
					allBelow = false;
					winnerBot = i;
					break;
				}
			}
		}
		//7. declare that robot the winner and throw it a party!
		robotArr[winnerBot].sparkle();
		System.out.println("Robot number " + winnerBot + " is the winner");
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.
		for(int i = 0; i < robotArr.length; i++) {
			robotArr[i].setY(300);
			robotArr[i].setX(i*10+600);
			robotArr[i].setSpeed(8);
		}
		
		boolean allNotFinished = true;
		while(allNotFinished) {
			for(int i = 0; i < robotArr.length; i++) {
				int randDist = (int)(Math.random()*50);
				robotArr[i].turn(-12);
				robotArr[i].move(randDist);
				if(robotArr[i].getY()>400&&robotArr[i].getX()>640) {
					allNotFinished = false;
					robotArr[winnerBot].unSparkle();
					winnerBot = i;
					break;
				}
			}
		}
		robotArr[winnerBot].sparkle();
		System.out.println("Robot number " + winnerBot + " is the winner");

	}
}
