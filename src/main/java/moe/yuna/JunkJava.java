package moe.yuna;


import java.util.function.Function;

/**
 * Created by sanairika on 2016/06/19.
 */
public class JunkJava {

    public String junkJava() {
        return "junk java";
    }

    public void junkJava(Runnable func) {
        func.run();
    }

    public String junkJava(Function<String, String> func) {
        return func.apply("java lambda2");
    }

    public static void main(String[] args) {
        Test.INSTANCE.test();
    }
}
