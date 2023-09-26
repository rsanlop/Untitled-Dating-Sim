# Play Games.

## 1. Primary actor and goals
Who is the main interested party and what goal(s) this use case is designed to help them achieve. For example, for _process sale_:

__Player__: Wants to initiate a mini-game while on a date with candidate.


## 2. Preconditions

What must be true prior to the start of the use case.
For example, for _process sale_:

* Player chooses to go on a date with candidate

## 4. Postconditions

What must be true upon successful completion of the use case.
For example, for _process sale_:

* Display affection points and game stats after playing game

## 4. Workflow

The sequence of steps involved in the execution of the use case, in the form of one or more activity diagrams (please feel free to decompose into multiple diagrams for readability).

The workflow can be specified at different levels of detail:

* __Brief__: main success scenario only;
* __Casual__: most common scenarios and variations;
* __Fully-dressed__: all scenarios and variations.

Please be sure indicate what level of detail the workflow you include represents.

For example, for _process sale_:

```plantuml
@startuml

skin rose

title Play Games (casual level)

'define the lanes
|#application|Player|
|#implementation|System|



|System|
start
:random selection of mini-game;
switch (mini-game)
    case (trivia)
        :initiates trivia game;
    case (dress up)
        :initiates dress up game;
    case (Riddle)
        :initiates riddle game;
    case (kissing)
        :initiates Kissing game;
 endswitch
:displays instructions and play options;


|Player|
:presses start;

|System|
:Initiates mini-game;

|Player|
:Plays the game;

|System|
:Displays stats at end of game;

|Player|
:Continues game;


stop
@enduml