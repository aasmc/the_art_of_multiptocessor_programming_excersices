# You are one of P recently arrested prisoners. 
The warden, a deranged computer scientist, makes the following announcement:

You may meet together today and plan a strategy, but after today you will be in
isolated cells and have no communication with one another.
I have set up a “switch room” which contains a light switch, which is either on or
off. The switch is not connected to anything.
Every now and then, I will select one prisoner at random to enter the “switch
room.” This prisoner may throw the switch (from on to off, or vice versa), or may
leave the switch unchanged. Nobody else will ever enter this room.
Each prisoner will visit the switch room arbitrarily often. More precisely, for any
N , eventually each of you will visit the switch room at least N times.1.8 Exercises
At any time, any of you may declare: “We have all visited the switch room at least
once.” If the claim is correct, I will set you free. If the claim is incorrect, I will feed
all of you to the crocodiles. Choose wisely!

- Devise a winning strategy when you know that the initial state of the switch is off.
- Devise a winning strategy when you do not know whether the initial state of the switch is on or off.

### Hint: 
The prisoners need not all do the same thing.

## Solution

Prisoners must select one leader. 
### Actions of ordinary prisoners when they enter the switch room:
- if the switch is on, they do nothing
- if the switch is off, they turn it on but only if they have never done this before

### Actions of a leader when he enters the switch room:
- if the switch is off, he does nothing
- if the switch is on, and it is the first time he enters the room, he simply turns it off
- if the switch is on, and it is not the first time he enters the room, he turns it off and begins counting how many times he sees the switch in 'on' position. When he counts to P-1 (P is the number of prisoners), he says that every prisoner has visited the room at least once. 