package org.dangerous.pattern.behavior.memento;

/**
 * Created by Administrator on 2016/12/28.
 */
public class Client {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();
        originator.setState("state0");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("state1");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("state2");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
