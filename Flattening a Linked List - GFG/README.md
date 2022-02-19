# Flattening a Linked List
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a Linked List of size N, where every node represents a sub-linked-list and contains two pointers:<br>
(i) a<strong> next </strong>pointer to the next node,<br>
(ii) a<strong>&nbsp;bottom</strong>&nbsp;pointer&nbsp;to a linked list where this node is head.<br>
Each of the&nbsp;sub-linked-list is in sorted order.<br>
Flatten the Link List such that all the nodes appear in a single level while maintaining the sorted order.&nbsp;</span><br>
<span style="font-size:18px"><strong>Note:</strong> The flattened list will be printed using the bottom pointer instead of next pointer.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>5 -&gt; 10 -&gt; 19 -&gt; 28
|     |     |     | 
7     20    22   35
|           |     | 
8          50    40
|                 | 
30               45<strong>
Output: </strong>&nbsp;5-&gt; 7-&gt; 8- &gt; 10 -&gt; 19-&gt; 20-&gt;
22-&gt; 28-&gt; 30-&gt; 35-&gt; 40-&gt; 45-&gt; 50.
<strong>Explanation</strong>:
The resultant linked lists has every 
node in a single level.<strong>
</strong>(<strong>Note: </strong>| represents the bottom pointer.)</span>
</pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/flattening-a-linked-list/1&amp;title=Flattening%20a%20Linked%20List%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0A5%20-%3E%2010%20-%3E%2019%20-%3E%2028%0A%7C%20%20%20%20%20%7C%20%20%20%20%20%7C%20%20%20%20%20%7C%20%0A7%20%20%20%20%2020%20%20%20%2022%20%20%2035%0A%7C%20%20%20%20%20%20%20%20%20%20%20%7C%20%20%20%20%20%7C%20%0A8%20%20%20%20%20%20%20%20%20%2050%20%20%20%2040%0A%7C%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%7C%20%0A30%20%20%20%20%20%20%20%20%20%20%20%20%20%20%2045%0AOutput%3A%20%C2%A05-%3E%207-%3E%208-%20%3E%2010%20-%3E%2019-%3E%2020-%3E%0A22-%3E%2028-%3E%2030-%3E%2035-%3E%2040-%3E%2045-%3E%2050.%0AExplanation%3A%0AThe%20resultant%20linked%20lists%20has%20every%20%0Anode%20in%20a%20single%20level.%0A(Note%3A%20%7C%20represents%20the%20bottom%20pointer.)%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:</strong>
5 -&gt; 10 -&gt; 19 -&gt; 28
|          |                
7          22   
|          |                 
8          50 
|                           
30              
<strong>Output:</strong> 5-&gt;7-&gt;8-&gt;10-&gt;19-&gt;20-&gt;22-&gt;30-&gt;50
<strong>Explanation:</strong>
The resultant linked lists has every
node in a single level.

(<strong>Note: </strong>| represents the bottom pointer.)</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/flattening-a-linked-list/1&amp;title=Flattening%20a%20Linked%20List%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0A5%20-%3E%2010%20-%3E%2019%20-%3E%2028%0A%7C%20%20%20%20%20%20%20%20%20%20%7C%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%0A7%20%20%20%20%20%20%20%20%20%2022%20%20%20%0A%7C%20%20%20%20%20%20%20%20%20%20%7C%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%0A8%20%20%20%20%20%20%20%20%20%2050%20%0A%7C%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%0A30%20%20%20%20%20%20%20%20%20%20%20%20%20%20%0AOutput%3A%205-%3E7-%3E8-%3E10-%3E19-%3E20-%3E22-%3E30-%3E50%0AExplanation%3A%0AThe%20resultant%20linked%20lists%20has%20every%0Anode%20in%20a%20single%20level.%0A%0A(Note%3A%20%7C%20represents%20the%20bottom%20pointer.)" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You do not need to read input or print anything. Complete the function <strong>flatten()</strong></span><span style="font-size:18px"> that takes the&nbsp;<strong>head </strong>of the linked list as input&nbsp;parameter<strong> </strong>and returns the head of flattened link list.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N*M)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong></span><br>
<span style="font-size:18px">0 &lt;= N &lt;= 50<br>
1 &lt;=<strong> M<sub>i</sub> </strong>&lt;= 20<br>
1 &lt;= Element of linked list &lt;= 10<sup>3</sup></span></p>
 <p></p>
            </div>