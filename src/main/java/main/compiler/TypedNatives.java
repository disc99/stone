package main.compiler;

import main.eval.Environment;
import main.native_call.Natives;
import main.speedup_var.EnvOptimizer;

public class TypedNatives extends Natives {
    protected TypeEnv typeEnv;
    public TypedNatives(TypeEnv te) { typeEnv = te; }
    protected void append(Environment env, String name, Class<?> clazz,
                          String methodName, TypeInfo type, Class<?> ... params)
    {
        append(env, name, clazz, methodName, params);
        int index = ((EnvOptimizer.EnvEx2)env).symbols().find(name);
        typeEnv.put(0, index, type);
    }
    protected void appendNatives(Environment env) {
        append(env, "print", main.compiler.java.print.class, "m",
               TypeInfo.function(TypeInfo.INT, TypeInfo.ANY),
               Object.class);
        append(env, "read", main.compiler.java.read.class, "m",
                TypeInfo.function(TypeInfo.STRING));
        append(env, "length", main.compiler.java.length.class, "m",
               TypeInfo.function(TypeInfo.INT, TypeInfo.STRING),
               String.class);
        append(env, "toInt", main.compiler.java.toInt.class, "m",
               TypeInfo.function(TypeInfo.INT, TypeInfo.ANY),
               Object.class);
        append(env, "currentTime", main.compiler.java.currentTime.class, "m",
               TypeInfo.function(TypeInfo.INT)); 
    }
}
