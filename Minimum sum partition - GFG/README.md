# Minimum sum partition
## Hard 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given an integer array <strong>arr</strong> of size <strong>N</strong>, the task is to divide it into two sets S1 and S2 such that the absolute difference between their sums is minimum and find the minimum difference</span></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input</strong>: N = 4, arr[] = {1, 6, 11, 5}</span> <span style="font-size:18px">
<strong>Output:</strong> 1
<strong>Explanation</strong>: </span>
<span style="font-size:18px">Subset1 = {1, 5, 6}, sum of Subset1 = 12 
Subset2 = {11}, sum of Subset2 = 11  </span> </pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/minimum-sum-partition3317/1/&amp;title=Minimum%20sum%20partition%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%20N%20%3D%204%2C%20arr%5B%5D%20%3D%20%7B1%2C%206%2C%2011%2C%205%7D%20%0AOutput%3A%201%0AExplanation%3A%20%0ASubset1%20%3D%20%7B1%2C%205%2C%206%7D%2C%20sum%20of%20Subset1%20%3D%2012%20%0ASubset2%20%3D%20%7B11%7D%2C%20sum%20of%20Subset2%20%3D%2011%20%20%20" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<div><span style="font-size:18px"><strong>Example 2:</strong></span></div>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input: </strong>N = 2, arr[] = {1, 4}
<strong>Output: </strong>3
<strong>Explanation</strong>: 
Subset1 = {1}, sum of Subset1 = 1
Subset2 = {4}, sum of Subset2 = 4</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/minimum-sum-partition3317/1/&amp;title=Minimum%20sum%20partition%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%20N%20%3D%202%2C%20arr%5B%5D%20%3D%20%7B1%2C%204%7D%0AOutput%3A%203%0AExplanation%3A%20%0ASubset1%20%3D%20%7B1%7D%2C%20sum%20of%20Subset1%20%3D%201%0ASubset2%20%3D%20%7B4%7D%2C%20sum%20of%20Subset2%20%3D%204" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><br>
<span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Complete the function <strong><code>minDifference</code>()&nbsp;</strong>which takes <strong>N</strong> and array <strong>arr </strong>as input parameters and returns the integer value</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(<strong>N*|sum of array elements|</strong>)<br>
<strong>Expected Auxiliary Space:</strong> O(<strong>N*|sum of array elements|</strong>)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤&nbsp;<strong>N*|sum of array elements|</strong> ≤ 10<sup>6</sup></span></p>
 <p></p>
            </div>