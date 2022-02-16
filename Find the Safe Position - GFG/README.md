# Find the Safe Position
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">There are <strong>n</strong> people standing in a circle (<strong>numbered clockwise 1 to n</strong>) waiting to be executed. The counting begins at point <strong>1</strong> in the circle and proceeds around the circle in a fixed direction (<strong>clockwise</strong>). In each step, a certain number of people are skipped and the next person is executed. The elimination proceeds around the circle (which is becoming smaller and smaller as the executed people are removed), until only the last person remains, who is given <strong>freedom</strong>.<br>
Given the total number of persons <strong>n</strong> and a number <strong>k</strong> which indicates that <strong>k-1 </strong>persons are skipped and <strong>k<sup>th</sup></strong> person is killed in circle. The task is to choose the place in the initial circle so that you are the last one remaining and so survive.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px"><strong>n = </strong>2, <strong>k = </strong>1</span>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">2</span>
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">Here, n = 2 and k = 1, then safe position is
2 as the person at 1st position will be killed.</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/game-of-death-in-a-circle1840/1/&amp;title=Find%20the%20Safe%20Position%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0An%20%3D%202%2C%20k%20%3D%201%0AOutput%3A%0A2%0AExplanation%3A%0AHere%2C%20n%20%3D%202%20and%20k%20%3D%201%2C%20then%20safe%20position%20is%0A2%20as%20the%20person%20at%201st%20position%20will%20be%20killed." class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px"><strong>n = </strong>4, <strong>k = </strong>2</span>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">1</span>
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">The safe position is 1.
</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/game-of-death-in-a-circle1840/1/&amp;title=Find%20the%20Safe%20Position%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0An%20%3D%204%2C%20k%20%3D%202%0AOutput%3A%0A1%0AExplanation%3A%0AThe%20safe%20position%20is%201.%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>safePos()</strong> which takes an Integer n as input and returns the safe position.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(n)<br>
<strong>Expected Auxiliary Space:</strong> O(1)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong></span><br>
<span style="font-size:18px">1 &lt;= n,k &lt;= 10<sup>5</sup></span></p>
 <p></p>
            </div>