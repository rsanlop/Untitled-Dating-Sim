# Play Kissing Game

## 1. Primary actor and goals
Who is the main interested party and what goal(s) this use case is designed to help them achieve.

__Player__: Wants to kiss candidate without getting caught.


## 2. Preconditions

What must be true prior to the start of the use case.

* Player initiates a random game selection.

## 4. Postconditions

What must be true upon successful completion of the use case.

* Displays outcome screen (good or bad).

## 4. Workflow

The sequence of steps involved in the execution of the use case, in the form of one or more activity diagrams (please feel free to decompose into multiple diagrams for readability).

```plantuml
@startuml

skin rose

title Play Kissing Game (casual level)

'define the lanes
|#application|Player|
|#implementation|System|

|System|
start

:Initiates timer;

|Player|
:Presses down on screen to kiss;

|System|
:hints at another character approaching;
:updates kissing meter;

|Player| 
:Lets go to avoid getting caught;

|System| 
:Repeats until timer ends;

switch (ending-type)
    case (good-ending) 
        :displays good ending screen;
    case (bad-ending)
        :displays bad ending scene;
endswitch

stop
@enduml