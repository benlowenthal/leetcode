class Solution {
    public String simplifyPath(String path) {
        String[] dirs = path.split("/+");
        Stack<String> stk = new Stack<>();
        
        //stack appropriate dir names
        for (int i = 0; i < dirs.length; i++) {
            if (dirs[i].equals("..") && !stk.empty())
                stk.pop();
            else if (!dirs[i].equals("..") && !dirs[i].equals(".") && !dirs[i].equals(""))
                stk.push(dirs[i]);
        }
        
        //join dir array into string
        StringBuilder sb = new StringBuilder();
        List<String> strs = new ArrayList<>();
        
        while (!stk.empty()) strs.add(stk.pop());
        for (int x = strs.size() - 1; x >= 0; x--) {
            sb.append("/");
            sb.append(strs.get(x));
        }
        
        return (sb.length() == 0) ? "/" : sb.toString();
    }
}