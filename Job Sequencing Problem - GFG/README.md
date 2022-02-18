# Job Sequencing Problem
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a set of <strong>N</strong> jobs where each <strong>job<sub>i</sub></strong>&nbsp;has a deadline and profit associated with it. </span></p>

<p><span style="font-size:18px">Each job takes <strong><em>1</em></strong> unit of time to complete and only one job can be scheduled at a time. We earn the profit associated with job if and only if the job is completed by its deadline. </span></p>

<p><span style="font-size:18px">Find the number of jobs done and the&nbsp;<strong>maximum profit</strong>.</span></p>

<p><strong><span style="font-size:18px">Note: </span></strong><span style="font-size:18px">J</span><span style="font-size:18px">obs will be given in the form (Job<sub>id</sub>, Deadline,&nbsp;Profit) associated with that Job.</span></p>

<p><br>
<strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre style="margin-bottom: 0px;"><strong><span style="font-size:18px">Input:
</span></strong><span style="font-size:18px">N = 4
Jobs = {(1,4,20),(2,1,10),(3,1,40),(4,1,30)}
<strong>Output:
</strong>2 60<strong>
Explanation:
</strong>Job<sub>1</sub>&nbsp;and Job<sub>3 </sub>can be done with
maximum profit of 60 (20+40).</span>
</pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1%23&amp;title=Job%20Sequencing%20Problem%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0AN%20%3D%204%0AJobs%20%3D%20%7B(1%2C4%2C20)%2C(2%2C1%2C10)%2C(3%2C1%2C40)%2C(4%2C1%2C30)%7D%0AOutput%3A%0A2%2060%0AExplanation%3A%0AJob1%C2%A0and%20Job3%20can%20be%20done%20with%0Amaximum%20profit%20of%2060%20(20%2B40).%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre style="margin-bottom: 0px;"><strong><span style="font-size:18px">Input:
</span></strong><span style="font-size:18px">N = 5
Jobs = {(1,2,100),(2,1,19),(3,2,27),
&nbsp;       (4,1,25),(5,1,15)}
<strong>Output:
</strong>2 127<strong>
Explanation:
</strong>2 jobs can be done with
maximum profit of 127 (100+27).</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:10px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1%23&amp;title=Job%20Sequencing%20Problem%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0AN%20%3D%205%0AJobs%20%3D%20%7B(1%2C2%2C100)%2C(2%2C1%2C19)%2C(3%2C2%2C27)%2C%0A%C2%A0%20%20%20%20%20%20%20(4%2C1%2C25)%2C(5%2C1%2C15)%7D%0AOutput%3A%0A2%20127%0AExplanation%3A%0A2%20jobs%20can%20be%20done%20with%0Amaximum%20profit%20of%20127%20(100%2B27)." class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><br>
<span style="font-size:18px"><strong>Your Task</strong> :<br>
You don't need to read input or print anything. Your task is to complete the function <strong>JobScheduling()</strong> which takes an integer <strong>N</strong> and an array of Jobs(Job id, Deadline,&nbsp;Profit) as input and returns the count of jobs and maximum profit.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity</strong>: O(NlogN)<br>
<strong>Expected Auxilliary Space</strong>: O(N)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N &lt;= 10<sup>5</sup><br>
1 &lt;= Deadline &lt;= 100<br>
1 &lt;= Profit &lt;= 500</span></p>
 <p></p>
            </div>