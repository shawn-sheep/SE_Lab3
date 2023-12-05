package com.example.tritypejunittest;

import org.junit.Test;
import static org.junit.Assert.*;

/*
针对的决策点是Triang方法中的：
if (Side1+Side2 <= Side3 || Side2+Side3 <= Side1 || Side1+Side3 <= Side2)
    triOut = 4;
else
    triOut = 1;

* */

public class TritypeDecisionTest {
    // 测试整个决策
    @Test
    public void testDecision() {
        assertEquals(4, Tritype.Triang(1, 2, 4));  // 不合法三角形
        assertEquals(1, Tritype.Triang(3, 4, 5));  // 合法三角形
    }
}
