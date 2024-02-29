package Sem_5_HW;

import java.util.Random;

public class Philosopher extends Thread{
    private final int id;
    private final Object leftFork;
    private final Object rightFork;
    private int mealEaten = 0;

    private Random rnd = new Random();


    public Philosopher(int id, Object leftFork, Object rightFork) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    private void think() throws InterruptedException {
        System.out.printf("Philosopher %s is thinking \n", id);
        try {
            Thread.sleep(rnd.nextInt(1000, 2000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    private void eat() throws InterruptedException {
        synchronized (leftFork){
            synchronized (rightFork){
                System.out.printf("Philosopher %s is eating \n", id);
                mealEaten++;
                Thread.sleep(rnd.nextInt(1000, 2000));
            }
        }
    }

    public int getMealEaten() {
        return mealEaten;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                think();
                eat();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
