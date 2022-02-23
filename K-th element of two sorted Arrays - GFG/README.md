# K-th element of two sorted Arrays
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given two sorted arrays <strong>arr1</strong> and <strong>arr2</strong> of size <strong>N</strong>&nbsp;and <strong>M</strong>&nbsp;respectively and an element <strong>K</strong>. The task is to find the element that would be at the k’th position of the final sorted array.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:</strong>
arr1[] = {2, 3, 6, 7, 9}
arr2[] = {1, 4, 8, 10}
k = 5
<strong>Output:</strong>
6
<strong>Explanation:</strong>
The final sorted array would be -
1, 2, 3, 4, 6, 7, 8, 9, 10
The 5th element of this array is 6.
</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background: rgb(15, 37, 51); padding: 5px; border-radius: 0px 0px 5px 5px; display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1&amp;title=K-th%20element%20of%20two%20sorted%20Arrays%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0Aarr1%5B%5D%20%3D%20%7B2%2C%203%2C%206%2C%207%2C%209%7D%0Aarr2%5B%5D%20%3D%20%7B1%2C%204%2C%208%2C%2010%7D%0Ak%20%3D%205%0AOutput%3A%0A6%0AExplanation%3A%0AThe%20final%20sorted%20array%20would%20be%20-%0A1%2C%202%2C%203%2C%204%2C%206%2C%207%2C%208%2C%209%2C%2010%0AThe%205th%20element%20of%20this%20array%20is%206.%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<div><span style="font-size:18px"><strong>Example 2:</strong></span></div>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:</strong>
arr1[] = {100, 112, 256, 349, 770}
arr2[] = {72, 86, 113, 119, 265, 445, 892}
k = 7
<strong>Output:</strong>
256
<strong>Explanation:</strong>
Final sorted array is - 72, 86, 100, 112,
113, 119, 256, 265, 349, 445, 770, 892
7th element of this array is 256.</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1&amp;title=K-th%20element%20of%20two%20sorted%20Arrays%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0Aarr1%5B%5D%20%3D%20%7B100%2C%20112%2C%20256%2C%20349%2C%20770%7D%0Aarr2%5B%5D%20%3D%20%7B72%2C%2086%2C%20113%2C%20119%2C%20265%2C%20445%2C%20892%7D%0Ak%20%3D%207%0AOutput%3A%0A256%0AExplanation%3A%0AFinal%20sorted%20array%20is%20-%2072%2C%2086%2C%20100%2C%20112%2C%0A113%2C%20119%2C%20256%2C%20265%2C%20349%2C%20445%2C%20770%2C%20892%0A7th%20element%20of%20this%20array%20is%20256." class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><br>
<span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>kthElement()</strong>&nbsp;which takes the arrays <strong>arr1[]</strong>,&nbsp;<strong>arr2[]</strong>, its size <strong>N </strong>and <strong>M </strong>respectively and an integer <strong>K </strong>as inputs and returns the element at the Kth position.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(Log(N) + Log(M))<br>
<strong>Expected Auxiliary Space:</strong> O(Log (N))</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N, M &lt;= 10<sup>6</sup><br>
1 &lt;= arr1<sub>i</sub>, arr2<sub>i</sub> &lt;&nbsp;INT_MAX<br>
1 &lt;= K &lt;= N+M</span></p>
 <p></p>
            </div>