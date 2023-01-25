package com.example.dependencyinjectionstart.example2.data.network

import android.util.Log

class ExampleApiService {
    fun method() {
        Log.d(LOG_TAG, "ExampleApiService")
    }

    companion object {
        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}