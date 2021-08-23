# The Dining Philosophers

The Dining Philosophers problem is one of the classic problems used to describe synchronization issues in a multi-threaded environment and illustrate techniques for solving them. Dijkstra first formulated this problem and presented it regarding computers accessing tape drive peripherals.

The present formulation was given by Tony Hoare, who is also known for inventing the quicksort sorting algorithm. 

## The Problem

There are five silent philosophers (P1 – P5) sitting around a circular table, spending their lives eating and thinking.

There are five forks for them to share (1 – 5) and to be able to eat, a philosopher needs to have forks in both his hands. After eating, he puts both of them down and then they can be picked by another philosopher who repeats the same cycle.

## The Goal

- Write a program to simulate the behavior of the philosophers, where each philosopher is a thread and the chopsticks are shared objects. Note that you must prevent a situation where two philosophers hold the same chopstick at the same time. 
- Amend your program so that it never reaches a state where philosophers are deadlocked, that is, it is never the case that every philosopher holds one chopstick and is stuck waiting for another to get the second chopstick.
- Amend your program so that no philosopher ever starves.
- Write a program to provide a starvation-free solution for n philosophers for any natural number n.

## Solution
All but one philosopher try to take first left fork, then right fork to eat. If a philosopher succeeds, he eats for some time
while those philosophers that are to the left or to the right of him have to wait for a fork to be available once again.

To avoid cyclic dependency, or a deadlock when all philosophers take a left fork and there's no right fork available
(the programme stalls in this case), one of the philosophers takes first right fork, and then left fork. 

Taking a fork means to lock on that fork, i.e. it becomes unavailable until the philosopher releases the lock.
