/*
* File name: DiceSimulator.java
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
public class DiceSimulator
{
        public DiceAccumulator runSimulation(int numberRolls)
        {
                DiceAccumulator stats = new DiceAccumulator();
                Die die1 = new Die();
                Die die2 = new Die();

                int i = 0;

                while(i <= numberRolls)
                {
                        die1.roll();
                        die2.roll();
                        if(die1.equals(die2))
                        {
                                stats.addSnakeEyes();
                        }
                        else if(die1.getSpots() == 2 && die2.getSpots() == 2)
                        {
                                stats.addTwos();
                        }
                        else if(die1.getSpots() == 3 && die2.getSpots() == 3)
                        {
                                stats.addThrees();
                        }
                        else if(die1.getSpots() == 4 && die2.getSpots() == 4)
                        {
                                stats.addFours();
                        }
                        else if(die1.getSpots() == 5 && die2.getSpots() == 5)
                        {
                                stats.addFives();
                        }
                        else
                                stats.addSixes();
                }
                return stats;
        }
}
