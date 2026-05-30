# 4 in a Row (Connect Four) — Java Console Game

A two-player Connect Four game running in the Java console. The board is a 6×7 integer matrix where `0` = empty, `1` = Player 1, and `2` = Player 2. Row 0 is the bottom and row 5 is the top, simulating gravity.

## How to Run

1. Clone or download the project
2. Open in any Java IDE (Eclipse, IntelliJ, etc.) or compile via terminal:
   ```
   javac Test01.java
   java proje1.Test01
   ```
3. Two players take turns entering a column number (1–7) in the console

## Gameplay

- Players alternate turns entering a column number
- A disc drops to the lowest empty row in the chosen column
- First player to get **4 in a row** (horizontal, vertical, or diagonal) wins
- If the board fills up with no winner, the game ends in a draw

## Project Structure

```
proje1/
└── Test01.java
```

## Methods

| Method | Description |
|---|---|
| `main` | Initializes the board and loops until win or draw; switches turns each iteration |
| `printTable` | Prints the board top to bottom with `\|` separators and a column number guide |
| `valueOf` | Converts cell values to display characters: `1→'X'`, `2→'O'`, `0→' '` |
| `takeInput` | Prompts the active player for a column, validates input, places the disc |
| `isItFull` | Checks only the top row (row 5) to determine if the board is full |
| `isItWin` | Scans for four consecutive matching values in all four directions; returns winner or `0` |

## Example Board

```
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| |X| | | | | |
|O|X|O| | | | |
|1|2|3|4|5|6|7|
```
