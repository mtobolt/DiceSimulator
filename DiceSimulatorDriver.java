/*
* File name: DiceSimulatorDriver.java
*
* Programmer: Matt Tobolt
* ULID: mtobolt
*
* Date: Oct 28, 2014
*
* Class: IT 168
* Lecture Section: 01
* Lecture Instructor: Matsuda
* Lab Section: 03
* Lab Instructor: Karl Bissereth
*/
package die;

/**
  * <insert class description here>
  *
  * @author Matt Tobolt
  *
  */
public class DiceSimulatorDriver
{
        /**
         * @param args
         */
        public static void main(String[] args)
        {
                DiceSimulator simulator = new DiceSimulator();
                DiceAccumulator object = simulator.runSimulation(10000);

                System.out.println("Number of rolls: \t" + 10000);
                System.out.println("Number of snake eyes: \t" +  
object.getSnakeEyes() + "\nNumber twos: \t" + object.getTwos() + "\nNumber threes: \t" + object.getThrees() + "\nNumber fours: \t" + object.getFours()
                                                        + "\nNumber fives: \t" + object.getFives() + "\nNumber sixes: " + object.getSixes());
        }

}

