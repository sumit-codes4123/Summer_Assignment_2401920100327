class Solution {
public:
    int strStr(string h, string ne) {
        int n=h.size(),m=ne.size();
        if(n<m)return -1;
        for(int i=0;i<n-m;i++){
            if(h.substr(i,m)==ne)return i;
        }return -1;
    }
};