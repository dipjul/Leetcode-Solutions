[3,1,3,4,2]
## cycle detection:
0
f - nums[0] - 3
s - nums[0] - 3
1
f - nums[nums[3]] - 2
s - nums[3] - 4
2
f - nums[nums[2]] - 4
s - nums[4] - 2
3
f - nums[nums[4]] - 3
s - nums[2] - 3
**f == s : break (cycle found)**
​
## stating point of cycle
s - nums[0] = 3
f - 3
​
**s == f
ans : s or f**