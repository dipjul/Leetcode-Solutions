# Allocate minimum number of pages
## Hard 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">You are given <strong>N </strong>number of books. Every <strong>ith</strong> book has<strong> Ai</strong> number of pages.<br>
<br>
You have to allocate contagious books to <strong>M </strong>number of students. There can be many ways or permutations to do so. In each permutation, one of the M students will be allocated the maximum number of pages. Out of all these permutations, the task is to find that particular permutation in which the maximum number of pages allocated to a student is the minimum of those in all the other permutations and print this minimum value.</span></p>

<p><span style="font-size:18px">Each book will be allocated to exactly one student. Each student has to be allocated at least one book.</span></p>

<p><span style="font-size:18px">Note: Return <strong>-1</strong> if a valid assignment is not possible, and allotment should be in contiguous order (see the explanation for better understanding).</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>N = 4
A[] = {12,34,67,90}
M = 2
<strong>Output:</strong>113
<strong>Explanation:</strong>Allocation can be done in 
following ways:{12} and {34, 67, 90} 
Maximum Pages = 191{12, 34} and {67, 90} 
Maximum Pages = 157{12, 34, 67} and {90} 
Maximum Pages =113. Therefore, the minimum 
of these cases is 113, which is selected 
as the output.</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1/&amp;title=Allocate%20minimum%20number%20of%20pages%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0AN%20%3D%204%0AA%5B%5D%20%3D%20%7B12%2C34%2C67%2C90%7D%0AM%20%3D%202%0AOutput%3A113%0AExplanation%3AAllocation%20can%20be%20done%20in%20%0Afollowing%20ways%3A%7B12%7D%20and%20%7B34%2C%2067%2C%2090%7D%20%0AMaximum%20Pages%20%3D%20191%7B12%2C%2034%7D%20and%20%7B67%2C%2090%7D%20%0AMaximum%20Pages%20%3D%20157%7B12%2C%2034%2C%2067%7D%20and%20%7B90%7D%20%0AMaximum%20Pages%20%3D113.%20Therefore%2C%20the%20minimum%20%0Aof%20these%20cases%20is%20113%2C%20which%20is%20selected%20%0Aas%20the%20output." class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>N = 3
A[] = {15,17,20}
M = 2
<strong>Output:</strong>32
<strong>Explanation: </strong>Allocation is done as
{15,17} and {20}</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1/&amp;title=Allocate%20minimum%20number%20of%20pages%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0AN%20%3D%203%0AA%5B%5D%20%3D%20%7B15%2C17%2C20%7D%0AM%20%3D%202%0AOutput%3A32%0AExplanation%3A%20Allocation%20is%20done%20as%0A%7B15%2C17%7D%20and%20%7B20%7D" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function findPages() which takes 2 Integers <strong>N</strong>, and m and an array <strong>A[]</strong> of length <strong>N</strong> as input and returns the expected answer.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity</strong>: O(NlogN)<br>
<strong>Expected Auxilliary Space:</strong> O(1)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N &lt;= 10<sup>5</sup><br>
1 &lt;= A [ i ] &lt;= 10<sup>6</sup><br>
1 &lt;= M &lt;= 10<sup>5</sup></span></p>

<p>&nbsp;</p>
 <p></p>
            </div>