package com.kodilla.stream.beautifer;

public class PoemBeautifier {
    public String beautify(String string, PoemDecorator poemDecorator){
        String decoration = poemDecorator.decorate(string);
        return decoration;
    }
}
