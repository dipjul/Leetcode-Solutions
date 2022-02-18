# N meetings in one room
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">There is <strong>one</strong> meeting room in a firm. There are <strong>N</strong> meetings in the form of <strong>(start[i], end[i])</strong> where <strong>start[i]&nbsp;</strong>is start time of meeting <strong>i </strong>and <strong>end[i] </strong>is finish time of meeting <strong>i.</strong><br>
What is the <strong>maximum</strong> number of meetings that can be accommodated in the meeting room when only one meeting can be held in the meeting room at a particular time? </span></p>

<p><span style="font-size:18px"><strong>Note:</strong>&nbsp;Start time of one chosen meeting can't be equal to the end time of the other chosen meeting.</span></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>N = 6
start[] = {1,3,0,5,8,5}
end[] =  {2,4,6,7,9,9}
<strong>Output: </strong>
4<strong>
Explanation:
</strong>Maximum four meetings can be held with
given start and end timings.</span>
<span style="font-size:18px">The meetings are - (1, 2),(3, 4), (5,7) and (8,9)</span>
</pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1&amp;title=N%20meetings%20in%20one%20room%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0AN%20%3D%206%0Astart%5B%5D%20%3D%20%7B1%2C3%2C0%2C5%2C8%2C5%7D%0Aend%5B%5D%20%3D%20%20%7B2%2C4%2C6%2C7%2C9%2C9%7D%0AOutput%3A%20%0A4%0AExplanation%3A%0AMaximum%20four%20meetings%20can%20be%20held%20with%0Agiven%20start%20and%20end%20timings.%0AThe%20meetings%20are%20-%20(1%2C%202)%2C(3%2C%204)%2C%20(5%2C7)%20and%20(8%2C9)%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
N</strong> = 3
<strong>start[]</strong> = {10, 12, 20}
<strong>end[]</strong> = {20, 25, 30}
<strong>Output: </strong>
1<strong>
Explanation:
</strong>Only one&nbsp;meetings can be held
with given start and end timings.</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1&amp;title=N%20meetings%20in%20one%20room%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0AN%20%3D%203%0Astart%5B%5D%20%3D%20%7B10%2C%2012%2C%2020%7D%0Aend%5B%5D%20%3D%20%7B20%2C%2025%2C%2030%7D%0AOutput%3A%20%0A1%0AExplanation%3A%0AOnly%20one%C2%A0meetings%20can%20be%20held%0Awith%20given%20start%20and%20end%20timings." class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><br>
<span style="font-size:18px"><strong>Your Task</strong>&nbsp;:<br>
You don't need to read inputs or print anything. Complete the function <strong>maxMeetings()</strong><em>&nbsp;</em>that takes two&nbsp;arrays <strong>start[] </strong>and <strong>end[] </strong>along with their size <strong>N</strong> as input parameters and returns the <strong>maximum</strong> number of meetings that can be held in the meeting room.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity </strong>: O(N*LogN)</span><br>
<span style="font-size:18px"><strong>Expected Auxilliary Space</strong> : O(N)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong></span><br>
<span style="font-size:18px">1 ≤ N&nbsp;≤ 10<sup>5</sup></span><br>
<span style="font-size:18px">0 ≤ <strong>star</strong>t<strong>[i]</strong> &lt; <strong>end[i]</strong>&nbsp;≤ 10<sup>5</sup></span></p>
 <p></p>
            </div>