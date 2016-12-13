package org.dangerous.pattern.build.prototype;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2016/12/13.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //浅复制
        Product p = new Product();
        p.setName("product A");
        List<String> properties = new ArrayList<>();
        properties.add("p1");
        properties.add("p2");
        properties.add("p3");
        p.setProperties(properties);
        try {
            Product clone = p.clone();
            System.out.println(clone.getName());
            System.out.println("是否是一个对象");
            System.out.println(p == clone);
            System.out.println("不同的hashcode");
            System.out.println(p);
            System.out.println(clone);
            //数组类型不能实现复制
            System.out.println(properties == clone.getProperties());
            //修改p对象properties clone对象跟着变化
            properties.remove("p1");
            for (String name : clone.getProperties()) {
                System.out.println(name);
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //深复制 deep clone
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(p);
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        try {
            Product deepClone = (Product) ois.readObject();
            System.out.println(properties == deepClone.getProperties());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}

