package Hard;

import java.util.Arrays;
import java.util.PriorityQueue;

class _502_
{
    class Project implements Comparable<Project> {
        int capital, profit;

        Project(int capital, int profit) {
            this.capital = capital;
            this.profit = profit;
        }

        public int compareTo(Project p) {
            return this.capital - p.capital;
        }
    }

    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        Project[] projects = new Project[n];

        for (int i = 0; i < n; i++)
            projects[i] = new Project(capital[i], profits[i]);

        Arrays.sort(projects);
        PriorityQueue<Project> pq = new PriorityQueue<>(n, (x, y) -> y.profit - x.profit);
        int idx = 0;

        for (int i = 0; i < k; i++) {
            while (idx < n && projects[idx].capital <= w)
                pq.offer(projects[idx++]);

            if (pq.isEmpty())
                break;

            w += pq.poll().profit;
        }

        return w;
    }
}