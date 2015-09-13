package main.svm;
import main.native_call.Natives;
import main.speedup_var.EnvOptInterpreter;
import stone.FuncParser;
import stone.ParseException;

public class VmInterpreter extends EnvOptInterpreter {
    public static void main(String[] args) throws ParseException {
        run(new FuncParser(),
            new Natives().environment(new StoneVMEnv(100000, 100000, 1000)));
    }
}
