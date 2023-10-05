package java_remember.Abstracts;

import java.util.Date;
import java.util.Objects;

import java_remember.Interfaces.IAgent;
import java_remember.Interfaces.IBuilding;


public abstract class Worker implements IAgent  {

    private Double Salary = null;
    private Date StartDate = null;
    private Date TerminationDate = null;
    private Long ID = null;
    private String Name = null;
    private IBuilding Home= null;

    public double getHourly() throws Exception {
        if (this.Salary.equals(0d)) {
            throw new Exception("Salary is yet to be specified");
        }
        return this.Salary;
    };
    public Worker setHourly(Double Salary) throws Exception {
        if (!this.Salary.equals(0d)) {
            throw new Exception("Salary is already specified");
        }
        this.Salary = Salary;
        return this;
    };
    public Date getStartDate() throws Exception{
        if(Objects.equals(this.StartDate, null)){
            throw new Exception("Nao tem StartDate");
        }
        return this.StartDate;
    };
    public Worker setStartDate(Date startDate) throws Exception{
        if(!Objects.equals(this.StartDate, null)){
            throw new Exception("Ja foi especificado um StartDate");
        }
        this.StartDate = startDate;
        return this;
    };
    public Date getTermination() throws Exception{
        if(Objects.equals(this.TerminationDate, null)){
            throw new Exception("Nao tem TerminationDate");
        }
        return this.TerminationDate;
    };
    public Worker setTermination(Date termination) throws Exception{
        if(!Objects.equals(this.TerminationDate, null)){
            throw new Exception("Ja foi especificado um TerminationDate");
        }
        this.TerminationDate = termination;
        return this;
    };
    @Override
    public long getID() { // Fazer o Throws abaixo
        return this.ID;
    }
    @Override
    public String getName() {
        return this.Name;
    }
    @Override
    public IAgent setHome(IBuilding home) {
        this.Home = home;
        return this;
        
    }
    @Override
    public IBuilding getHome() throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHome'");
    }
    
}
