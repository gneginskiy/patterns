package structural.adapter;

import org.apache.commons.lang3.RandomStringUtils;

public class Adaptee {
    public String getDataString(){
        return RandomStringUtils.random(10);
    }
}
