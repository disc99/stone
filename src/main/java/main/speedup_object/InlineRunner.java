package main.speedup_object;
import javassist.gluonj.util.Loader;
import main.native_call.NativeEvaluator;

public class InlineRunner {
    public static void main(String[] args) throws Throwable {
        Loader.run(ObjOptInterpreter.class, args, InlineCache.class,
                                                  NativeEvaluator.class);
    }
}
