package calc;

public class Calculator {

    public static long calculate(int elem1, int elem2, String operation){
        if(operation.equals("plus"))
            return elem1 + elem2;

        else return elem1 - elem2;
    }
}
