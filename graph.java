public class graph {
    public static HashMap<Integer, ArrayList<Integer>> createAdj(ArrayList<ArrayList<Integer>> edges) {
        // You are given a 2d arraylist of edges.
        // Create an adjacency list and return it.
        int n=5; //no of nodes
        HashMap<Integer, ArrayList<Integer>> adjList= new HashMap<>();
        //keys for each Value add empty arrayList
        for(int i=1;i<=n;i++){
            adjList.put(i,new ArrayList<>());
        }
        //go through ecah of the list
        for(ArrayList<Integer>edge:edges){
            int u=edge.get(0);
            int v=edge.get(1);
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        return adjList;    
    } 
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(1);
        temp.add(2);
        edges.add(temp);
        temp = new ArrayList<>();
        temp.add(2);
        temp.add(3);
        edges.add(temp);
        temp = new ArrayList<>();
        temp.add(1);
        temp.add(3);
        edges.add(temp);
        temp = new ArrayList<>();
        temp.add(2);
        temp.add(4);
        edges.add(temp);
        temp = new ArrayList<>();
        temp.add(3);
        temp.add(4);
        edges.add(temp);
        temp = new ArrayList<>();
        temp.add(5);
        temp.add(4);
        edges.add(temp);
        HashMap<Integer, ArrayList<Integer>> result = createAdj(edges);
        for(int k: result.keySet()) {
            System.out.print(k + ": ");
            for(int v: result.get(k)) {
                System.out.print(v+ " ");
            }
            System.out.println();
        }
    }
}
/*Output
1: 2 3 
2: 1 3 4 
3: 2 1 4 
4: 2 3 5 
5: 4 
*/
