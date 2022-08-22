
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
       if (birdsPerDay.length > 0) {
            return birdsPerDay[birdsPerDay.length - 1];
        }
        return 0;
    }

    public void incrementTodaysCount() {
       birdsPerDay[birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
       for (int i : birdsPerDay) {
            if (i == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        if (numberOfDays > birdsPerDay.length) {
            numberOfDays = birdsPerDay.length;
        }
        for (int i = 0; i < numberOfDays; i++) {
            count += birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
        
    int busyDaysCount = 0;
        for (int i : birdsPerDay) {
            if (i >= 5) {
                busyDaysCount++;
            }
        }
        return busyDaysCount;
    }
}
