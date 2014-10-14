public class Job implements Runnable {
    private int jobNumber;
    
    /**
     * Single argument constructor for the Job class
     * 
     * @param    int jobNumber
     **/
    Job(int jobNumber) {
        this.jobNumber = jobNumber;
    }
    
    /**
     * Method to create a new Run thread
     */
    public void run() {
        // Undertake required work, here we will emulate it by sleep9ing for a period
        System.out.println("Job: " + jobNumber + " is being processed by thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep((int)(1000));
        } catch (InterruptedException e) {
            // no catching as example should not experience interruptions
        }
        System.out.println("Job: " + jobNumber + " is ending in thread: " + Thread.currentThread().getName());
    }
}
