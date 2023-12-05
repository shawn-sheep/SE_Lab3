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


public class TritypeMCDCTest {
    // 测试修改条件/决策覆盖
    @Test
    public void testMCDC() {
        assertEquals(4, Tritype.Triang(1, 1, 3));  // 仅第一个条件为真
        assertEquals(4, Tritype.Triang(1, 3, 1));  // 仅第二个条件为真
        assertEquals(4, Tritype.Triang(3, 1, 1));  // 仅第三个条件为真
        assertEquals(2, Tritype.Triang(2, 2, 3));  // 所有条件为假
    }
}
