package main.speedup_var;
import javassist.gluonj.util.Loader;
import main.native_call.NativeEvaluator;

public class EnvOptRunner {
    public static void main(String[] args) throws Throwable {
        Loader.run(EnvOptInterpreter.class, args, EnvOptimizer.class,
                                                  NativeEvaluator.class);
    }
}
