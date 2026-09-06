# console-battleship-java

A two-player, console-based implementation of Battleship written in Java. Players place ships on separate 10×10 grids, enter attacks by coordinate, and receive hit-or-miss feedback across five rounds.

Features

- Two-player turn-based gameplay
- Separate 10×10 boards for each player
- Horizontal and vertical ship placement
- Ship, grid, player, and location objects
- Hit and miss tracking
- Text-based board rendering

Object-Oriented Design

- Battleship manages setup, turns, user input, and game output.
- Player manages a player's grid, ships, and incoming guesses.
- Grid stores the 10×10 collection of locations and renders board states.
- Location tracks whether a cell contains a ship and whether it was hit or missed.
- Ship stores a ship's length, starting location, and direction.

Project Structure

text
console-battleship-java/
├── README.md
├── .gitignore
└── src/
    ├── Battleship.java
    ├── Grid.java
    ├── Location.java
    ├── Player.java
    └── Ship.java

## Controls

- Rows and columns are entered as zero-based indexes from 0 through 9.
- Enter `0` to place a ship horizontally.
- Enter `1` to place a ship vertically.
- Both players manually enter their ship positions and guesses.

## Current Limitations

- The game runs for five rounds instead of continuing until every ship is sunk.
- Input and ship placement are not validated, so coordinates must remain within the board.
- Ships may overlap.
- Both players' ship boards are displayed because this version is designed as a local console demonstration.

## Project History

This project was developed during high school as a Java object-oriented programming exercise. It demonstrates class composition, two-dimensional arrays, encapsulation, console input, and game-state management. The original gameplay code has been preserved; only the missing ACM import and repository documentation were added for running it outside CodeHS.
