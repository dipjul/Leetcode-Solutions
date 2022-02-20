# Subset Sums
## Easy
<div class="problem-statement">
                <p></p><div class="entry-content">
<p><span style="font-size:18px">Given a&nbsp;list <strong>arr</strong>&nbsp;of <strong>N</strong> integers, print sums of all subsets in it.</span></p>

<p>&nbsp;</p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:</strong>
N = 2
arr[] = {2, 3}</span>
<span style="font-size:18px"><strong>Output:</strong>
0 2 3 5</span>
<span style="font-size:18px"><strong>Explanation:</strong>
When no elements is taken then Sum = 0.
When only 2 is taken then Sum = 2.
When only 3 is taken then Sum = 3.
When element 2 and 3 are taken then 
Sum = 2+3 = 5.</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/subset-sums2234/1&amp;title=Subset%20Sums%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0AN%20%3D%202%0Aarr%5B%5D%20%3D%20%7B2%2C%203%7D%0AOutput%3A%0A0%202%203%205%0AExplanation%3A%0AWhen%20no%20elements%20is%20taken%20then%20Sum%20%3D%200.%0AWhen%20only%202%20is%20taken%20then%20Sum%20%3D%202.%0AWhen%20only%203%20is%20taken%20then%20Sum%20%3D%203.%0AWhen%20element%202%20and%203%20are%20taken%20then%20%0ASum%20%3D%202%2B3%20%3D%205." class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:</strong>
N = 3
arr = {5, 2, 1}</span>
<span style="font-size:18px"><strong>Output:</strong>
0 1 2 3 5 6 7 8</span>
</pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/subset-sums2234/1&amp;title=Subset%20Sums%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0AN%20%3D%203%0Aarr%20%3D%20%7B5%2C%202%2C%201%7D%0AOutput%3A%0A0%201%202%203%205%206%207%208%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Your Task:</strong>&nbsp;&nbsp;<br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>subsetSums</strong>()&nbsp;which takes a list/vector and an integer <strong>N</strong> as an input parameter and return the list/vector of all the subset sums.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(2<sup>N</sup>)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(2<sup>N</sup>)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N &lt;= 15<br>
0 &lt;= arr[i] &lt;= 10<sup>4</sup></span></p>
</div>
 <p></p>
            </div>