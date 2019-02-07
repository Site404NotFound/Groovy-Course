#! /usr/bin/env groovy
Closure log = {
  String type, Date createdOn, String msg ->
    println("$createdOn [$type] - $msg")
}

log("DEBUG", new Date(), "This is my first debug statement...")

Closure debugLog = log.curry("DEBUG")
debugLog(new Date(), "This is another debug statement...")
debugLog(new Date(), "This is one more...")


Closure todayDebugLog = log.curry("DEBUG", new Date())
todayDebugLog("This is today's debug message...")


// Right curry
Closure crazyPersonLog = log.rcurry("Why am I logging this way?")
crazyPersonLog("ERROR", new Date())

Closure typeMsgLog = log.ncurry(1, new Date())
typeMsgLog("ERROR", "This is using ncurry...")
