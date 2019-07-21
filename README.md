# Activity Lifecycle & Tracing Lifecycle Events with Logcat.

## Introduction

The purpose of this is app to show lifecycle events of the activity and i have trace it down in the logcat command-line tool window using LogCat syntax with each event.

## Activity Lifecycle.

Here are the main states that an activity can be in, Activity States :-

* Resumed  : top of the stack, visible & interactive.
* Paused   : can be visible but without focus.
* Stopped  : not visible.
* Inactive : completely removed from the activity stack.

Here are the different states that the activity can be in, As an activity enters each state, a callback method will be called by the framework and in this area when can add cutsomization and the behavior of our application. 

![](activitylifecycle_tasks_backstacks_github.jpg)

## Trace Lifecycle event with Logcat.

There are seven methods that manage the life cycle of an Android application :

* onCreate()
* onStart()
* onResume()
* onRestart()
* onPause()
* onStop()
* onDestroy()

We can trace them all with the Logcat info syntax : 
`Log.i(TRACE_EVENTS,"onResume");
`
## Getting Started.

1. Download the code.
2. Open Code in Android Studio.
2. Run the app on emulator.
3. Open Logcat command line tool window.

# Thank You. 
