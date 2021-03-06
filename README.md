# RunWithMe (Herd)
A fitness/social-media Android Application in development which aims to provide runners an easy way to locally connect safely and coordinate group-runs. Will leverage Firebase BaaS.

This is a work-in-progress as I learn Kotlin, Firebase, and Jetpack Compose. For more complete examples of my work in Android Studio please see these more simple projects: 

https://github.com/Tyler-Lopez/Firestore-Data-Management-on-Android

https://github.com/Tyler-Lopez/CS-TriviaApp

## Run Broadcast Levels

* Invite-Only Private
  * The run is only shared with invited friends.
* Friends Private
  * The run is automatically shared with all friends, but is not broadcasted publicly.
* Gender-Specific Friends Private
  * The run is automatically shared with all friends of your gender, but is not broadcasted publicly.
* Gender-Specific Public
  * The run is broadcast publicly to your gender.
* Public
  * The run is broadcast publicly to all.

## Safety Features: Publicly Broadcasting a Run on RunWithMe

User safety is of utmost important to the design of RunWithMe; users publicly broadcasting where and when they will be somewhere is inherently dangerous.

* Opt-in gender-specific broadcasting(i.e. women to women).
* Opt-in emergency contact features if a user does not check-in with an emergency contact after a run.
* When a user broadcasts their run to the public, other users have limited access to the details of the run.
  * An approximate time the run will occur(Soon / Morning / Afternoon / Evening / Night).
  * The title of the run.
  * How many users have either joined or are tentatively planning to attend.
  * The expected pace and distance of the run.
  * The city or township where the run will occur.
  * Minimal profile information broadcasted.
* When a user requests to join a publicly broadcasted run, the following occurs:
  * The profile information of the requestor is sent to the broadcaster.
  * The broadcaster may determine whether to invite the requestor.
  * If invited, the requestor may see the full run information, profile of the broadcaster, and may then decide whether they are tentative or will commit to the run.

## UML Diagram
Pending

## UI Design
#### Bottom Navigation

* Browse runs
* My runs
  * Runs which you own, or are either tentative or joined to.
* Create new run FAB
* Friends
* Profile

###### Early Stage Mock-up
![image](https://user-images.githubusercontent.com/77797048/130992445-ae6830fc-1914-4e26-bdb3-6dea9d03fe43.png)
