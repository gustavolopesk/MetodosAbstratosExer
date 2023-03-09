package entities;

public class Individual extends Taxpayer{

    private Double healtExpenditures;

    public Individual(){

    }

    public Individual(String name, Double anuallncome, Double healtExpenditures) {
        super(name, anuallncome);
        this.healtExpenditures = healtExpenditures;
    }

    public Double getHealtExpenditures() {
        return healtExpenditures;
    }

    public void setHealtExpenditures(Double healtExpenditures) {
        this.healtExpenditures = healtExpenditures;
    }

    @Override
    public double tax() {
        double basicTax = (getAnuallncome() < 20000.0) ? getAnuallncome() * 0.15 : getAnuallncome() * 0.25;
        basicTax -= getHealtExpenditures() * 0.5;
        if (basicTax < 0.0) {
        basicTax = 0.0;
    }
        return basicTax;
    }
}
