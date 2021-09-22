package org.example.testing

import org.junit.jupiter.api.{Assertions, Test}

class RepeatRemoverScalaTest {

  def subj = new RepeatRemover()

  @Test
  def test_instance_call(): Unit = {
    Assertions.assertEquals("ABC", subj.remove("AABCC"))
  }

  @Test
  def test_static_call(): Unit ={
    Assertions.assertEquals("ABC", RepeatRemover.staticRemove("AABCC"))
  }

}