# Court Candidates.

## 1. Primary actor and goals
Who is the main interested party and what goal(s) this use case is designed to help them achieve. For example, for _process sale_:

__Player__: Wants to court different potential partners.


## 2. Preconditions

What must be true prior to the start of the use case.
For example, for _process sale_:

* Player inputs name to start game.

## 4. Postconditions

What must be true upon successful completion of the use case.
For example, for _process sale_:

* Display candidate's thoughts on date.

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

title Court Candidates (casual level)

'define the lanes
|#application|Player|
|#implementation|System|



|Player|
start

while (more dates) is (yes) 

repeat

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
:Initiates mini-game;
endwhile (no)

stop
@enduml