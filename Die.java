/*
* File name: Die.java
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

import java.util.Random;

/**
  * <insert class description here>
  *
  * @author Matt Tobolt
  *
  */
public class Die
{
        private int spots;
        private Random generator = new Random();
        /**
         *
         */
        public Die()
        {
        }
        /**
         *
         */
        public void roll()
        {
                spots = generator.nextInt(6)+1;
        }
        /**
         * @return the spots
         */
        public int getSpots()
        {
                return spots;
        }
        public boolean equals(Die other)
        {
                return false;
        }
}