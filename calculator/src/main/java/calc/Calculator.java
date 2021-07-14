package calc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
    private static final Logger logger = LoggerFactory.getLogger(Calculator.class);

    public static long calculate(int elem1, int elem2, String operation){

        logger.debug("Input: elem1 = {}\telem2 = {}\toperation - {}", elem1, elem2, operation);

        if(operation.equals("plus"))
            return elem1 + elem2;

        else return elem1 - elem2;
    }
}
