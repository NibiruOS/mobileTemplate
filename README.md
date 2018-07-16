# Nibiru Mobile Template
This is a template for empty [Nibiru Mobile](../../../mobile) project creation.

## Prerequisites
 * [Java SE Development Kit](http://www.oracle.com/technetwork/java/javase/downloads/) (tested on Java 8)
 * [Gradle](https://gradle.org/)
 * [Android Studio](https://developer.android.com/studio/)
 * [Multi-OS Engine Plugin](https://multi-os-engine.org/start/) (Only if oyu want to run it on iOS)

## QuickStart
Just clone the repo and run:
```
gradle cleanArch generate -i
```
The built project will be found into `generated` directory. You can start Android Studio and open the `build.gradle` located at such directory. Choose "Open as project" when prompted, wait unltil the project is synchronized and run it.

For more info regarding template generation options, please refer to [gradle-archetype-plugin](https://github.com/orctom/gradle-archetype-plugin).
