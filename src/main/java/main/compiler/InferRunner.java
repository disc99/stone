package main.compiler;

import javassist.gluonj.util.Loader;
import main.native_call.NativeEvaluator;

public class InferRunner {
	public static void main(String[] args) throws Throwable {
		Loader.run(TypedInterpreter.class, args, InferFuncTypes.class, NativeEvaluator.class);
	}
}
