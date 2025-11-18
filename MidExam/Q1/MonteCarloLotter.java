package Q1;

public class MonteCarloLotter {
    private Sampling sampling = new Sampling();
    private Event event = new Event();

    public double estimate(long n){
        long count = 0;

        for(int i = 0; i < n; i++){
            Sample lottery = sampling.genSample();
            Sample player = sampling.genSample();

            if(event.checkEvent(lottery, player)){
                count++;
            }
        }

        return (double)count/n;
    }
}

