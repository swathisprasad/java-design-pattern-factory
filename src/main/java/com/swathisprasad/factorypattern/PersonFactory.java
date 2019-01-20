package com.swathisprasad.factorypattern;

public class PersonFactory {

    public static Person getPerson(String type)
    {
        if ("BaseRun".equals(type)) {
            return new ConcretePersonA();
        }
        else if ("LongRun".equals(type) ) {
            return new ConcretePersonB();
        }
        else if ("ProgressionRun".equals(type) ) {
            return new ConcretePersonC();
        }
        return null;
    }
}
