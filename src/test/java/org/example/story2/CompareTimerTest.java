package org.example.story2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareTimerTest {
    @Test
    @DisplayName("System 모듈의 currentTimeMillis(), nanoTime()을 테스트")
    public void milliNanoTest() {
        CompareTimer compareTimer = new CompareTimer();

        for (int i=0; i<10; i++) {
            compareTimer.checkByMillis();
            compareTimer.checkByNanos();
        }

        // 전반적으로 nanoTime()이 더 정확하고 빠름 -> 권장
    }
}