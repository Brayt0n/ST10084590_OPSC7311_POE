# ST10084590_OPSC7311_POE
This repository contains all relative source code as well as documentation relating to my OPSC7311 final POE.

==============================================================================================================
	                                             Meal Matrix		
==============================================================================================================

Thank you for installing the Meal Matrix health and fitness mobile app. This Readme file contains everything you need to get going.

== Minimum Sepcifications Needed ==

 For running on your device:

 * Android 10 or higher
 * 6gb RAM
 * 50MB storage available
 * Octa core or any similar processor
 
 For running on windows:

 * Windows 10 or higher
 * Ryzen 5 or any higher equivalent processor
 * Minimum 12gb
 * Minimum 1gb storage

== Installation  ==

 1) If you do not have Android Studio installed, please use the following link to download the 
    software: https://developer.android.com/studio?gclid=CjwKCAjw1YCkBhAOEiwA5aN4AQ9a_mVoW16gFA1H14bx4sWRDmNv4mIRjywCUwuGUZ9XMLuKXbs52hoC41MQAvD_BwE&gclsrc=aw.ds
 2) If you do have Android Studio installed, extract the MealMatrix folder from the zip folder.
 3) Paste the MealMatrix folder in your local AndroidStudioProjects folder
 4) Open Android Studio and run the folder with your emulator or paired device.

== How to Use ==
  
 1) After installing the project and running it on your emulator or paired device, you will be prompted to login. 
 2) Login with your credentials, however if you are a new user do the following
 	2.1) If you do not have an account, press the red Register tag to proceed to the register screen.
 	2.2) Enter your email and desired password, then confirm your password. You will then be directed to the login screen.
 	2.3) Login with your credentials
 3) You will then be directed to the main screen, from here you can access all the app's features via the hamburger.
 4) To use the Stopwatch:
 	4.1) Acesss the stopwatch from the hamburger.
        4.2) Press the start button to start the timer. You can optionally add laps, these laps will tabulate a graph.
        4.3) To stop the timer simply press stop.
 5) To use the Food Logger Feature:
        5.1) Access the Food Logger from the menu
        5.2) Enter the name of your meal.
        5.3) Select the mealtime.
        5.4) Take an image of your meal via the camera button.
        5.5) Your image with its name have now been saved.
        5.6) You can click the view list button to search for your food images.
        5.7) Once you have clicked the view list button, and have been directed to the next page, please enter the name of your
             food to search.
        5.8) Click search.
        5.9) Your food image will now be displayed on the screen.
 6.1) To use the Workout Tracker feature
        6.1.1) Access the workout feature from the menu
        6.1.2) Enter the name of your workout.
        6.1.3) Select the start date of your workout.
        6.1.4) Select the end date of your workout.
        6.1.5) Select the start time of your workout.
        6.1.6) Select the end time of your workout.
        6.1.7) Select the category of your workout.
        6.1.8) Enter the description of your workout.
        6.1.9) Press the track button.
        6.1.10) Your data will now be populated to a list.
        6.1.11) To access this list, click the view list button.
        6.1.12) You will then be taken to a screen that displays all your data.
 6.2) To use the goal tracker feature:
       6.2.1) Within the Workout Tracker feature, click the goal button next to the end time button.
       6.2.2) Enter your minimum goal.
       6.2.3) Enter your maximum goal.
       6.2.4) Enter the hours you actually worked out for.
       6.2.5) Select the date of your goal.
       6.2.6) Press the track button.
       6.2.7) Your goals will now be saved to a list.
       6.2.8) To access the list, simply click the view list button. 
       6.2.9) You will then be taken to the screen that displays all your goals.
       6.2.9) You can also view your current progress on working between your minimum and maximum goals, you
              simply have to click the view progress button and a dialog prompting you on your current performance will 
              appear.
       6.2.10) You can also view a graph displaying your Minimum, Maximum and Actual workout hours. To do this, click on the
              view graph button. The application will then direct you to a screen where you must select the date of your goal
 7) To logout simply access the option from the menu and select the logout option.

