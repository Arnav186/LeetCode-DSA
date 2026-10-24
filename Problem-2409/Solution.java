class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        String start;
        String end;

        if (arriveAlice.compareTo(arriveBob) > 0) {
            start = arriveAlice;
        } else {
            start = arriveBob;
        }

        if (leaveAlice.compareTo(leaveBob) < 0) {
            end = leaveAlice;
        } else {
            end = leaveBob;
        }

        if (start.compareTo(end) > 0) {
            return 0;
        }

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int count = 0;
        String current = start;

        while (current.compareTo(end) <= 0) {
            count++;

            int month = Integer.parseInt(current.substring(0, 2));
            int day = Integer.parseInt(current.substring(3, 5));

            if (day < days[month - 1]) {
                day++;
            } else {
                month++;
                day = 1;
            }

            current = String.format("%02d-%02d", month, day);
        }

        return count;
    }
}
