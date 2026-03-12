import java.util.*;

class Solution {

    class DSU {
        int[] p, r;
        DSU(int n){
            p = new int[n];
            r = new int[n];
            for(int i=0;i<n;i++) p[i]=i;
        }
        int find(int x){
            if(p[x]!=x) p[x]=find(p[x]);
            return p[x];
        }
        boolean union(int a,int b){
            int pa=find(a), pb=find(b);
            if(pa==pb) return false;
            if(r[pa]<r[pb]) p[pa]=pb;
            else if(r[pb]<r[pa]) p[pb]=pa;
            else{ p[pb]=pa; r[pa]++; }
            return true;
        }
    }

    public int maxStability(int n, int[][] edges, int k) {
        int lo = 0, hi = 2000000000, ans = -1;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(check(n, edges, k, mid)){
                ans = mid;
                lo = mid + 1;
            }else hi = mid - 1;
        }
        return ans;
    }

    boolean check(int n, int[][] edges, int k, int x){
        DSU dsu = new DSU(n);
        int upgrades = 0, used = 0;

        for(int[] e: edges){
            if(e[3]==1){
                if(e[2] < x) return false;
                if(!dsu.union(e[0],e[1])) return false;
                used++;
            }
        }

        List<int[]> opt = new ArrayList<>();
        for(int[] e: edges) if(e[3]==0) opt.add(e);

        opt.sort((a,b)->b[2]-a[2]);

        for(int[] e: opt){
            if(used == n-1) break;
            int u=e[0], v=e[1], s=e[2];
            if(dsu.find(u)==dsu.find(v)) continue;

            if(s >= x){
                dsu.union(u,v);
                used++;
            }else if(s*2 >= x && upgrades < k){
                upgrades++;
                dsu.union(u,v);
                used++;
            }
        }

        return used == n-1;
    }
}