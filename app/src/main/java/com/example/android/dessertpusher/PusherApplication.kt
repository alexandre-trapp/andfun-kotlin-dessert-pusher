package com.example.android.dessertpusher

import timber.log.Timber
import android.app.Application

class PusherApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
    }
}