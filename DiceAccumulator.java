/*
* File name: DiceAccumulator.java
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
public class DiceAccumulator
{
        private int snakeEyes;
        private int twos;
        private int threes;
        private int fours;
        private int fives;
        private int sixes;

        public void addSnakeEyes()
        {
                snakeEyes++;
        }
        public void addTwos()
        {
                twos++;
        }
        public void addThrees()
        {
                threes++;
        }
        public void addFours()
        {
                fours++;
        }
        public void addFives()
        {
                fives++;
        }
        public void addSixes()
        {
                sixes++;
        }
        /**
         * @return the snakeEyes
         */
        public int getSnakeEyes()
        {
                return snakeEyes;
        }
        /**
         * @return the twos
         */
        public int getTwos()
        {
                return twos;
        }
        /**
         * @return the threes
         */
        public int getThrees()
        {
                return threes;
        }
        /**
         * @return the fours
         */
        public int getFours()
        {
                return fours;
        }
        /**
         * @return the fives
         */
        public int getFives()
        {
                return fives;
        }
        /**
         * @return the sixes
         */
        public int getSixes()
        {
                return sixes;
        }

}
