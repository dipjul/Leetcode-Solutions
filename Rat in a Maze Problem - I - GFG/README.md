# Rat in a Maze Problem - I
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Consider a rat placed at <strong>(0, 0)</strong> in a square matrix<strong> </strong>of order <strong>N * N</strong>. It has to reach the destination at <strong>(N - 1, N - 1)</strong>. Find all possible paths that the rat can take to reach from source to destination. The directions in which the rat can move are <strong>'U'(up)</strong>, <strong>'D'(down)</strong>, <strong>'L' (left)</strong>, <strong>'R' (right)</strong>. Value 0 at a cell in the matrix represents that it is blocked and rat cannot move to it while value 1 at a cell in the matrix represents that&nbsp;rat&nbsp;can be travel&nbsp;through it.<br>
<strong>Note</strong>: In a path, no cell can be visited more than one time.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input</strong>:
N = 4
m[][] = {{1, 0, 0, 0},
         {1, 1, 0, 1}, 
         {1, 1, 0, 0},
         {0, 1, 1, 1}}
<strong>Output:</strong>
DDRDRR DRDDRR</span>
<span style="font-size:18px"><strong>Explanation</strong>:
The rat can reach the destination at 
(3, 3) from (0, 0) by two paths - DRDDRR 
and DDRDRR, when printed in sorted order 
we get DDRDRR DRDDRR.</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1&amp;title=Rat%20in%20a%20Maze%20Problem%20-%20I%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0AN%20%3D%204%0Am%5B%5D%5B%5D%20%3D%20%7B%7B1%2C%200%2C%200%2C%200%7D%2C%0A%20%20%20%20%20%20%20%20%20%7B1%2C%201%2C%200%2C%201%7D%2C%20%0A%20%20%20%20%20%20%20%20%20%7B1%2C%201%2C%200%2C%200%7D%2C%0A%20%20%20%20%20%20%20%20%20%7B0%2C%201%2C%201%2C%201%7D%7D%0AOutput%3A%0ADDRDRR%20DRDDRR%0AExplanation%3A%0AThe%20rat%20can%20reach%20the%20destination%20at%20%0A(3%2C%203)%20from%20(0%2C%200)%20by%20two%20paths%20-%20DRDDRR%20%0Aand%20DDRDRR%2C%20when%20printed%20in%20sorted%20order%20%0Awe%20get%20DDRDRR%20DRDDRR." class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<div><span style="font-size:18px"><strong>Example 2:</strong></span></div>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input</strong>:
N = 2
m[][] = {{1, 0},
         {1, 0}}
<strong>Output:</strong>
-1</span>
<span style="font-size:18px"><strong>Explanation</strong>:
No path exists and destination cell is 
blocked.</span>
</pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1&amp;title=Rat%20in%20a%20Maze%20Problem%20-%20I%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0AN%20%3D%202%0Am%5B%5D%5B%5D%20%3D%20%7B%7B1%2C%200%7D%2C%0A%20%20%20%20%20%20%20%20%20%7B1%2C%200%7D%7D%0AOutput%3A%0A-1%0AExplanation%3A%0ANo%20path%20exists%20and%20destination%20cell%20is%20%0Ablocked.%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Complete the function <strong>printPath()&nbsp;</strong>which takes <strong>N </strong>and 2D&nbsp;array<strong> m[ ][ ]</strong><strong> </strong>as input parameters and returns the list of&nbsp;paths in lexicographically increasing order.</span>&nbsp;<br>
<span style="font-size:18px"><strong>Note:</strong>&nbsp;In case of no path, return an empty list. The driver will output <strong>"-1"</strong> automatically.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O((3<sup>N</sup><sup>^2</sup>)).<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(L * X), L = length of the path, X = number of paths.</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
2 ≤ N ≤ 5<br>
0 ≤ m[i][j] ≤ 1</span></p>
 <p></p>
            </div>