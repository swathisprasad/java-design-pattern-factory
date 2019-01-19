package com.swathisprasad.factorypattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcretePersonA implements Person {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcretePersonA.class);

    public void run() {
        LOGGER.info("{} running", ConcretePersonA.class.getSimpleName());
    }
}
