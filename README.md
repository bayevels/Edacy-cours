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

## Lesson 2
1. Add RecyclerView dependencies and Glide for image rendering
```groovy
        // Recycler View
    implementation "androidx.recyclerview:recyclerview:$recyclerview_version"
    // For control over item selection of both touch and mouse driven selection
    implementation "androidx.recyclerview:recyclerview-selection:$recyclerview_version"
    implementation "androidx.cardview:cardview:$cardview_version"

    // Image loading library
    implementation 'com.github.bumptech.glide:glide:4.10.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.10.0'
    implementation 'de.hdodenhof:circleimageview:3.0.1'
```
2. The rest during the course