== Added Features ==

   <-- Welcome Message -->
       When the user logs in, they will be prompted by a notification that appears at the top of their mobile notification bar, irrespective
       of their actual phone. This notification will have a brief welcome back message that is interactable. If the user clicks on the notification,
       they will be directed to the Workout Tracker.
 
   <-- Food Tokens>
       The gamification feature of Food Tokens mentioned in Part 1 of the POE was implemented. The user can earn three Food Tokens by completing certain secret
       activities. For the sake of clarification, these activities include meeting your maximum goals, entering "Apple" as a meal and finally, selecting "Running"
       as a workout type.

   <-- Food Search -->
       Food Search was added to the Food Logger featur. In this feature, the user can search for the food image that they took according to the name that they entered.

== Default Login == 

   Email: bray@gmail.com
   Password: Witcher123

== Troubleshooting ==

   If the app crashes on launch, please do the following:
   1) Please rebuild the program then run it.
   2) Sometimes, .NoActionBar gets deleted, therefore paste it at the end of line 14 of the android manifest.
   
== FAQ's ==

 Q: Can I download the app of the Play Store?
 A: No, at the momemnt the Meal Matrix app is not published on the Google Play Store.
 
 Q: How do I earn Food Tokens?
 A: There are three hidden Food Tokens that can be unlocked by performing secret actions.
 
 Q: What is the purpose of the app?
 A: Meal Matrix was created for the purpose of tracking people's fitness goals, and allows them to clearly track their progress.

 Q: How do I take a picture of my meals?
 A: You simply have to click the camera button in the Food Logger feature and then click the save button to save your image.

 Q: How does the food search feature work?
 A: You simply have to enter the name of your food that you captured using your camera, and then click search to display your captured
    image.

 Q: Has the user interface improved with this update?
 A: Yes, various user interface improvements were made to improve the overall usability of the application.

== Plugins used ==

 1) GitHub Chart resources: com.github.Philjay:MPAndroidChart:v3.0.3
 2) GitHub GIF glide: com.github.bumptech.glide:glide:4.11.0

== GitHub Repository Link ==

 https://github.com/Brayt0n/ST10084590_OPSC7311_POE.git

== Author Information ==

 Author Name: Brayton 
 Author Surname: Chetty
 Business Address: 1 Link Road St James Avenue, Westvile, Durban, 3630

 If you encounter any bugs while running the app please contact me on Outlook via my business email: ST10084590@vcconnect.edu.za

== Reference List ==

 1. Play GIF in android app 2022 | android studio | kotlin. 2022. YouTube video, added by Picker Soft. [Online]. Available at:
    https://www.youtube.com/watch?v=cGIaRC7j1iw [Accessed 1 June 2023].
 2. How to create a Custom Toast Message in Android Studio (Kotlin 2020). 2020. YouTube video, added by Identity. [Online]. Available at:
    https://www.youtube.com/watch?v=DAWmKXOqSyo&t=10s [Accessed 7 June 2023].
 3. Color Psychology & How it Affects Your Fitness Center. 2023. [Image]. Available at: 
    https://images.squarespace-cdn.com/content/v1/5ada11772714e5eb213ab1df/1598971615118-52I7A8XS2KXHXGXII3YI/Color-Psychology-01-compressed.jpg
    [Accessed 3 June 2023].
 4. Firebase Data to RecyclerView using Kotlin | Retrieve Firebase data into RecyclerView | Kotlin |. 2021. YouTube video, added by Foxandroid. [Online].
    Available at: https://www.youtube.com/watch?v=VVXKVFyYQdQ [Accessed 28 June 2023].
 5. How to get child of child value from firebase in android || Retrieving data from firebase. 2021. YouTube video, added by Mano Omogha. [Online]. Available at:
    https://www.youtube.com/watch?v=KRtLZF-xlAs [Accessed 30 June 2023].
 6. How to Retrieve Data from Firebase Database using Kotlin | Realtime Database | Kotlin. 2021. YouTube video, added by Foxandroid. [Online]. Available at: 
    https://www.youtube.com/watch?v=EMM_3Wld2jU&t=532s [Accessed 4 July 2023].
 7. Retrieve Image from Firebase Storage using Kotlin || Android Studio Tutorial || Kotlin. 2021. YouTube video, added by Foxandroid. [Online]. Available at: 
    https://www.youtube.com/watch?v=A2-v2VFwLY0&t=621s [Accessed 6 July 2023].
 8. TextInputEditText - Material Design Edit Text | Android Studio Tutorial. 2021. YouTube video, added by Stevdza-San. [Online]. Available at: 
    https://www.youtube.com/watch?v=IxhIa3eZxz8
