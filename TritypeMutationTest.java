package com.example.tritypejunittest;

import org.junit.Test;
import static org.junit.Assert.*;

public class TritypeMutationTest {
    // 测试用例，用于杀死 TritypeMutantOne
    @Test
    public void testKillMutantOne() {
        // TritypeMutantOne 错误地将这种情况视为等腰三角形
        assertEquals(1, TritypeMutantOne.Triang(2, 2, 3));
    }

    // 调整后的测试用例，用于杀死 TritypeMutantTwo
    @Test
    public void testKillMutantTwo() {
        // TritypeMutantTwo 可能错误地将这种情况视为合法三角形
        assertEquals(4, TritypeMutantTwo.Triang(1, 1, 2));
    }
}

