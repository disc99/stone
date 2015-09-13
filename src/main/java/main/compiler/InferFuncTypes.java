package main.compiler;
import java.util.List;
import stone.ast.ASTree;
import javassist.gluonj.Require;
import javassist.gluonj.Reviser;

@Require({TypeChecker.class, InferTypes.class})
@Reviser public class InferFuncTypes {
    @Reviser public static class DefStmntEx3 extends TypeChecker.DefStmntEx2 {
        public DefStmntEx3(List<ASTree> c) { super(c); }
        @Override public TypeInfo typeCheck(TypeEnv tenv) throws TypeException {
            TypeInfo.FunctionType func = super.typeCheck(tenv).toFunctionType();
            for (TypeInfo t: func.parameterTypes)
                fixUnknown(t);
            fixUnknown(func.returnType);
            return func;
        }
        protected void fixUnknown(TypeInfo t) {
            if (t.isUnknownType()) {
                TypeInfo.UnknownType ut = t.toUnknownType();
                if (!((InferTypes.UnknownTypeEx)ut).resolved())
                    ((InferTypes.UnknownTypeEx)ut).setType(TypeInfo.ANY);
            }
        }
    }
}
