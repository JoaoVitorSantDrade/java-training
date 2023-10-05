package java_remember.Interfaces;

import java.util.List;

public interface IBuilding {
    
    public IBuilding setOccupants();
    public List<IAgent> getOccupants();
    public IBuilding setSite();
    public String getSite() throws Exception;

}
