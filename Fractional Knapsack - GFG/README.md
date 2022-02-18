# Fractional Knapsack
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given <em>weights</em> and <em>values</em> of <strong>N</strong> items, we need to put these items in a knapsack of capacity <strong>W</strong> to get the <em>maximum</em> total value in the knapsack.<br>
<strong>Note:</strong> Unlike 0/1 knapsack, you are allowed to break&nbsp;the item.&nbsp;</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>N = 3, W = 50
values[] = {60,100,120}
weight[] = {10,20,30}
<strong>Output:
</strong>240.00<strong>
Explanation:</strong>Total maximum value of item
we can have is 240.00 from the given
capacity of sack. 
</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1&amp;title=Fractional%20Knapsack%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0AN%20%3D%203%2C%20W%20%3D%2050%0Avalues%5B%5D%20%3D%20%7B60%2C100%2C120%7D%0Aweight%5B%5D%20%3D%20%7B10%2C20%2C30%7D%0AOutput%3A%0A240.00%0AExplanation%3ATotal%20maximum%20value%20of%20item%0Awe%20can%20have%20is%20240.00%20from%20the%20given%0Acapacity%20of%20sack.%20%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>N = 2, W = 50
values[] = {60,100}
weight[] = {10,20}
<strong>Output:
</strong>160.00<strong>
Explanation:
</strong>Total maximum value of item
we can have is 160.00 from the given
capacity of sack.</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1&amp;title=Fractional%20Knapsack%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0AN%20%3D%202%2C%20W%20%3D%2050%0Avalues%5B%5D%20%3D%20%7B60%2C100%7D%0Aweight%5B%5D%20%3D%20%7B10%2C20%7D%0AOutput%3A%0A160.00%0AExplanation%3A%0ATotal%20maximum%20value%20of%20item%0Awe%20can%20have%20is%20160.00%20from%20the%20given%0Acapacity%20of%20sack." class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task</strong> :<br>
Complete the function&nbsp;<em><strong>fractionalKnapsack</strong>()</em> that receives maximum capacity , array of structure/class&nbsp;and size n and returns a double value representing the maximum value in knapsack.<br>
<strong>Note:&nbsp;</strong>The details of structure/class is defined in the comments above the given function.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity</strong> : O(NlogN)<br>
<strong>Expected Auxilliary Space</strong>: O(1)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N &lt;= 10<sup>5</sup><br>
1 &lt;= W &lt;= 10<sup>5</sup></span></p>
 <p></p>
            </div>