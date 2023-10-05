package java_remember.Abstracts;

import java.util.Date;
import java.util.Objects;

import java_remember.Interfaces.IAgent;
import java_remember.Interfaces.IBuilding;


public abstract class Worker implements IAgent  {

    private Double Salary = 0d;
    private Date StartDate = null;
    private Date TerminationDate = null;
    private Long ID = 0l;
    private String Name = null;
    private IBuilding Home = null;
    private IBuilding Location = null;

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
    public long getID() throws Exception{
        if(this.ID.equals(0l)){
            throw new Exception("Nao tem ID");
        }
        return this.ID;
    }
    @Override
    public String getName() throws Exception {
        if(Objects.equals(this.Name, null)){
            throw new Exception("Nao tem Nome");
        }
        return this.Name;
    }
    @Override
    public IAgent setHome(IBuilding home) throws Exception{
        if(!Objects.equals(this.Home, null)){
            throw new Exception("Ja foi especificado um Home");
        }
        this.Home = home;
        return this;
        
    }
    @Override
    public IBuilding getHome() throws Exception {
        if(Objects.equals(this.Home, null)){
            throw new Exception("Nao foi especificado um Home");
        }
        return this.Home;
    }
    public IAgent setLocation(IBuilding home) throws Exception{
        if(!Objects.equals(this.Location, null)){
            throw new Exception("Ja foi especificado um Location");
        }
        this.Home = home;
        return this;
        
    }
    
    public IBuilding getLocation() throws Exception {
        if(Objects.equals(this.Location, null)){
            throw new Exception("Nao foi especificado um Location");
        }
        return this.Home;
    }
}
