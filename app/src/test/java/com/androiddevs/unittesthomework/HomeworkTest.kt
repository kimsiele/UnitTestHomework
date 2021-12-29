package com.androiddevs.unittesthomework

import com.google.common.truth.Truth.assertThat
import junit.framework.TestCase

class HomeworkTest : TestCase() {

    fun testFib() {
        val number = Homework.fib(3)
        assertThat(number).isEqualTo(2)
    }


    fun testCheckBraces() {
        val result = Homework.checkBraces("(2*4))")
        assertThat(result).isFalse()
    }
}