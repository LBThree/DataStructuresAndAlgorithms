package COP_HW1;

import java.io.*;
import java.util.*;

public class DynamicQueue {

  /*
   * FOR EACH CASE CHECK:
   *      IS THE LETTER IN THE QUEUE?
   *         - IF NOT, IS THE QUEUE FULL?
   *              - IF QUEUE FULL THEN DELETE FIRST ELEMENT AND INSERT NEW ELEMENT TO REAR
   *              - IF QUEUE NOT FULL THEN JUST INSERT TO REAR
   *
   *         - IF LETTER IS IN THE QUEUE
   *              - MOVE ITS POSITION TO THE REAR
   *                    - NEEDS TO BE DONE THROUGH POINTERS NOT DELETE+INSERT
   */

  public static void main(String[] args) {

    final int QUEUESIZE = 4;

    try {
      File file = new File(
          "C:\\Users\\Logan\\IdeaProjects\\DataStructuresAndAlgorithms\\Linked Lists\\src\\main\\java\\COP_HW1\\data.txt");
      Scanner scanner = new Scanner(file);

      Queue[] queue = new Queue[4];

      queue[0] = new Queue();
      queue[1] = new Queue();
      queue[2] = new Queue();
      queue[3] = new Queue();

      while (scanner.hasNextLine()) {

        // letter from data
        String letter = scanner.next();
        // number from data
        Integer queueNum = scanner.nextInt();

        switch (queueNum) {
          default -> {
            // if that queue is NOT empty
            if (!queue[queueNum].empty()) {

              // and the queue already has the letter in it
              if (queue[queueNum].hasThe(letter)) {

                // switch that letter to the rear
                queue[queueNum].switchToRear(letter);
                continue;

              } else {

                if (queue[queueNum].findLength() < QUEUESIZE) {

                  queue[queueNum].insert(letter);

                } else {

                  // queue IS full  queue[0].remove();  queue[0].insert(letter);
                  queue[queueNum].remove();
                  queue[queueNum].insert(letter);
                }
              }
              // if the queue is not empty and does not have the letter already in it

              //queue[queueNum].insert(letter);
              continue;
            }
            // if the queue is empty put the letter in it
            queue[queueNum].insert(letter);
          }
        }
      }
      System.out.println("Queue 0:");
      queue[0].queueData();
      System.out.println();

      System.out.println("Queue 1:");
      queue[1].queueData();
      System.out.println();

      System.out.println("Queue 2:");
      queue[2].queueData();
      System.out.println();

      System.out.println("Queue 3:");
      queue[3].queueData();
      System.out.println();

      scanner.close();


    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("Check that there isn't blank space at the end of the text file.");
    }

    // OLD METHOD
    /*
    try {
      File file = new File(
          "C:\\Users\\Logan\\IdeaProjects\\DataStructuresAndAlgorithms\\Linked Lists\\src\\main\\java\\COP_HW1\\data.txt");
      Scanner scanner = new Scanner(file);

      Queue[] queue = new Queue[4];

      queue[0] = new Queue();
      queue[1] = new Queue();
      queue[2] = new Queue();
      queue[3] = new Queue();

      while (scanner.hasNextLine()) {

        // letter from data
        String letter = scanner.next();
        // number from data
        Integer queueNum = scanner.nextInt();

        if (queueNum.equals(0)) {

          if (!queue[0].empty()) {

            if (queue[0].hasThe(letter)) {
              // switch it to the rear
              continue;
            }
            queue[0].insert(letter);
            continue;
          }
          queue[0].insert(letter);
        } else if (queueNum.equals(1)) {

          if (!queue[1].empty()) {

            if (queue[1].hasThe(letter)) {
              // switch it to the rear
              continue;
            }
            queue[1].insert(letter);
            continue;
          }
          queue[1].insert(letter);

        } else if (queueNum.equals(2)) {

          if (!queue[2].empty()) {

            if (queue[2].hasThe(letter)) {
              // switch it to the rear
              continue;
            }
            queue[2].insert(letter);
            continue;
          }
          queue[2].insert(letter);


        } else if (queueNum.equals(3)) {

          if (!queue[3].empty()) {

            if (queue[3].hasThe(letter)) {
              // switch it to the rear
              continue;
            }
            queue[3].insert(letter);
            continue;
          }
          queue[3].insert(letter);
        }


      } // END SCANNER

      System.out.println("Queue 0:");
      queue[0].queueData();
      System.out.println();

      System.out.println("Queue 1:");
      queue[1].queueData();
      System.out.println();

      System.out.println("Queue 2:");
      queue[2].queueData();
      System.out.println();

      System.out.println("Queue 3:");
      queue[3].queueData();
      System.out.println();

      scanner.close();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

     */

  }


}
