# RunWithMe (Herd)
A fitness/social-media Android Application which aims to provide runners an easy way to locally connect safely and coordinate group-runs.

### Run Broadcast Levels

* Invite-Only Private
  * The run is only shared with invited friends.
* Friends Private
  * The run is automatically shared with all friends, but is not broadcasted publicly.
* Gender-Specific Friends Private
  * The run is automatically shared with all friends of your gender, but is not broadcasted publicly.
* Gender-Specific Public
  * The run is broadcast publicly to your gender.
* Public
  * The run is broadcast publicly to all genders.

### Safety Features: Publicly Broadcasting a Run on RunWithMe

User safety is of utmost important to the design of RunWithMe; users publicly broadcasting where and when they will be is inherently dangerous.

* Default to gender-specific broadcasting(i.e. women to women).
* When a user broadcasts their run to the public, other users have limited access to the details of the run.
  * An approximate time the run will occur(Soon / Morning / Afternoon / Evening / Night).
  * The title of the run.
  * How many users have either joined or are tentatively planning to attend.
  * The expected pace and distance of the run.
  * The city or township where the run will occur.
  * NO profile information on the user who broadcasted their run at all other than gender.
* When a user requests to join a publicly broadcasted run, the following occurs:
  * The profile information of the requestor is sent to the broadcaster.
  * The broadcaster may determine whether to invite the requestor.
  * If invited, the requestor may see the full run information, profile of the broadcaster, and may then decide whether they are tentative or will commit to the run.

### UML Diagram
Pending
