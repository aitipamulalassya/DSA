class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Map<String, List<String>> graph = new HashMap<>();
        int n = recipes.length;
        Map<String, Integer> in = new HashMap<>();
        for(int i = 0; i < n; i++){
            String t = recipes[i];
            List<String> l = ingredients.get(i);
            graph.putIfAbsent(t, new ArrayList<>());
            for(String s: l){
                graph.putIfAbsent(s, new ArrayList<>());
                graph.get(s).add(t);
                in.put(t, in.getOrDefault(t, 0)+1);
            }
        }
        Queue<String> q = new LinkedList<>();
        for(String s: supplies){
            if(!in.containsKey(s)){
                q.add(s);
            }
        }
        Set<String>  set = new HashSet<>();
        while(!q.isEmpty()){
            String u = q.remove();
            if(!graph.containsKey(u)){
                continue;
            }
            if(in.containsKey(u)){
                set.add(u);
            }
            for(String v: graph.get(u)){
                if(in.get(v) > 0){
                    in.put(v, in.get(v)-1);
                    if(in.get(v) == 0){
                        q.add(v);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}