# Jäger Project

## Overview
The Jäger project is a simple number guessing game implemented in Java. The game prompts the user to guess a randomly generated number between 0 and 10. It provides feedback on whether the guess is too high, too low, or correct.

## Features
- Random number generation
- User input handling
- Feedback on guesses
- Option to play again

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Maven

### Installation
1. Clone the repository:
   ```
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```
   cd jager-project
   ```

### Running the Game
1. Build the project using Maven:
   ```
   mvn clean install
   ```
2. Run the game:
   ```
   mvn exec:java -Dexec.mainClass="Jäger"
   ```

## Usage
Follow the prompts in the console to play the game. You will be asked to guess a number, and the game will provide feedback until you guess correctly or choose to exit.

## Contributing
Feel free to submit issues or pull requests for improvements or bug fixes.

## License
This project is licensed under the MIT License.
