package com.swathisprasad.factorypattern;

public class PersonFactory {

    public static Person getPerson(String type)
    {
        if (type.equals("BaseRun") ) {
            return new ConcretePersonA();
        }
        else if (type.equals("LongRun") ) {
            return new ConcretePersonB();
        }
        else if (type.equals("ProgressionRun") ) {
            return new ConcretePersonC();
        }
        return null;
    }
}
