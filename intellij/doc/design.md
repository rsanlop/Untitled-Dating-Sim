```plantuml

@startuml

skinparam titleFontSize 14
title
    Conceptual Classes
    |= Class   |= Attributes |
    | Player| name |
    | Character | name \n affection \n points \n map location|
    end title
    
    object Player {
    name
    }
    
    object Character{
    name
    affection points 
    map location
    }
    Player -right- Character
    
    
@enduml