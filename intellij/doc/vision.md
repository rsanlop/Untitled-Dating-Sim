Introduction:

Our main goal is for users to enjoy their experience with our app. We want to 
make a fun and easy-to-use dating simulator. In this game, you have the freedom
to explore different dating options. We envision our users to replay the
game, as there are several endings and mini-games. 


---

App Case:

This app will hopefully offer a new dating simulator experience, unlike any that
are available. 

---

Key Functionality:

Tracks progress through affection points. 

---

Stakeholder Goals:

* Court candidates
* Play mini-games 
* Save progress 
* Choose a partner (or not)

---

Visual Diagram:
```plantuml
@startuml


actor "Player" as Player

package "Dating Sim" {
    usecase "Court Candidates" as court
    usecase "Play Game" as play
    usecase "Play Kissing Game" as kissing
    usecase "Choose partner" as choose
    usecase "Save Progress" as save
}

Player --> court
Player --> play 
Player --> kissing
Player --> choose
Player --> save


@enduml


