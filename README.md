# Tasty Bite - Delicious Food Ordering App

**Current Status:** 85%.

Welcome to Tasty Bite, a delightful food ordering application developed using Java for Android. Tasty Bite allows users to browse a variety of delicious dishes, add them to the cart, manage favorites, and seamlessly place orders through web services. The application follows the MVVM design pattern to ensure a clean and maintainable codebase.

## Libraries Used

### 1. Android Lifecycle ViewModel (Version 2.5.1)
   - Utilized for managing UI-related data in a lifecycle-conscious way.
   - Enables efficient communication between the UI and underlying business logic.

```gradle
implementation "androidx.lifecycle:lifecycle-viewmodel:2.5.1"
```

### 2. Dagger Hilt (Version 2.44)
   - Employed for dependency injection, enhancing modularity and testability.
   - Simplifies the process of managing dependencies in the Android application.

```gradle
implementation "com.google.dagger:hilt-android:2.44"
annotationProcessor "com.google.dagger:hilt-android-compiler:2.44"
```

### 3. Retrofit (Version 2.6.0)
   - Integrated for efficient and type-safe HTTP requests.
   - Facilitates seamless communication with web services, ensuring smooth data retrieval.

```gradle
implementation "com.squareup.retrofit2:retrofit:2.6.0"
implementation "com.squareup.retrofit2:converter-gson:2.5.0"
```

### 4. Gson (Version 2.9.0)
   - Used for JSON serialization and deserialization.
   - Ensures smooth conversion between Java objects and JSON representations.

```gradle
implementation "com.google.code.gson:gson:2.9.0"
```

### 5. Glide (Version 4.13.2)
   - Employed for efficient image loading and caching.
   - Enhances the user experience by providing smooth image loading in the app.

```gradle
implementation "com.github.bumptech.glide:glide:4.13.2"
```

### 6. Lottie (Version 3.4.0)
   - Integrated for adding delightful and high-quality animations.
   - Enhances the visual appeal of the application, creating a more engaging user experience.

```gradle
implementation "com.airbnb.android:lottie:3.4.0"
```

## Features

- **List Meals:** Browse a variety of mouth-watering dishes through the app.
- **Add to Cart:** Easily add desired meals to the shopping cart for a seamless ordering experience.
- **Remove from Cart:** Remove items from the cart with a simple and intuitive interface.
- **Manage Favorites:** Mark your favorite meals and easily access them for future orders.
- **Place Orders:** Effortlessly place orders through web services, ensuring a smooth transaction.

## How to Use

1. Clone the repository to your local machine.
2. Open the project in Android Studio.
3. Build and run the application on your Android device or emulator.

Feel free to explore the codebase and customize it according to your needs.

**Note:** Make sure to check the documentation for any additional setup or configuration steps.

## Contributing
If you would like to contribute to the development of this project, please follow the standard procedures for pull requests and issue reporting.

If you have any questions or suggestions, feel free to [open an issue](https://github.com/mustafakbaser/TastyBite-App/issues). I appreciate your feedback!
