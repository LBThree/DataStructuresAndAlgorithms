package COP_HW1;

/**
 * METHODS NEEDED: 1.) insert data in rear of queue 2.) delete data at front of queue 3.) swap data
 * to the rear 4.) check if the queue is full 5.) check if the queue is empty 6.)
 */

public class Queue {

  private Node front, rear;

  public Queue() {
    front = null;
    rear = null;
  }


  /*
  /**
   * @param data:
   */

  /*
  public void enqueue(Object data) {

    Node temp = new Node(data);

    if (this.rear == null) {
      this.front = this.rear = temp;
      return;
    }
    this.rear.setNext(temp);
    this.rear = temp;
  }

   */

  /*
  public void enQueue(Queue q, Object data) {

    Node temp = new Node();
    temp.setData(data);

    if (q.front == null) {
      q.front = temp;
    } else {
      q.rear.setNext(temp);
    }
    q.rear = temp;
    q.rear.setNext(q.front);
  }

   */

  public boolean empty() {
    return (front == null);
  }

  public void insert(Object x) {

    Node p = new Node(x, null);

    if (empty()) {
      front = p;
    } else {
      rear.setNext(p);
    }
    rear = p;

  } // end insert

  public Object remove() {

    if (empty()) {
      System.out.println("queue underflow");
      System.exit(1);
    }

    Node p = front;
    Object temp = p.getData();
    front = p.getNext();
    if (front == null) {
      rear = null;
    }

    return temp;

  } // end remove


  public int nodeCounter() {

    int counter = 0;
    Node temp = front;

    while (temp != null) {
      counter++;
      temp.getNext();

      return counter;
    }
    return 0;
  }


  /**
   * prints out the data in that queue
   */
  public void queueData() {

    Node p = front;

    while (p != null) {
      Object temp = p.getData();
      System.out.println(temp);
      p = p.getNext();
    }
  }

  public boolean hasThe(String letter) {

    Node tempFront = front;

    while (tempFront != null) {
      Object frontData = tempFront.getData();

      if (frontData.equals(letter)) {
        return true;
      }
      tempFront = tempFront.getNext();
    }
    return false;
  }


  /**
   * When we find the node that contains the same letter (letterNode), we need letterNode - 1 and
   * letterNode + 1. We take the letterNode out, connect the two adjacent nodes, and put the
   * letterNode onto the rear
   *
   * @param letter: the letter that is repeated in the queue
   */
  public void switchToRear(String letter) {

    Node tempFront = front;
    Node tempRear = rear;

    Node pntr1 = front;
    Node pntr2 = front;

    while (!pntr1.getData().equals(letter)) {

      pntr1 = pntr1.getNext();
      pntr2 = pntr2.getNext().getNext();
    }
    //tempFront.setNext(pntr2);

    tempFront.setNext(pntr1.getNext());



    /*
    Node tempFront = front;
    Node afterFront = front.getNext();

    Node tempRear = rear;

    while (!tempFront.getData().equals(letter)) {
      tempFront = tempFront.getNext();
    }
    front.setNext(afterFront);
    */

  }

  public void switchRear(String letter) {

    Node tempFront = front;

    while (!tempFront.getData().equals(letter)) {
      tempFront = tempFront.getNext();
    }
    remove();

  }

  public int findLength() {
    int length = 0;
    Node p = front;
    while (p != null) {
      length++;
      p = p.getNext();
    }
    return length;
  }


}
