package org.dangerous.pattern.build.prototype;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/12/13.
 */
public class Product implements Cloneable, Serializable {
    @Override
    protected Product clone() throws CloneNotSupportedException {
        return (Product) super.clone();
    }

    private String name;

    public List<String> getProperties() {
        return properties;
    }

    public void setProperties(List<String> properties) {
        this.properties = properties;
    }

    private List<String> properties;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
