# Edacy-cours
## Lesson 1 
1. Setup Android project with kotlin support
2. Add Android Navigation Arch Component dependencies
```groovy
dependencies {
  def nav_version = "2.1.0"
  
  implementation "androidx.navigation:navigation-fragment-ktx:$nav_version"
  implementation "androidx.navigation:navigation-ui-ktx:$nav_version"

  //...others dependencies
}
```
3. Add Safe args support
```groovy
buildscript {
    repositories {
        google()
    }
    dependencies {
        def nav_version = "2.1.0"
        classpath "androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version"
    }
}
```
To generate Kotlin code suitable for Kotlin-only modules,  add this line to your app or module's build.gradle file:
```groovy
apply plugin: "androidx.navigation.safeargs.kotlin"
```
4. the rest during the course...