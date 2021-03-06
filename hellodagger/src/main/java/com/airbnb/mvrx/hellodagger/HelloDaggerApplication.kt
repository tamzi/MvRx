package com.airbnb.mvrx.hellodagger

import android.app.Application
import androidx.activity.ComponentActivity
import com.airbnb.mvrx.Mavericks
import com.airbnb.mvrx.hellodagger.di.AppComponent
import com.airbnb.mvrx.hellodagger.di.DaggerAppComponent

class HelloDaggerApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
        Mavericks.initialize(this)
    }
}

fun ComponentActivity.appComponent(): AppComponent {
    return (application as HelloDaggerApplication).appComponent
}
