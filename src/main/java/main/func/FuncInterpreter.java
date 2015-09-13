package main.func;
import stone.FuncParser;
import stone.ParseException;
import main.eval.BasicInterpreter;

public class FuncInterpreter extends BasicInterpreter {
    public static void main(String[] args) throws ParseException {
        run(new FuncParser(), new NestedEnv());
    }
}
