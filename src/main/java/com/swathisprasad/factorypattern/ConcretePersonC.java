package com.swathisprasad.factorypattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcretePersonC implements Person {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcretePersonC.class);

    public void run() {
        LOGGER.info("{} running", ConcretePersonC.class.getSimpleName());
    }
}
