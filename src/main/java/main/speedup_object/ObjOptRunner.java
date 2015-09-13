package main.speedup_object;
import javassist.gluonj.util.Loader;
import main.native_call.NativeEvaluator;

public class ObjOptRunner {
    public static void main(String[] args) throws Throwable {
        Loader.run(ObjOptInterpreter.class, args, ObjOptimizer.class,
                                                  NativeEvaluator.class);
    }
}
