package demo.nec.shared;


import org.apache.logging.log4j.LogManager;

import java.util.logging.Logger;

public class Logimp {


   // private static final Logger logger = (Logger) LogManager.getLogger(Logimp.class);

    static Logger logger = Logger.getLogger(Logimp.class.getName());

    public static void main(String[] args) {
        logger.info("This is an info message.");
        logger.warning("This is a debug message.");
        //logger.error("This is an error message.");
    }
}
