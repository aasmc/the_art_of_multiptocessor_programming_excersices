# Prisoners hat problem

The same warden has a different idea. He orders the prisoners to stand
in line, and places red and blue hats on each of their heads. No prisoner knows the
color of his own hat, or the color of any hat behind him, but he can see the hats of
the prisoners in front. The warden starts at the back of the line and asks each prisoner
to guess the color of his own hat. The prisoner can answer only “red” or “blue.” If
he gives the wrong answer, he is fed to the crocodiles. If he answers correctly, he is
freed. Each prisoner can hear the answer of the prisoners behind him, but cannot tell
whether that prisoner was correct.
The prisoners are allowed to consult and agree on a strategy beforehand (while
the warden listens in) but after being lined up, they cannot communicate any other
way besides their answer of “red” or “blue.”

## Goal
Devise a strategy that allows at least P − 1 of P prisoners to be freed.

## Solution

Prisoners agree that the last of them will count red hats in front of him. If he counts odd 
number of red hats, he calls out 'red', if he counts even number of red hats, 
he calls out 'blue'. Next prisoners base their answers on the answer of the last prisoner.

Thus, the last prisoner has no way of knowing the color of his hat. So he goes with luck.
E.g. RED (1), BLUE(2), RED(3), RED(4), BLUE(5)

Last prisoner (1) counts the number of red hats in front of him, and sees even number (2), 
so he calls out 'blue' and dies. 

Prisoner 2 knows that there's an even number of red hats including himself. He sees 
the even number of red hats including himself, that means that he is not in the group
that wears red hats. So calls out 'blue' and survives. 

Prisoner 3 knows that there's an even number of red hats including himself. He sees
the odd number of red hats in front of him. That means that
he is in the group that wears red hats. So he calls out 'red' and survives.

Prisoner 4 knows that there's an odd number of red hats including himself. He sees no red hats
anymore. So he knows that he is in the group that is wearing red hats. So he calls out 'red'.

Prisoner 5 knows that initially there were even number of red hats, and two of them have gone (prisoners 3 and 4)
called out 'red'. That means that if he were in the group wearing red hats, then initially there would have been odd number
of red hats, which is false. So he concludes that he is in the group wearing blue hats. He calls out 'blue' and survives.