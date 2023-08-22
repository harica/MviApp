package com.example.mviapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform