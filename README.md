# 🎳 Bowling Score Calculator

Welcome to the **Bowling Score Calculator** project! This Java application calculates the total score of a bowling game based on a given input string representing the rolls in a standard 10-frame game.

## 📋 Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [How It Works](#how-it-works)
- [Setup](#setup)
- [Usage](#usage)
- [Examples](#examples)
- [Testing](#testing)
- [Contributing](#contributing)
- [License](#license)

## 🌟 Introduction

Bowling is a popular game where players roll a ball to knock down pins arranged in a triangular formation. The scoring system can be a bit tricky, especially with strikes and spares. This project is a simple Java implementation to calculate the score of a bowling game based on a given input string.

## 🚀 Features

- **Strike** (`X`) and **Spare** (`/`) handling
- Final frame handling with extra rolls
- Input parsing from a standardized string format
- Output of the total score

## 🛠️ How It Works

The program processes an input string where:
- `X` represents a **strike**.
- `/` represents a **spare**.
- `-` represents a **miss**.
- Numbers (`1-9`) represent the number of pins knocked down.

The score is calculated according to the standard bowling rules, including the correct handling of strikes and spares in the final frame.

### Algorithm Overview:

1. **Parsing:** The input string is parsed into individual rolls.
2. **Scoring:** The program iterates through the frames, applying the scoring rules.
3. **Final Score:** The total score is output after processing all frames.

## ⚙️ Setup

1. **Clone the repository:**

   ```bash
   git clone https://github.com/your-username/bowling-score-calculator.git
   cd bowling-score-calculator

2. **Compile the program:**

Use your preferred Java IDE (like IntelliJ IDEA) or compile via command line:

  ```bash
  javac -d bin src/org/example/Main.java
```

3. **Run the program:**
## Run the program:

```bash
java -cp bin org.example.Main
```

## 💻 Usage
To calculate the score, modify the input string in the `Main` class:

```java
String input = "X|7/|9-|X|-8|8/|-6|X|X||X81";
```
Replace the value of input with your own bowling score string, and run the program to see the calculated score.

## 📚 Examples
Here are a few example inputs and their expected scores:

**"X|7/|9-|X|-8|8/|-6|X|X||X81": 167**

**"9-|9-|9-|9-|9-|9-|9-|9-|9-|9-||": 90**

**"X|X|X|X|X|X|X|X|X|X||XX": 300**

## 🧪 Testing
To run the tests, ensure you have JUnit installed and run the test cases provided in the test directory. Example:
```bash
java -cp bin org.example.BowlingScoreTest
```
## 🤝 Contributing
This project was developed collaboratively by [pythonisamgm](https://github.com/pythonisamgm) and [EvaMartinez94](https://github.com/EvaMartinez94). Contributions are welcome! Please fork this repository, create a new branch for your feature or bugfix, and submit a pull request.

## 📜 License
This project is licensed under the MIT License. See the LICENSE file for more details.
