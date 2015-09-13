package main.native_call;
import stone.ClosureParser;
import stone.ParseException;
import main.eval.BasicInterpreter;
import main.func.NestedEnv;

public class NativeInterpreter extends BasicInterpreter {
    public static void main(String[] args) throws ParseException {
        run(new ClosureParser(),
            new Natives().environment(new NestedEnv()));
    }
}
