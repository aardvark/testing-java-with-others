package org.example.testing

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RepeatRemoverGroovyTest {

    private RepeatRemover subj = new RepeatRemover()

    @Test
    void remove() {
        Assertions.assertEquals("ABC", subj.remove("AABCC"))
    }

    @Test
    void staticRemove() {
        Assertions.assertEquals("ABC", RepeatRemover.staticRemove("AABCC"))
    }
}
