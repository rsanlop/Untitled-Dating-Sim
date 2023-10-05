```plantuml

allow_mixing
hide circle
hide empty methods
hide footbox
actor "User" as user 

    class Player {
    name
    }
    class Map{
    Locations
    Character List
    }
    
    class Character{
    name
    affection points 
    map location
    dialogue
    }
    
    class Minigame{
    type
    instructions
    duration
    }
    
    class EndingScreens{
    game stats
    dialogue
    }
    
    Player -- Character : interacts with \t\t
    Player -- Minigame : plays the game
    Minigame -- Character :determines stats\t\t
    Minigame -- EndingScreens : leads to
    Map -- Character : selects character \t\t
    
   


```

```plantuml
@startuml

actor "Player" as player 
participant ": UI" as ui
participant ": Game System" as game
participant ": Map" as map
participant ": CharacterList" as character
participant ": MinigameList" as minigame
participant ": Ending screens" as ending


ui -> player : asks for a name
player -> ui : inputs name
ui -> game : stores n = name
game -> map : getMap()
game -> ui : displayMap()
player -> ui : selects location
ui -> game : getDialogue(id)
game -> character : getDialogue(id)
game -> ui : displayDialogue(str)
game -> ui : displayStartbutton
player -> ui : presses start 
game -> minigame : getRandomMinigame()
game -> ui : displayGame()
player -> ui : plays game
game -> character : updateAffection(result)
game -> ending : getEnding(result)
game -> ui : displayEnding()
game -> ui : displayDialogue()




   

@enduml
