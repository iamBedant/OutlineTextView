# OutlineTextView
Android TextView with Outline/Stroke

[![](https://jitpack.io/v/iamBedant/OutlineTextView.svg)](https://jitpack.io/#iamBedant/OutlineTextView)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](https://github.com/iamBedant/OutlineTextView/blob/master/LICENSE)

## Example
<img src="sc/s1.png" alt="Example 1" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="sc/s2.png" alt="Example 2" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

## Quick Setup
### 1. Include library

**Using Gradle**

OutlineTextView is currently available in on Jitpack so add the following line before every other thing if you have not done that already.

```gradle
allprojects {
  repositories {
    maven { url 'https://jitpack.io' }
  }
}
```
	
Then add the following line 

``` gradle
dependencies {
     implementation 'com.github.iamBedant:OutlineTextView:1.0.3'
}
```

**Using Maven**

Also add the following lines before adding the maven dependency

```maven
<repositories>
	<repository>
		   <id>jitpack.io</id>
		   <url>https://jitpack.io</url>
	</repository>
</repositories>
```
Then add the dependency

``` maven
<dependency>
	    <groupId>com.github.iamBedant</groupId>
	    <artifactId>OutlineTextView</artifactId>
	    <version>1.0.3</version>
</dependency>
```

**Example**

```xml
<com.iambedant.text.OutlineTextView
  android:id="@+id/imageView23"
  android:layout_width="wrap_content"
  android:layout_height="wrap_content"
  android:text="2"
  android:textColor="@android:color/white"
  android:textSize="36sp"
  app:outlineColor="#53D1A1"
  app:outlineWidth="0.7" />
```

