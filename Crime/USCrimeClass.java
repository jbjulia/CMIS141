package projects.cmis141.crime;

/**
 * @author jbjulia
 */
public class USCrimeClass {

    // Variable declaration
    private int year;
    private int population;
    private int violentCrimes;
    private float violentCrimeRates;
    private int murders;
    private float murderRates;
    private int rape;
    private float rapeRate;
    private int robbery;
    private float robberyRate;
    private int aggravatedAssault;
    private float aggravatedAssaultRate;
    private int propertyCrime;
    private float propertyCrimeRate;
    private int burglary;
    private float burglaryRate;
    private int larcenyTheft;
    private float larcenyTheftRate;
    private int vehicleTheft;
    private float vehicleTheftRate;

    // Set variable values
    public USCrimeClass(String line) {
        String[] data = line.split(",");
        this.year = Integer.parseInt(data[0]);
        this.population = Integer.parseInt(data[1]);
        this.violentCrimes = Integer.parseInt(data[2]);
        this.violentCrimeRates = Float.parseFloat(data[3]);
        this.murders = Integer.parseInt(data[4]);
        this.murderRates = Float.parseFloat(data[5]);
        this.rape = Integer.parseInt(data[6]);
        this.rapeRate = Float.parseFloat(data[7]);
        this.robbery = Integer.parseInt(data[8]);
        this.robberyRate = Float.parseFloat(data[9]);
        this.aggravatedAssault = Integer.parseInt(data[10]);
        this.aggravatedAssaultRate = Float.parseFloat(data[11]);
        this.propertyCrime = Integer.parseInt(data[12]);
        this.propertyCrimeRate = Float.parseFloat(data[13]);
        this.burglary = Integer.parseInt(data[14]);
        this.burglaryRate = Float.parseFloat(data[15]);
        this.larcenyTheft = Integer.parseInt(data[16]);
        this.larcenyTheftRate = Float.parseFloat(data[17]);
        this.vehicleTheft = Integer.parseInt(data[18]);
        this.vehicleTheftRate = Float.parseFloat(data[19]);
    }

    // Getters for variables
    public int getYear() {
        return year;
    }

    public int getPopulation() {
        return population;
    }

    public int getViolentCrimes() {
        return violentCrimes;
    }

    public float getViolentCrimeRates() {
        return violentCrimeRates;
    }

    public int getMurders() {
        return murders;
    }

    public float getMurderRates() {
        return murderRates;
    }

    public int getRape() {
        return rape;
    }

    public float getRapeRate() {
        return rapeRate;
    }

    public int getRobbery() {
        return robbery;
    }

    public float getRobberyRate() {
        return robberyRate;
    }

    public int getAggravatedAssault() {
        return aggravatedAssault;
    }

    public float getAggravatedAssaultRate() {
        return aggravatedAssaultRate;
    }

    public int getPropertyCrime() {
        return propertyCrime;
    }

    public float getPropertyCrimeRate() {
        return propertyCrimeRate;
    }

    public int getBurglary() {
        return burglary;
    }

    public float getBurglaryRate() {
        return burglaryRate;
    }

    public int getLarcenyTheft() {
        return larcenyTheft;
    }

    public float getLarcenyTheftRate() {
        return larcenyTheftRate;
    }

    public int getVehicleTheft() {
        return vehicleTheft;
    }

    public float getVehicleTheftRate() {
        return vehicleTheftRate;
    }
}
