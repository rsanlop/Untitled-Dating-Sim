# Loop Game

## 1. Primary actor and goals
Who is the main interested party and what goal(s) this use case is designed to help them achieve.

__Player__: Wants to play our awesome dating simulator.


## 2. Preconditions

What must be true prior to the start of the use case.

* Player inputs name to start game.

## 4. Postconditions

What must be true upon successful completion of the use case.

* Reaches end of the game

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

title Loop Game (casual level)

'define the lanes
|#application|Player|
|#implementation|System|



|Player|
start
:inputs name;

|System|
:game starts up;
:shows all available candidates;

|Player|
while (wants to date) is (yes) 

repeat
|System|
:displays locations;
|Player|

:Select a location to meet candidate;

|System|
:Shows candidate in selected location;
:Displays initial dialouge sequence;
:Asks player to date candidate or not;

|Player|
:Selects Option;

|System|
backward :restart;
repeat while ( Date ) is ( No ) not ( Yes )
:Executes random mini-game;
switch (mini-game)
    case (trivia) 
        :executes <u>trivia game;
    case (kissing game)
        :executes <u>kissing game;
    case (riddle)
        :executes <u>riddle game;
    case (dress-up)
        :executes <u>dress-up game;
endswitch
:updates affection points;
endwhile (no)
|Player|
:chooses a candidate;
|System|
switch (<u>choosing-candidate)
    case (has enough affection points) 
        :displays good ending screen;
    case (insufficient affection points)
        :displays bad ending scene;
endswitch
:ends game;
stop
@enduml