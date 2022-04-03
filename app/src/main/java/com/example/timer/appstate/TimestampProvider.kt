package com.example.timer.appstate

interface TimestampProvider {
    fun getMilliseconds(): Long
}