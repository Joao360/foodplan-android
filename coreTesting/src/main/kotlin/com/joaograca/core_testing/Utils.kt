package com.joaograca.core_testing

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain

@OptIn(ExperimentalCoroutinesApi::class)
suspend fun withDispatcher(
    testDispatcher: TestDispatcher,
    block: suspend () -> Unit
) {
    Dispatchers.setMain(testDispatcher)

    try {
        block()
    } finally {
        Dispatchers.resetMain()
    }
}