package net.marco27.kotlin.helloworld

import kotlin.test.assertEquals
import org.junit.Test

class HelloWorldTest {

    @Test
    fun testGreeting() {
        assertEquals("Hello, world!", getGreeting())
    }
}