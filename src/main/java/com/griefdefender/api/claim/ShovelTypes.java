/*
 * This file is part of GriefDefenderAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) bloodmc
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.griefdefender.api.claim;

import com.griefdefender.api.util.generator.DummyObjectProvider;

public final class ShovelTypes {

    /**
     * Represents a shovel type that supports creating {@link ClaimTypes#ADMIN} claims.
     */
    public static final ShovelType ADMIN = DummyObjectProvider.createFor(ShovelType.class, "ADMIN");

    /**
     * Represents a shovel type that supports creating {@link ClaimTypes#BASIC} claims.
     */
    public static final ShovelType BASIC = DummyObjectProvider.createFor(ShovelType.class, "BASIC");

    /**
     * Represents a shovel type that supports creating {@link ClaimTypes#SUBDIVISION} claims.
     */
    public static final ShovelType SUBDIVISION = DummyObjectProvider.createFor(ShovelType.class, "SUBDIVISION");

    /**
     * Represents a shovel type that supports creating {@link ClaimTypes#TOWN} claims.
     */
    public static final ShovelType TOWN = DummyObjectProvider.createFor(ShovelType.class, "TOWN");

    /**
     * Represents a shovel type that supports restoring claims.
     */
    public static final ShovelType RESTORE = DummyObjectProvider.createFor(ShovelType.class, "RESTORE");

    // Suppress default constructor to ensure non-instantiability.
    private ShovelTypes() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }
}
