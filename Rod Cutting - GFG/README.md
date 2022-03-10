# Rod Cutting
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a rod of length <strong>N</strong> inches and an array of prices,&nbsp;<strong>price[]</strong> that contains prices of all pieces of size smaller than <strong>N</strong>. Determine the maximum value obtainable by cutting up the rod and selling the pieces.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:</strong>
N = 8
Price[] = {1, 5, 8, 9, 10, 17, 17, 20}
<strong>Output:</strong>
22</span>
<strong><span style="font-size:18px">Explanation:
</span></strong><span style="font-size:18px">The maximum obtainable value is 22 by
cutting in two pieces of lengths 2 and 
6, i.e., 5+17=22.</span>
</pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/rod-cutting0840/1/&amp;title=Rod%20Cutting%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0AN%20%3D%208%0APrice%5B%5D%20%3D%20%7B1%2C%205%2C%208%2C%209%2C%2010%2C%2017%2C%2017%2C%2020%7D%0AOutput%3A%0A22%0AExplanation%3A%0AThe%20maximum%20obtainable%20value%20is%2022%20by%0Acutting%20in%20two%20pieces%20of%20lengths%202%20and%20%0A6%2C%20i.e.%2C%205%2B17%3D22.%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:</strong>
N=8
Price[] = {3, 5, 8, 9, 10, 17, 17, 20}
<strong>Output:</strong> 24
<strong>Explanation: </strong>
The maximum obtainable value is 
24 by cutting the rod into 8 pieces 
of length 1, i.e, 8*3=24. </span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/rod-cutting0840/1/&amp;title=Rod%20Cutting%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0AN%3D8%0APrice%5B%5D%20%3D%20%7B3%2C%205%2C%208%2C%209%2C%2010%2C%2017%2C%2017%2C%2020%7D%0AOutput%3A%2024%0AExplanation%3A%20%0AThe%20maximum%20obtainable%20value%20is%20%0A24%20by%20cutting%20the%20rod%20into%208%20pieces%20%0Aof%20length%201%2C%20i.e%2C%208*3%3D24.%20" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><br>
<span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>cutRod()</strong>&nbsp;which takes the array <strong>A[]</strong> and its size <strong>N</strong><strong> </strong>as inputs and returns the maximum price obtainable.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N<sup>2</sup>)<br>
<strong>Expected Auxiliary Space:</strong> O(N)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 1000<br>
1 ≤ A<sub>i</sub> ≤ 10<sup>5</sup></span></p>
 <p></p>
            </div>