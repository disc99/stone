package main.speedup_object;
import main.native_call.Natives;
import main.speedup_var.EnvOptInterpreter;
import main.speedup_var.ResizableArrayEnv;
import stone.ClassParser;
import stone.ParseException;

public class ObjOptInterpreter extends EnvOptInterpreter {
    public static void main(String[] args) throws ParseException {
        run(new ClassParser(),
            new Natives().environment(new ResizableArrayEnv()));
    }
}
