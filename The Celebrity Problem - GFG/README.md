# The Celebrity Problem
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">A celebrity is a person who is known to all but does not know anyone at a party. If you go to a party of N people, find if there is a celebrity in the party or not.<br>
A square NxN matrix M[][] is used to represent people at the party such that if an element of row i and column j &nbsp;is set to 1 it means ith person knows jth person. Here M[i][i] will always be 0.<br>
<strong>Note:</strong> Follow 0 based indexing.</span><br>
&nbsp;</p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:</strong>
N = 3
M[][] = {{0 1 0},
         {0 0 0}, 
         {0 1 0}}
<strong>Output:</strong> 1
<strong>Explanation: </strong>0th and 2nd person both
know 1. Therefore, 1 is the celebrity. </span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/the-celebrity-problem/1/&amp;title=The%20Celebrity%20Problem%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0AN%20%3D%203%0AM%5B%5D%5B%5D%20%3D%20%7B%7B0%201%200%7D%2C%0A%20%20%20%20%20%20%20%20%20%7B0%200%200%7D%2C%20%0A%20%20%20%20%20%20%20%20%20%7B0%201%200%7D%7D%0AOutput%3A%201%0AExplanation%3A%200th%20and%202nd%20person%20both%0Aknow%201.%20Therefore%2C%201%20is%20the%20celebrity.%20" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:</strong>
N = 2
M[][] = {{0 1},
         {1 0}}
<strong>Output:</strong> -1
<strong>Explanation: </strong>The two people at the party both
know each other. None of them is a celebrity.</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/the-celebrity-problem/1/&amp;title=The%20Celebrity%20Problem%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0AN%20%3D%202%0AM%5B%5D%5B%5D%20%3D%20%7B%7B0%201%7D%2C%0A%20%20%20%20%20%20%20%20%20%7B1%200%7D%7D%0AOutput%3A%20-1%0AExplanation%3A%20The%20two%20people%20at%20the%20party%20both%0Aknow%20each%20other.%20None%20of%20them%20is%20a%20celebrity." class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Complete the function <strong>celebrity()</strong> which takes the matrix M and its size N as input parameters and returns the index of the celebrity. If no such celebrity is present, return -1.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N)<br>
<strong>Expected Auxiliary Space:</strong> O(1)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
2 &lt;= N &lt;= 3000<br>
0 &lt;= M[][] &lt;= 1</span></p>
 <p></p>
            </div>