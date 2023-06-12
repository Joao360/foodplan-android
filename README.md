# Foodplan Android App

Foodplan is a versatile Android app that helps you with all aspects of meal planning and recipe management. 
Whether you want to search for new food recipes, create your own recipes, plan meals for the week, or save your favorite recipes, Foodplan has got you covered.

## Features

### 1. Search Food Recipes

With Foodplan, you can easily discover a wide range of food recipes to satisfy your culinary cravings. 
The app provides a powerful search functionality that allows you to search for recipes based on keywords, ingredients, or specific dietary requirements. 
Whether you're looking for quick and easy recipes, vegetarian dishes, or something more elaborate, Foodplan will help you find the perfect recipe.

### 2. Create Food Recipes

Foodplan enables you to unleash your inner chef by creating your own food recipes. 
The app provides an intuitive recipe editor where you can add ingredients, specify quantities, write detailed instructions, and even attach images to showcase your culinary masterpiece. 
You can save and organize your recipes within the app for easy access whenever you need them.

### 3. Plan Meals for the Week

Planning meals for the week has never been easier with Foodplan. The app offers a meal planning feature that allows you to create a weekly meal schedule. 
You can select recipes from your saved collection or search for new ones to include in your meal plan. 
Foodplan helps you stay organized and ensures that you have a well-balanced and varied diet throughout the week.

### 4. Save Favorite Recipes

Foodplan lets you save your favorite recipes for quick access and future reference. 
Whenever you come across a recipe that you love, simply mark it as a favorite, and it will be added to your personal collection. 
You can easily view and access your favorite recipes whenever you need inspiration for your next meal.

## Getting Started

To get started with Foodplan, follow these steps:

1. Clone the repository:

```bash
git clone https://github.com/your-username/foodplan-android.git
```

2. Open the project in Android Studio.

3. Create an API key from Spoonacular by visiting their [website](https://spoonacular.com/food-api/) and signing up for an account.

4. Add your Spoonacular API key to the `local.properties` file in the project root directory:

   ```
   API_KEY=your-api-key
   ```

   Replace `your-api-key` with the API key you obtained from Spoonacular.

5. Build and run the app on your Android device or emulator.

## Requirements

Foodplan requires Android 5.0 (Lollipop) or higher to run.

## Dependencies

Foodplan utilizes the following libraries and frameworks:

- [Retrofit](https://square.github.io/retrofit/) - HTTP client for API requests.
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library.
- [Room](https://developer.android.com/training/data-storage/room) - Local database for recipe storage.
- [Jetpack Compose](https://developer.android.com/jetpack/compose) - Modern UI toolkit for building native Android apps.
- [Dagger Hilt](https://dagger.dev/hilt/) - Dependency injection framework for Android.

All dependencies are included in the project's `build.gradle` file.

## License

Foodplan is licensed under the [Creative Commons Attribution-NonCommercial (CC BY-NC)](https://creativecommons.org/licenses/by-nc/4.0/) license. 
This means that you are free to modify and distribute the app for non-commercial purposes, as long as you provide attribution to the original creators.
