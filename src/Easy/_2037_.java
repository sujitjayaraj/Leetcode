package Easy;

import java.util.Arrays;

class _2037_
{
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int moves = 0;

        for (int i = 0; i < seats.length; i++)
            moves += Math.abs(seats[i] - students[i]);

        return moves;
    }
}