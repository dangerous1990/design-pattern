package org.dangerous.pattern.behavior.memento;

/**
 * Created by Administrator on 2016/12/28.
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
