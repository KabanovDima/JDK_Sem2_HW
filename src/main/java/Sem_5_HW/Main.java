package Sem_5_HW;

public class Main {
    public static void main(String[] args) {
        int numOfPhilosopher = 5;
        Philosopher[] philosophers = new Philosopher[numOfPhilosopher];
        Object[] forks = new Object[numOfPhilosopher];

        for (int i = 0; i < numOfPhilosopher; i++) {
            forks[i] = new Object();
        }

        for (int i = 0; i < numOfPhilosopher; i++) {
            Object leftFork = forks[i];
            Object rightFork = forks[(i+1) % numOfPhilosopher];
            philosophers[i] = new Philosopher(i+1, leftFork, rightFork);
            philosophers[i].start();
        }


    }

}
