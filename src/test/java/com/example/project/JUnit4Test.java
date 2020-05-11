/*
 * Copyright 2015-2016 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */

package com.example.project;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class JUnit4Test {

    @Test
    public void testMul() {
        assertEquals(6, new Calculator().mul(2, 3));
    }

    @Test
    public void testDiv() {
        assertEquals(3, new Calculator().div(18, 6));
    }

    @Test
    public void testAdd() {
        assertEquals(6, new Calculator().add(2, 4));
    }

    @Test
    public void systemTest() {
        Calculator cal = new Calculator();
        assertEquals(9, cal.mul(cal.add(4, -1), 3));
    }
}
