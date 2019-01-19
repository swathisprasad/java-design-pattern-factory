package com.swathisprasad.factorypattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcretePersonB implements Person {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcretePersonB.class);

    public void run() {
        LOGGER.info("{} running", ConcretePersonB.class.getSimpleName());
    }
}
