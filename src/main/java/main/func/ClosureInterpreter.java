package main.func;
import stone.ClosureParser;
import stone.ParseException;
import main.eval.BasicInterpreter;

public class ClosureInterpreter extends BasicInterpreter{
    public static void main(String[] args) throws ParseException {
        run(new ClosureParser(), new NestedEnv());
    }
}
