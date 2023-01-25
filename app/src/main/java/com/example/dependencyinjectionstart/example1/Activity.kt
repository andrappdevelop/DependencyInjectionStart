package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {

    @Inject
    lateinit var keyboard: Keyboard

    @Inject
    lateinit var mouse: Mouse

    @Inject
    lateinit var monitor: Monitor

    val component = DaggerNewComponent.create()
//    val keyboard: Keyboard = component.getKeyboard()
//    val mouse: Mouse = component.getMouse()
//    val monitor: Monitor = component.getMonitor()

    init {
        component.inject(this)
    }

}