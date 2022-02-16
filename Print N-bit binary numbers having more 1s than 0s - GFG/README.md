# Print N-bit binary numbers having more 1s than 0s
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a positive integer <strong>N</strong>, the task is to find all the N bit binary numbers having more than or equal 1’s than 0’s for any prefix of the number. </span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:</strong>  N = 2</span><span style="font-size:18px">
<strong>Output:</strong> 11 10
<strong>Explanation:</strong> </span><span style="font-size:18px">11 and 10 have more than 
or equal 1's than 0's</span>
</pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/print-n-bit-binary-numbers-having-more-1s-than-0s0252/1&amp;title=Print%20N-bit%20binary%20numbers%20having%20more%201s%20than%200s%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%20%20N%20%3D%202%0AOutput%3A%2011%2010%0AExplanation%3A%2011%20and%2010%20have%20more%20than%20%0Aor%20equal%201%2527s%20than%200%2527s%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:</strong>  N = 3
<strong>Output:</strong> 111 110 101
<strong>Explanation:</strong> 111, 110 and 101 have more 
than or equal 1's than 0's</span>
</pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/print-n-bit-binary-numbers-having-more-1s-than-0s0252/1&amp;title=Print%20N-bit%20binary%20numbers%20having%20more%201s%20than%200s%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%20%20N%20%3D%203%0AOutput%3A%20111%20110%20101%0AExplanation%3A%20111%2C%20110%20and%20101%20have%20more%20%0Athan%20or%20equal%201%2527s%20than%200%2527s%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>User Task:</strong><br>
Your task is to complete the function&nbsp;<strong>NBitBinary()&nbsp;</strong>which takes a single number as input and returns the list of strings in decreasing order. You need not take any input or print anything.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(|2<sup>N</sup>|)<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(2<sup>N</sup>)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N &lt;= 20</span></p>
 <p></p>
            </div>