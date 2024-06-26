class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer,Integer> lose = new HashMap<>();
        Set<Integer> players = new HashSet<>();
        for(int[] match: matches) {
            players.add(match[0]);
            players.add(match[1]);
            lose.put(match[1], lose.getOrDefault(match[1],0)+1);
        }
        List<Integer> noLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();
        
        for(int player: players){
            if(!lose.containsKey(player)) {
                noLoss.add(player);
            } else if(lose.get(player) == 1) {
                oneLoss.add(player);
            }
        }
        Collections.sort(noLoss);
        Collections.sort(oneLoss);
        res.add(noLoss);
        res.add(oneLoss);
        return res;
    }
}
