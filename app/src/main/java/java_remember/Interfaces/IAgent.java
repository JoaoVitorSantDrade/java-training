package java_remember.Interfaces;

public interface IAgent {
    
    public long getID() throws Exception;
    public String getName() throws Exception;
    public IAgent setHome(IBuilding home) throws Exception;
    public IBuilding getHome() throws Exception;   
}
