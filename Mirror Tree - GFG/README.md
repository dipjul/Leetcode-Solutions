# Mirror Tree
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a Binary Tree, convert it into its mirror.<br>
<img alt="MirrorTree1" class="aligncenter size-full wp-image-663 img-responsive" src="https://contribute.geeksforgeeks.org/wp-content/uploads/mirrortrees.jpg" style="height:338px; width:591px" title="MirrorTree1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>      1
&nbsp;   /  \
&nbsp;  2    3
<strong>Output: </strong>3 1 2<strong>
Explanation: </strong>The tree is
&nbsp;&nbsp; 1&nbsp;&nbsp;  (mirror)  1
 /&nbsp;&nbsp;\&nbsp;&nbsp;  =&gt;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; /&nbsp; \
2&nbsp;&nbsp;&nbsp; 3&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 3&nbsp;&nbsp;  2
The inorder of mirror is 3 1 2</span>
</pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background: rgb(15, 37, 51); padding: 5px; border-radius: 0px 0px 5px 5px; display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/mirror-tree/1&amp;title=Mirror%20Tree%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0A%20%20%20%20%20%201%0A%C2%A0%20%20%20%2F%20%20%5C%0A%C2%A0%20%202%20%20%20%203%0AOutput%3A%203%201%202%0AExplanation%3A%20The%20tree%20is%0A%C2%A0%C2%A0%201%C2%A0%C2%A0%20%20(mirror)%20%201%0A%20%2F%C2%A0%C2%A0%5C%C2%A0%C2%A0%20%20%3D%3E%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%20%2F%C2%A0%20%5C%0A2%C2%A0%C2%A0%C2%A0%203%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%203%C2%A0%C2%A0%20%202%0AThe%20inorder%20of%20mirror%20is%203%201%202%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>      10
&nbsp;    /  \
&nbsp;   20   30
&nbsp;  /  \
&nbsp; 40  60
<strong>Output: </strong>30 10 60 20 40<strong>
Explanation: </strong>The tree is
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 10&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 10
&nbsp;&nbsp;  /&nbsp;&nbsp;&nbsp;&nbsp;\&nbsp;&nbsp;(mirror) /&nbsp;&nbsp;&nbsp; \
&nbsp;  20&nbsp;&nbsp;&nbsp; 30&nbsp;&nbsp;&nbsp; =&gt; &nbsp; 30&nbsp;&nbsp;&nbsp; 20
&nbsp; /&nbsp;&nbsp;\&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    /&nbsp;&nbsp;&nbsp;\
&nbsp;40&nbsp; 60&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 60&nbsp;&nbsp;&nbsp;40
The inroder traversal of mirror is
30 10 60 20 40.</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background: rgb(15, 37, 51); padding: 5px; border-radius: 0px 0px 5px 5px; display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/mirror-tree/1&amp;title=Mirror%20Tree%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0A%20%20%20%20%20%2010%0A%C2%A0%20%20%20%20%2F%20%20%5C%0A%C2%A0%20%20%2020%20%20%2030%0A%C2%A0%20%20%2F%20%20%5C%0A%C2%A0%2040%20%2060%0AOutput%3A%2030%2010%2060%2020%2040%0AExplanation%3A%20The%20tree%20is%0A%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%2010%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%2010%0A%C2%A0%C2%A0%20%20%2F%C2%A0%C2%A0%C2%A0%C2%A0%5C%C2%A0%C2%A0(mirror)%20%2F%C2%A0%C2%A0%C2%A0%20%5C%0A%C2%A0%20%2020%C2%A0%C2%A0%C2%A0%2030%C2%A0%C2%A0%C2%A0%20%3D%3E%20%C2%A0%2030%C2%A0%C2%A0%C2%A0%2020%0A%C2%A0%20%2F%C2%A0%C2%A0%5C%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%20%20%20%20%2F%C2%A0%C2%A0%C2%A0%5C%0A%C2%A040%C2%A0%2060%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%2060%C2%A0%C2%A0%C2%A040%0AThe%20inroder%20traversal%20of%20mirror%20is%0A30%2010%2060%2020%2040." class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
Just complete the <strong>function mirror()&nbsp;</strong>that takes <strong>node </strong>as <strong>paramter&nbsp; </strong>and convert it into its mirror. The printing is done by the driver code only.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N).<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(Height of the Tree).</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ Number of nodes ≤ 10<sup>5</sup><br>
1 ≤ Data of a node ≤ 10<sup>5</sup></span></p>
 <p></p>
            </div>