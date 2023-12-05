package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class TritypeLineBranchTest {

    @Test
    public void testScalene() {
        assertEquals(1, Tritype.Triang(2, 3, 4));
    }

    @Test
    public void testIsosceles() {
        assertEquals(2, Tritype.Triang(2, 2, 3));
    }

    @Test
    public void testEquilateral() {
        assertEquals(3, Tritype.Triang(2, 2, 2));
    }

    @Test
    public void testInvalidTriangle() {
        assertEquals(4, Tritype.Triang(0, 2, 3));
        assertEquals(4, Tritype.Triang(2, 3, 5));
    }

    @Test
    public void testNegativeSides() {
        assertEquals(4, Tritype.Triang(-1, 2, 2));
    }

    @Test
    public void testZeroSides() {
        assertEquals(4, Tritype.Triang(0, 0, 0));
    }

    @Test
    public void testIsoscelesWithFirstAndThirdSideEqual() {
        assertEquals(2, Tritype.Triang(3, 2, 3));
    }

    @Test
    public void testIsoscelesWithSecondAndThirdSideEqual() {
        assertEquals(2, Tritype.Triang(2, 3, 3));
    }

    @Test
    public void testInvalidByInequality() {
        // This test case ensures that the sides do not satisfy the triangle inequality theorem
        // (the sum of the lengths of any two sides must be greater than the length of the remaining side)
        assertEquals(4, Tritype.Triang(1, 2, 4));
        assertEquals(3, Tritype.Triang(2 ,2 ,2));
    }
    // Add more tests if needed to cover all branches and lines
}
