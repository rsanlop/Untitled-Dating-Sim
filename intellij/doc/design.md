```plantuml

@startuml

skinparam titleFontSize 14
title
    Conceptual Classes
    |= Class   |= Attributes |
    | Player| name |
    | Character | name \n affection \n points \n map location|
    | Mini-game | Type \n Duration  |
    end title
    
    object Player {
    name
    }
    
    object Character{
    name
    affection points 
    map location
    }
    
    object Minigame{
    type
    duration
    }
    
    object EndingScreens{
    game stats
    }
    
    Player -- Character : interacts with \t\t
    Player -- Minigame : plays the game
    Minigame -- Character :determines stats\t\t
    Minigame -- EndingScreens : leads to
    
    
@enduml