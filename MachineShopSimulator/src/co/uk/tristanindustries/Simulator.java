package co.uk.tristanindustries;

public class Simulator {
	public void FrameLoop() {
		// calculate difference from startTime
			// set currentTime
		// foreach Job
			// updateJob(currentTime)
	}
	
	public Simulator() {
		// initialise
	}
	
	public void run() {
		// while true
		// FrameLoop()
	}
	
	public void initialise() {
		// read data
		// foreach machine read (in data)
			// add new machine to machineList
		// foreach job read (in data)
			// add new job to jobList
			// foreach task read (in data)
				// add new task to job
	}
	
	public void frameLoop() {
		// foreach job in unscheduledJobList
			// job.getMachineType()
				// foreach machine in machineList
					// if machine.type is correct
						// add machine to temp list
						// leastJobs = MAX_VAL
						// foreach machine in temp list
							// if job number < leastJobs
								// set leastJobs
						// foreach machine in temp list
							// if job number == leastJobs
								// add job to queue
			// remove job from unscheduledJobList
		
		// foreach machine in machineList
			
	}
	
	public static void main(String[] args) {
		// new instance
	}
}
