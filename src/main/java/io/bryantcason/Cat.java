package io.bryantcason;

/**
 * Created by bryantcason on 5/18/16.
 */
public class Cat extends Pet {

    public Cat(String name){
        super(name);
    }

    @Override
    public String speak(){
        return "Meow!";
    }

}
