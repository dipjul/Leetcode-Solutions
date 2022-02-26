# Perfect Sum Problem
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given an array <strong>arr[]</strong> of integers and an integer <strong>sum</strong>, the task is to count&nbsp;all subsets of the given array with a sum equal to a given <strong>sum</strong>.</span></p>

<p><span style="font-size:18px">Note: Answer can be very large, so, output answer modulo 10<sup>9</sup>+7</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input</strong>: N = 6, arr[] = {2, 3, 5, 6, 8, 10}
       sum = 10
<strong>Output:</strong> 3</span>
<span style="font-size:18px"><strong>Explanation</strong>: {2, 3, 5}, {2, 8}, {10}</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background: rgb(15, 37, 51); padding: 5px; border-radius: 0px 0px 5px 5px; display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/perfect-sum-problem5633/1&amp;title=Perfect%20Sum%20Problem%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%20N%20%3D%206%2C%20arr%5B%5D%20%3D%20%7B2%2C%203%2C%205%2C%206%2C%208%2C%2010%7D%0A%20%20%20%20%20%20%20sum%20%3D%2010%0AOutput%3A%203%0AExplanation%3A%20%7B2%2C%203%2C%205%7D%2C%20%7B2%2C%208%7D%2C%20%7B10%7D" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<div><span style="font-size:18px"><strong>Example 2:</strong></span></div>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input</strong>: N = 5, arr[] = {1, 2, 3, 4, 5}
       sum = 10
<strong>Output:</strong> 3</span>
<span style="font-size:18px"><strong>Explanation</strong>: {1, 2, 3, 4}, {1, 4, 5}, 
             {2, 3, 5}</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background: rgb(15, 37, 51); padding: 5px; border-radius: 0px 0px 5px 5px; display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/perfect-sum-problem5633/1&amp;title=Perfect%20Sum%20Problem%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%20N%20%3D%205%2C%20arr%5B%5D%20%3D%20%7B1%2C%202%2C%203%2C%204%2C%205%7D%0A%20%20%20%20%20%20%20sum%20%3D%2010%0AOutput%3A%203%0AExplanation%3A%20%7B1%2C%202%2C%203%2C%204%7D%2C%20%7B1%2C%204%2C%205%7D%2C%20%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%7B2%2C%203%2C%205%7D" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<div><br>
<span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Complete the function <strong><code>perfectSum</code>()&nbsp;</strong>which takes <strong>N, </strong>array<strong> arr[]</strong> and <strong>sum </strong>as input parameters and returns an integer value<br>
<br>
<strong>Expected Time Complexity:</strong> O(<strong>N*sum</strong>)<br>
<strong>Expected Auxiliary Space:</strong> O(<strong>N*sum</strong>)<br>
<br>
<strong>Constraints:</strong><br>
1 ≤ <strong>N*sum</strong> ≤ 10<sup>6</sup></span></div>
 <p></p>
            </div>