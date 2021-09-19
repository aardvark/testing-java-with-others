package org.example.testing

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RepeatRemoverKtTest {

    private val subj = RepeatRemover()

    @Test
    fun remove() {
        Assertions.assertEquals("ABC", subj.remove("AABCC"))
    }

    @Test
    fun staticRemove() {
        Assertions.assertEquals("ABC", RepeatRemover.staticRemove("AABCC"))
    }
}