package com.csc;

public class QueueTees {
  String desc = "";
  Integer cuteness = 0;
  int front = -1;
  int back = 0;
  Cutie[] cutieQueue = new Cutie[3];
  public void EnQueue(Cutie insert) {
    if (front == -1) {
      front = 0;
    }
    if (back >= 2) {
      System.out.println("The Queue is full");
    }
    else {
      back++;
      cutieQueue[back] = insert;
    }
  }
  public void deQueue() {
    if (front == -1) {
      System.out.println("The Queue is empty");
    }
    else {
      cutieQueue[front] = null;
      if(front >= back) {
      front = -1;
      back = -1;
      }
      else {
        front++;
      }
    }
  }
  public int size() {
    if (front == -1) {
      return 0;
    }
    else {
    int size = back + 1 - front;
    return size;
    }
  }
  public static void main(String[] args) {
    System.out.println("So Cute!");
    final class Puppy implements Cutie {
      public String description() {
        String desc = "annoying chihuahua";
        return desc;
      }
      public Integer cutenessRating() {
        Integer cuteness = 3;
        return cuteness;
      }
    }
    final class Kitten implements Cutie {
      public String description() {
        String desc = "awww it's a kitten";
        return desc;
      }
      public Integer cutenessRating() {
        Integer cuteness = 10;
        return cuteness;
      }
    }
    final class Hamster implements Cutie {
      public String description() {
        String desc = "Poops everywhere but still cute";
        return desc;
      }
      public Integer cutenessRating() {
        Integer cuteness = 7;
        return cuteness;
      }
    }
    final class Pigeon implements Cutie {
      public String description() {
        String desc = "Poops everywhere and goofy looking";
        return desc;
      }
      public Integer cutenessRating() {
        Integer cuteness = 1;
        return cuteness;
      }
    }
    QueueTees queue = new QueueTees();
    Puppy puppy = new Puppy();
    Kitten kitten = new Kitten();
    Hamster hamster = new Hamster();
    Pigeon pigeon = new Pigeon();
    queue.EnQueue(puppy);
    queue.EnQueue(kitten);
    queue.EnQueue(hamster);
    queue.EnQueue(pigeon);
    System.out.println(queue.size());
    for (int i = 0; i < 4; i++) {
    queue.deQueue();
    System.out.println(queue.size());
    }
  }
}
