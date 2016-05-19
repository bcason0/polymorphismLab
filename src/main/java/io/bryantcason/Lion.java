package io.bryantcason;

/**
 * Created by bryantcason on 5/18/16.
 */
public class Lion extends Pet {

    public Lion(String name){
        super(name);
    }

    @Override
    public String speak(){
        return "Rawr!";
    }
}
