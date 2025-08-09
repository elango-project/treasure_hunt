# 🏴‍☠️ Treasure Hunt Game (Java Console)

A simple **text-based adventure game** built in **Java** where you explore, fight, rest, and try to collect **100 coins** before your health runs out.

---

## 🎯 Objective
- Start with **100 health** and **0 coins**.
- Perform actions from a menu to **gain coins** and **stay alive**.
- **Win** if you collect **100 or more coins**.
- **Lose** if your health reaches **0 or below**.

---

## 📜 How to Play
When you run the program, you will see a menu with the following options:

| Action        | Health Change | Coin Change | Description |
|--------------|--------------|-------------|-------------|
| **Fight**    | -20          | +10         | Engage in battle to earn coins but lose health. |
| **Search**   | -10          | +20         | Search for treasure with moderate risk. |
| **Rest**     | +15          | -5          | Recover health at the cost of coins. |
| **Check Status** | 0       | 0           | View your current health and coin balance. |
| **Quit**     | —            | —           | Exit the game. |

---

## 🖥️ How to Run
### Using Terminal / Command Prompt
1. **Clone the repository**  
   ```bash
   git clone https://github.com/elango-project/treasure_hunt.git
   cd TreasureHunt
