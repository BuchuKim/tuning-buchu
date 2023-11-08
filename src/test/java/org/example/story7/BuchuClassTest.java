package org.example.story7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BuchuClassTest {
    @Test
    @DisplayName("reflection class 테스트")
    public void reflectionClassTest() {
        BuchuClass buchuClass = new BuchuClass();
        Class clazz = BuchuReflection.getClassByReflection(buchuClass);

        BuchuReflection.showClassInfo(clazz);
    }

    @Test
    @DisplayName("reflection field 테스트")
    public void reflectionFieldTest() {
        BuchuClass buchuClass = new BuchuClass();
        Class clazz = BuchuReflection.getClassByReflection(buchuClass);

        BuchuReflection.showFieldInfo(clazz);
    }

    @Test
    @DisplayName("reflection method 테스트")
    public void reflectionMethodTest() {
        BuchuClass buchuClass = new BuchuClass();
        Class clazz = BuchuReflection.getClassByReflection(buchuClass);

        BuchuReflection.showMethodInfo(clazz);
    }
}