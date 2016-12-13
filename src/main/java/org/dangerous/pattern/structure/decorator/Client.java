package org.dangerous.pattern.structure.decorator;

/**
 * Created by Administrator on 2016/12/13.
 */
public class Client {

    public static void main(String[] args) {
        /**
         * 大饼夹一切，普通大饼+生菜+咸菜
         */
        Pancake simplePancake = new SimplePancake();
        Pancake lettuce = new Lettuce(simplePancake);
        Pancake pickles = new Pickles(lettuce);
        System.out.println(pickles.getName());
        System.out.println(pickles.getPrice());


    }
}
