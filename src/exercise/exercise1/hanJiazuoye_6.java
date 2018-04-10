package exercise.exercise1;

public class hanJiazuoye_6 {
    static boolean[] v = new boolean[14];
    static int[] rs = new int[14];
    static int count = 0;

    public static void Dfs(int cur) {

        if(cur == 14) {
            if(check()) {
                count++;
            }

        }
        for(int i = 1; i<=13; i++) {
            if(v[i]==false) {
                v[i] = true;
                rs[cur] = i;
                Dfs(cur+1);
                v[i] = false;
            }
        }
    }

    public static boolean check() {
        if(rs[1] + rs[2] == rs[3]&&rs[4]-rs[5]==rs[6]
                &&rs[7]*rs[8]==rs[9]&&rs[11]*rs[12]==rs[10]) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Dfs(1);
        System.out.println(count);
    }


}