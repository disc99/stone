package main.object_oriented;

import main.eval.BasicInterpreter;
import main.func.NestedEnv;
import main.native_call.Natives;
import stone.ClassParser;
import stone.ParseException;

public class ClassInterpreter extends BasicInterpreter {
    public static void main(String[] args) throws ParseException {
        run(new ClassParser(), new Natives().environment(new NestedEnv()));
    }
}
