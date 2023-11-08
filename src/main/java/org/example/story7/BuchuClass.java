package org.example.story7;

/**
 * Reflection 사용하기 위한 demo class
 */
public class BuchuClass {
    // 접근 제어자가 다른 fields
    private String privateField;
    String defaultField;
    protected String protectedField;
    public String publicField;

    // constructor
    public BuchuClass() {}
    public BuchuClass(String arg) {}

    // methods
    public void publicMethod() {}
    public String publicMethod(String s, int i) {
        return "s: " + s + ", i: " + i;
    }
    protected void protectedMethod() {}
    void method() {}
    private void privateMethod() {}
    public InnerClass getInnerClass() {
        return new InnerClass();
    }
    public static class InnerClass {}
}
