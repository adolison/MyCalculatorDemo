package hbcu.stay.ready.ttime;

public class Scientific extends Display{
    private double memory;
    //private double i;

    public Scientific(){
        memory = 0;
    }

    public Scientific(double memory){
        this.memory = memory;
    }

    public double sine(){
        memory = Math.sin(memory);
        return memory;
    }
    public double cosine(){
        memory = Math.cos(memory);
        return memory;
    }
    public double tangent(){
        memory = Math.tan(memory);
        return memory;
    }
    public double aSine(){
        memory = Math.asin(memory);
        return memory;
    }
    public double aCosine(){
        memory = Math.acos(memory);
        return memory;
    }
    public double aTangent(){
        memory = Math.atan(memory);
        return memory;
    }
    public double log(){
        memory = Math.log10(memory);
        return memory;
    }
    public double inverseLog(){
        memory = Math.pow(10,memory);
        return memory;
    }
    public double naturalLog(){
        memory = Math.log(memory);
        return memory;
    }
    public double inverseNaturalLog(){
        memory = Math.exp(memory);
        return memory;
    }
    public double factorial(){
        for (double i=memory-1;i>1;i--){
            memory *=i;
        }
        return memory;
    }

   /* public double switchUnitsMode() {
        //double i;
        if (i % 2 == 0) {
            memory = Math.toDegrees(memory);
            i++;
        } else{
            memory = Math.toRadians(memory);
            i++;
            System.out.println(memory);
            }
        return memory;
    }*/
    public double clearMemory(){
        memory = 0;
        return memory;
    }
}
