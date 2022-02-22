# M-Coloring Problem
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given an undirected graph and an integer&nbsp;<strong>M</strong>. The task is to determine if the graph can be colored with at most M&nbsp;colors such that no two adjacent vertices of the graph are colored with the same color. Here coloring of a graph means the assignment of colors to all vertices. Print 1&nbsp;if it is possible to colour vertices and 0&nbsp;otherwise.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>N = 4
M = 3
E = 5
Edges[] = {(0,1),(1,2),(2,3),(3,0),(0,2)}
<strong>Output: </strong>1<strong>
Explanation: </strong>It is possible to colour the
given graph using 3 colours.</span>
</pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/m-coloring-problem-1587115620/1%23&amp;title=M-Coloring%20Problem%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0AN%20%3D%204%0AM%20%3D%203%0AE%20%3D%205%0AEdges%5B%5D%20%3D%20%7B(0%2C1)%2C(1%2C2)%2C(2%2C3)%2C(3%2C0)%2C(0%2C2)%7D%0AOutput%3A%201%0AExplanation%3A%20It%20is%20possible%20to%20colour%20the%0Agiven%20graph%20using%203%20colours.%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>N = 3
M = 2
E = 3
Edges[] = {(0,1),(1,2),(0,2)}
<strong>Output: </strong>0</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/m-coloring-problem-1587115620/1%23&amp;title=M-Coloring%20Problem%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0AN%20%3D%203%0AM%20%3D%202%0AE%20%3D%203%0AEdges%5B%5D%20%3D%20%7B(0%2C1)%2C(1%2C2)%2C(0%2C2)%7D%0AOutput%3A%200" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
Your task is to complete the function&nbsp;<strong>graphColoring()</strong>&nbsp;which takes the 2d-array graph[], the number of colours and the number of nodes&nbsp;as inputs and returns <strong>true</strong>&nbsp;if answer exists otherwise <strong>false</strong>. 1 is printed if the returned value is&nbsp;<strong>true,&nbsp;</strong>0 otherwise. The printing is done by the driver's code.<br>
<strong>Note</strong>: In Example there are Edges not the graph.Graph will be like, if there is an edge between vertex X and vertex Y graph[] will contain 1 at graph[X-1][Y-1], else 0.&nbsp;In 2d-array graph[ ], nodes are 0-based indexed, i.e. from 0 to N-1.Function will be contain 2-D graph not the edges.</span><br>
<br>
<strong><span style="font-size:18px">Expected Time Complexity:</span></strong><span style="font-size:18px">&nbsp;O(M</span><sup>N</sup><span style="font-size:18px">).</span><br>
<strong><span style="font-size:18px">Expected Auxiliary&nbsp;</span></strong><span style="font-size:18px"><strong>Space:</strong>&nbsp;O(N).</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 20<br>
1 ≤ E ≤ (N*(N-1))/2<br>
1 ≤ M ≤ N</span></p>
 <p></p>
            </div>