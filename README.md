# RL4j-Demos
Implementations of deep reinforcement learning with java framework rl4j.Since most rl4j examples rely on OpenAI's Gym, this project shows how to define custom action/state/reward.Now the available example is a maze game.

# Requirements
- Java 8 or later
- RL4j & ND4j & DL4j 1.0.0-sanpshot or 1.0.0-beta6 and later

# Description
1. Game Maze
The maze is a 10*10 lattice(We use Java Swing to implement it).The destination locates in (9,9) position and the robot/agent randomly selects a position at the beginning of the game.After training deep q-learning(DQN) model, the agent can move to the destination step by step(Each step can choose up/down/left/right action).

# Result
## 1. Game Maze
### 1.1 Display 
![Game-Maze-Display](https://raw.githubusercontent.com/AllenWGX/RL4j-Demos/master/imgs/Game-Maze.gif)
### 1.2 Log
	22:32:22.454 [main] INFO cn.live.wangongxi.GameMDP - Game Over, Total Step:9, Trap State:false, Success State:true
	22:32:22.454 [main] INFO cn.live.wangongxi.GameMDP - (3,7)->
	22:32:22.454 [main] INFO cn.live.wangongxi.GameMDP - (3,8)->
	22:32:22.454 [main] INFO cn.live.wangongxi.GameMDP - (3,9)->
	22:32:22.455 [main] INFO cn.live.wangongxi.GameMDP - (4,9)->
	22:32:22.455 [main] INFO cn.live.wangongxi.GameMDP - (5,9)->
	22:32:22.455 [main] INFO cn.live.wangongxi.GameMDP - (6,9)->
	22:32:22.455 [main] INFO cn.live.wangongxi.GameMDP - (7,9)->
	22:32:22.455 [main] INFO cn.live.wangongxi.GameMDP - (8,9)->
	22:32:22.455 [main] INFO cn.live.wangongxi.GameMDP - (9,9)->