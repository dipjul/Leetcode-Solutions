# Implement Queue using array
## Easy
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Implement a Queue using an Array. Queries in the Queue are of the following type:<br>
<strong>(i)</strong>&nbsp;1 x&nbsp; &nbsp;(a query of this type means&nbsp;&nbsp;pushing&nbsp;<strong>'x'</strong>&nbsp;into the queue)<br>
<strong>(ii)</strong>&nbsp;2 &nbsp; &nbsp; (a query of this type means to pop&nbsp;element from queue and print the poped element)</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>Q = 5
Queries = 1 2 1 3 2 1 4 2
<strong>Output: </strong>2&nbsp;3<strong>
Explanation:
</strong>In the first test case for query&nbsp;
1 2 the queue will be {2}
1 3 the queue will be {2 3}
2 &nbsp; poped element will be 2 the 
    queue will be {3}
1 4 the queue will be {3 4}
2 &nbsp; poped element will be 3&nbsp;</span>
</pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background: rgb(15, 37, 51); padding: 5px; border-radius: 0px 0px 5px 5px; display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/implement-queue-using-array/1&amp;title=Implement%20Queue%20using%20array%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0AQ%20%3D%205%0AQueries%20%3D%201%202%201%203%202%201%204%202%0AOutput%3A%202%C2%A03%0AExplanation%3A%0AIn%20the%20first%20test%20case%20for%20query%C2%A0%0A1%202%20the%20queue%20will%20be%20%7B2%7D%0A1%203%20the%20queue%20will%20be%20%7B2%203%7D%0A2%20%C2%A0%20poped%20element%20will%20be%202%20the%20%0A%20%20%20%20queue%20will%20be%20%7B3%7D%0A1%204%20the%20queue%20will%20be%20%7B3%204%7D%0A2%20%C2%A0%20poped%20element%20will%20be%203%C2%A0%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>Q = 4
Queries = 1 3 2 2 1 4 &nbsp; 
<strong>Output: </strong>3 -1<strong>
Explanation:
</strong>In the second testcase for query&nbsp;
1 3 the queue will be {3}
2&nbsp; &nbsp;poped element will be 3 the
&nbsp;   queue will be empty
2&nbsp; &nbsp;there is no element in the
&nbsp;   queue and hence -1
1 4 the queue will be {4}.&nbsp;</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/implement-queue-using-array/1&amp;title=Implement%20Queue%20using%20array%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0AQ%20%3D%204%0AQueries%20%3D%201%203%202%202%201%204%20%C2%A0%20%0AOutput%3A%203%20-1%0AExplanation%3A%0AIn%20the%20second%20testcase%20for%20query%C2%A0%0A1%203%20the%20queue%20will%20be%20%7B3%7D%0A2%C2%A0%20%C2%A0poped%20element%20will%20be%203%20the%0A%C2%A0%20%20%20queue%20will%20be%20empty%0A2%C2%A0%20%C2%A0there%20is%20no%20element%20in%20the%0A%C2%A0%20%20%20queue%20and%20hence%20-1%0A1%204%20the%20queue%20will%20be%20%7B4%7D.%C2%A0" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Your Task :</strong><br>
You are required to complete the two methods&nbsp;<strong>push()</strong>&nbsp;which take one argument an integer&nbsp;<strong>'x'</strong>&nbsp;to be pushed into the queue&nbsp;and&nbsp;<strong>pop()</strong>&nbsp;which <strong>returns </strong>a <strong>integer&nbsp;</strong>poped out from othe queue. If the queue is empty, it should return -1 on a pop operation.&nbsp;</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(1) for both&nbsp;<strong>push()&nbsp;</strong>and&nbsp;<strong>pop()</strong>.<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(1) for both&nbsp;<strong>push()&nbsp;</strong>and&nbsp;<strong>pop()</strong>.</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ Q ≤ 10<sup>5</sup><br>
1 ≤ x<strong> </strong>≤ 10<sup>5</sup></span></p>
 <p></p>
            </div>