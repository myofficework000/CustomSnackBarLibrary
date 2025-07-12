# 🍫 CustomSnackbar Android Library

CustomSnackbar is a lightweight Android library that helps you easily create customizable, beautiful snackbars with flexible styling and interaction. Enhance your app’s user experience with fully themed, reusable snackbars that work seamlessly with Material Design.

---

## ✨ Features

- ✅ Fully customizable UI (background, text, icons, actions)
- ✅ Supports success, error, info, warning types
- ✅ Built-in animations
- ✅ Dark mode compatibility
- ✅ Easy to integrate and use
- ✅ Dismiss callbacks and auto-dismiss options

---

## 📦 Installation

### Gradle (Project-level)
```gradle
allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
```



```gradle
dependencies {
    implementation 'com.yourpackage:customsnackbar:1.0.0'
}
```

## 🎨 Snackbar Types


| Type    | Description                   |
| ------- | ----------------------------- |
| SUCCESS | Green background, check icon  |
| ERROR   | Red background, warning icon  |
| INFO    | Blue background, info icon    |
| WARNING | Yellow background, alert icon |

##  Customization Options

```kotlin
CustomSnackbar.make(view, "Custom Message")
    .setTextColor(Color.WHITE)
    .setBackgroundColor(Color.BLACK)
    .setIcon(R.drawable.ic_custom)
    .setDuration(CustomSnackbar.Duration.LONG)
    .setCornerRadius(16f)
    .show()
```

## 🧩 Roadmap
-  Add swipe-to-dismiss
-  Snackbar queue management
- Jetpack Compose support

## 🙌 Contributing
Contributions are welcome! Please open issues or submit pull requests for bug fixes, features, or improvements.

## 🔗 Connect
GitHub: [github.com/yourusername](https://github.com/myofficework000)
LinkedIn: [linkedin.com/in/yourprofile](https://www.linkedin.com/in/myofficework/)
