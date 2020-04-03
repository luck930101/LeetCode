import java.util.Arrays;

public class MeetingRoomsII {
	public int minMeetingRooms(int[][] intervals) {
        /*
        Checking how many meetings begin before the earliest-ended meeting ends.
        For eg:
        Starts 1,5,6,9,10
        Ends 8,11,12,13,14
        so meeting 1,5,6 start before first meeting ends at 8 so we need 3 rooms.
        For 9 and 8 we just move i++ and endsItr++ ( think of as it took the spot of the meeting ended at 8.)
        then for 10 and 11.. all previous rooms are occupied and one of them ends after 10... so we need a room for a meeting starting at 10
        so total 4 rooms
        */
        int [] starts = new int[intervals.length];
        int [] ends = new int[intervals.length];
        
        for(int i = 0;i<intervals.length;i++){
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }
        
        Arrays.sort(starts);
        Arrays.sort(ends);
        int rooms = 0;
        int endindex = 0;
        
        for(int i = 0;i<intervals.length;i++){
            if(starts[i]<ends[endindex]){
                rooms++;
            }
            else{
                endindex++;
            }
        }
        
        return rooms;
    }
}
