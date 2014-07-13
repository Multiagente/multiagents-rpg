# Multiagents RPG

### Description
This project implements business logic of RPG using multiagents systems paradigm.

### Structure
This project define three Maven modules as show in the scheme below:

   - multiagents-rpg
   - multiagents-rpg-api  
   - multiagents-rpg-domain

###### 'multiagents-rpg'
The parent project groups Maven modules, define common dependencies and build process.  

###### 'multiagents-rpg-domain'
The domain project holds business logic and agents environment.  

###### 'multiagents-rpg-api'
The api project merges logic of domain project and other frameworks like database drivers, providing a service layer which abstract all code complexity.