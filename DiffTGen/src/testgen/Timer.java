package testgen;

public class Timer
{
    long start_time;
    long end_time;

    public Timer() {
	start_time = 0l;
	end_time = 0l;
    }

    public void reset() {
	start_time = 0l;
	end_time = 0l;
    }

    public void start() {
	start_time = System.currentTimeMillis();
    }

    public void end() {
	end_time = System.currentTimeMillis();
    }

    public boolean isReset() {
	return ((start_time==0l) && (end_time==0l));
    }
    
    public long getDurationInMillis() {
	return end_time - start_time;
    }
}
