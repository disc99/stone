package main.svm;
import javassist.gluonj.util.Loader;
import main.native_call.NativeEvaluator;

public class VmRunner {
    public static void main(String[] args) throws Throwable {
        Loader.run(VmInterpreter.class, args, VmEvaluator.class,
                                              NativeEvaluator.class);
    }
}
