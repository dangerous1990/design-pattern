package org.dangerous.pattern.structure.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/13.
 */
public abstract class Subject {
    List<Observer> observerList = new ArrayList<>();

    public List<Observer> getObserverList() {
        return observerList;
    }

    public void setObserverList(List<Observer> observerList) {
        this.observerList = observerList;
    }

    public void addListener(Observer observer) {
        observerList.add(observer);
    }

    public void removeListener(Observer observer) {
        observerList.remove(observer);
    }


    public abstract void update();


    protected void notifyAllListener() {
        for (Observer ob : observerList) {
            ob.update();
        }
    }

}
