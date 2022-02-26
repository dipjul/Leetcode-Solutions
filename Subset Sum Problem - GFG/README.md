# Subset Sum Problem
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given an array of non-negative integers, and a value <em>sum</em>, determine if there is a subset of the given set with sum equal to given <em>sum</em>.&nbsp;</span></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input</strong></span>:
<span style="font-size:18px">N = 6
arr[] = {3, 34, 4, 12, 5, 2}
sum = 9
<strong>Output:</strong>&nbsp;1&nbsp;
<strong>Explanation</strong>: Here there exists a subset with
sum = 9, 4+3+2 = 9.</span>
</pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1/&amp;title=Subset%20Sum%20Problem%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0AN%20%3D%206%0Aarr%5B%5D%20%3D%20%7B3%2C%2034%2C%204%2C%2012%2C%205%2C%202%7D%0Asum%20%3D%209%0AOutput%3A%C2%A01%C2%A0%0AExplanation%3A%20Here%20there%20exists%20a%20subset%20with%0Asum%20%3D%209%2C%204%2B3%2B2%20%3D%209.%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input</strong></span>:
<span style="font-size:18px">N = 6
arr[] = {3, 34, 4, 12, 5, 2}
sum = 30
<strong>Output:</strong>&nbsp;0&nbsp;
<strong>Explanation</strong>: There is no subset with sum 30.</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1/&amp;title=Subset%20Sum%20Problem%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0AN%20%3D%206%0Aarr%5B%5D%20%3D%20%7B3%2C%2034%2C%204%2C%2012%2C%205%2C%202%7D%0Asum%20%3D%2030%0AOutput%3A%C2%A00%C2%A0%0AExplanation%3A%20There%20is%20no%20subset%20with%20sum%2030." class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><br>
<span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>isSubsetSum()</strong>&nbsp;which takes the array arr[], its size N<strong>&nbsp;</strong>and an integer <strong>sum </strong>as input parameters&nbsp;and returns boolean value true if there exists a subset with given sum and false otherwise.<br>
The driver code itself prints 1, if returned value is true and prints 0 if returned value is false.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(sum*N)<br>
<strong>Expected Auxiliary Space:</strong> O(sum*N)</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N &lt;= 100</span><br>
<span style="font-size:18px">1&lt;= arr[i] &lt;= 100<br>
1&lt;= sum &lt;= 10<sup>5</sup></span></p>
 <p></p>
            </div>