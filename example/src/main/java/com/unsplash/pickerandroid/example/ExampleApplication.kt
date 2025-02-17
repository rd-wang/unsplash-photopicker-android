package com.unsplash.pickerandroid.example

import android.app.Application
import com.unsplash.pickerandroid.photopicker.UnsplashPhotoPicker

class ExampleApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        // initializing the picker library
        UnsplashPhotoPicker.init(
            this,
            "Zo5caXMVyK68oY1iglKC7-IOY5YYrSkLogH9HDuzoUw",
            "LmlEgLGANjK-e33K1R4Z6SOnYTN8dXMQxXFwXMwZZsc"
            /* optional page size (number of photos per page) */
        )
            /* .setLoggingEnabled(true) // if you want to see the http requests */
    }
}
