package Builder.Q4;

public class Computer {
    private String cpu,gpu;
    private int ramGB,ssdGB;
    private Computer(Builder builder){
        this.cpu=builder.cpu;
        this.gpu=builder.gpu;
        this.ramGB=builder.ramGB;
        this.ssdGB=builder.ssdGB;
    }

    public int price(){
        int price=0;
        //CPU
        if("i5".equals(cpu))price+=8000;
        else if("i7".equals(cpu))price+=12000;
        else price+=0;
        
        //GPU
        if("RTX4060".equals(gpu))price+=10000;

        //RAM
        price+=ramGB*300;

        //SSD
        price+=ssdGB*2;
        
        return price;
        /*
        • 設計 class Computer，包含 cpu、ramGB、ssdGB、gpu。
        • 以 Builder 設定組件；若沒有設定 gpu，預設為 Integrated。
        • Computer 提供 price()：i5=8000, i7=12000, RAM 每 GB 300, SSD 每 GB 2, RTX4060=10000, Integrated=0。

        任務重點：使用 Builder 隱藏複雜建構細節，避免外部直接呼叫多參數 constructor。
        */
    }

    public String toString(){
        return String.format("Computer(cpu=%s, ramGB=%d, ssdGB=%d, gpu=%s)", cpu, ramGB, ssdGB, gpu);
    }
    
    public static class Builder{
        private String cpu,gpu="Integrated";
        private int ramGB,ssdGB;

        public Builder cpu(String cpu){
            this.cpu = cpu;
            return this;
        }

        public Builder gpu(String gpu){
            this.gpu=gpu;
            return this;
        }

        public Builder ramGB(int ramGB){
            this.ramGB=ramGB;
            return this;
        }

        public Builder ssdGB(int ssdGB){
            this.ssdGB=ssdGB;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
