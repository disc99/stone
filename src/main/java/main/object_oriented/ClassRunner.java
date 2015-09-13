package main.object_oriented;
import javassist.gluonj.util.Loader;
import main.func.ClosureEvaluator;
import main.native_call.NativeEvaluator;

public class ClassRunner {
    public static void main(String[] args) throws Throwable {
        Loader.run(ClassInterpreter.class, args, ClassEvaluator.class,
                   NativeEvaluator.class, ClosureEvaluator.class);
    }
}
