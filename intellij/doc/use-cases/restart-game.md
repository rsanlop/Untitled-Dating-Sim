# Restart game

## 1. Primary actor and goals
Who is the main interested party and what goal(s) this use case is designed to help them achieve.

__Player__: Wants to restart game.


## 2. Preconditions

What must be true prior to the start of the use case.

* Player has gone on at least one date (completed a mini-game).
* Game has already automatically saved (after each mini-game)

## 4. Postconditions

What must be true upon successful completion of the use case.

* Player has restarted their progress.

## 4. Workflow

The sequence of steps involved in the execution of the use case, in the form of one or more activity diagrams (please feel free to decompose into multiple diagrams for readability).

The workflow can be specified at different levels of detail:

* __Brief__: main success scenario only;
* __Casual__: most common scenarios and variations;
* __Fully-dressed__: all scenarios and variations.

Please be sure indicate what level of detail the workflow you include represents.

```plantuml
@startuml

skin rose

title Restart Game (casual level)

'define the lanes
|#application|Player|
|#implementation|System|

|Player|
start
:press menu options;
:selects restart option;

|System|
:Discards saved progress;
:Displays initial start screen;

|Player|
:continues playing;


stop
@enduml