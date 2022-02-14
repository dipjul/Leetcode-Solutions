class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m+1][n+1];
        
        for(int i = 1; i <= m; i++) {
            dp[i][1] = 1;
        }
        for(int i = 1; i <= n; i++) {
            dp[1][i] = 1;
        }
        for(int i = 2; i <= m; i++) {
            for(int j = 2; j <= n; j++) {
                dp[i][j] = dp[i][j-1]+dp[i-1][j];
            }
        }
        return dp[m][n];
        // if(m == 1 || n == 1)
        //     return 1;
        // int up = 0, left = 0;
        // if(m-1>=1)
        //     up = uniquePaths(m-1,n);
        // if(n-1>=1)
        //     left = uniquePaths(m,n-1);
        // return left + up;
    }
    
    
    
//     public int uniquePaths(int m, int n) {
//         Long result = 1l;
//         m--; n--;
//         for(int i = m + 1; i <= m + n; i++) {
//             result *= i;
//             result /= (i-m);
//         }
//         return result.intValue();
        
//     }
    
//     public int uniquePaths(int m, int n) {
//         int[][] dp = new int[m+1][n+1];
        
        
//         for(int i = 0; i <= m; i++) {
//             dp[i][0] = 0;
//         }
        
//         for(int i = 0; i <= n; i++) {
//             dp[0][i] = 0;
//         }
        
//         dp[1][1] = 1;
        
//         for(int i = 1; i <= m; i++) {
//             for(int j = 1; j <=n; j++) {
//                 dp[i][j] = dp[i-1][j] + dp[i][j-1];
//                 if(i == 1 && j == 1)
//                     dp[i][j] = 1;
//             }
//         }
        
//         return dp[m][n];
//     }
}

/*

m = 3, n = 2
| x|  |
| D|  |
| D|R |

D D R
D R D
- - -
(m+n)!/(m!n!)
(3+7)!/(3!7!)

(3+2)!/(3!2!)
m+1*m+2*..m+n/n!
*/