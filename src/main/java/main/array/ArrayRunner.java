package main.array;
import javassist.gluonj.util.Loader;
import main.func.ClosureEvaluator;
import main.native_call.NativeEvaluator;
import main.object_oriented.ClassEvaluator;
import main.object_oriented.ClassInterpreter;

public class ArrayRunner {
    public static void main(String[] args) throws Throwable {
        Loader.run(ClassInterpreter.class, args, ClassEvaluator.class,
                   ArrayEvaluator.class, NativeEvaluator.class,
                   ClosureEvaluator.class);
    }
}
