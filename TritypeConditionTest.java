package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.*;

/*
针对的决策点是Triang方法中的：
if (Side1+Side2 <= Side3 || Side2+Side3 <= Side1 || Side1+Side3 <= Side2)
    triOut = 4;
else
    triOut = 1;

* */

public class TritypeConditionTest {
    // 测试条件: Side1+Side2 <= Side3
    @Test
    public void testCondition1() {
        assertEquals(4, Tritype.Triang(1, 1, 3));
    }

    // 测试条件: Side2+Side3 <= Side1
    @Test
    public void testCondition2() {
        assertEquals(4, Tritype.Triang(3, 1, 1));
    }

    // 测试条件: Side1+Side3 <= Side2
    @Test
    public void testCondition3() {
        assertEquals(4, Tritype.Triang(1, 3, 1));
    }
}
