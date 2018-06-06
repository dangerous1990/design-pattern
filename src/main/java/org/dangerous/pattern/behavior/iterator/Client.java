package org.dangerous.pattern.behavior.iterator;

/**
 * 迭代器模式
 * Created by Administrator on 2016/12/20.
 */
public class Client {
    public static void main(String[] args) {
        Container namesRepository = new NameRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}
