package main.compiler.java;

import main.speedup_var.ArrayEnv;

public class length {
    public static int m(ArrayEnv env, String s) { return m(s); }
    public static int m(String s) { return s.length(); }
}
