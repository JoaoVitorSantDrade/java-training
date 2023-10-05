package java_remember.Interfaces;

public interface IAgent {
    
    public long getID();
    public String getName();
    public IAgent setHome(IBuilding home);
    public IBuilding getHome() throws Exception;   
}
