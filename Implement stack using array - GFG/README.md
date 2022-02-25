# Implement stack using array
## Easy
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Write a program to implement a Stack&nbsp;using Array. Your task is to use the class as shown in the comments in the code editor&nbsp;and complete&nbsp;the functions push() and pop() to implement a stack.&nbsp;</span></p>

<p><span style="font-size:18px"><strong>Example 1</strong>:</span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input</strong>: 
push(2)
push(3)
pop()
push(4) 
pop()
<strong>Output</strong>: 3, 4
<strong>Explanation</strong>: 
push(2)    the stack will be {2}
push(3)    the stack will be {2 3}
pop()      poped element will be 3,
&nbsp;          the stack will be {2}
push(4)    the stack will be {2 4}
pop()      poped element will be 4</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/implement-stack-using-array/1&amp;title=Implement%20stack%20using%20array%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%20%0Apush(2)%0Apush(3)%0Apop()%0Apush(4)%20%0Apop()%0AOutput%3A%203%2C%204%0AExplanation%3A%20%0Apush(2)%20%20%20%20the%20stack%20will%20be%20%7B2%7D%0Apush(3)%20%20%20%20the%20stack%20will%20be%20%7B2%203%7D%0Apop()%20%20%20%20%20%20poped%20element%20will%20be%203%2C%0A%C2%A0%20%20%20%20%20%20%20%20%20%20the%20stack%20will%20be%20%7B2%7D%0Apush(4)%20%20%20%20the%20stack%20will%20be%20%7B2%204%7D%0Apop()%20%20%20%20%20%20poped%20element%20will%20be%204" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input</strong>: 
pop()
push(4)
push(5)
pop()
<strong>Output</strong>: -1, 5</span>
</pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/implement-stack-using-array/1&amp;title=Implement%20stack%20using%20array%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%20%0Apop()%0Apush(4)%0Apush(5)%0Apop()%0AOutput%3A%20-1%2C%205%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You are required to complete two methods&nbsp;<strong>push() and pop(). </strong>The push() method&nbsp;takes one argument, an integer <strong>'x'</strong>&nbsp;to be pushed into the stack and&nbsp;<strong>pop()</strong>&nbsp;which returns an integer present at the top and popped out from the stack. If the stack is empty then return <strong>-1</strong> from the pop() method.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity</strong> : O(1) for both&nbsp;<strong>push()&nbsp;</strong>and&nbsp;<strong>pop()</strong>.</span><br>
<span style="font-size:18px"><strong>Expected Auixilliary Space </strong>: O(1) for both&nbsp;<strong>push()&nbsp;</strong>and&nbsp;<strong>pop()</strong>.</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= Q &lt;= 100<br>
1 &lt;= x &lt;= 100</span></p>
 <p></p>
            </div>