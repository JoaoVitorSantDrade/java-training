package java_remember.Interfaces;

import java.util.List;

public interface IBuilding {
    
    public IBuilding addOccupant(IAgent args);
    public List<IAgent> getOccupants();
    public IBuilding setSite(String site);
    public String getSite();
    public IBuilding setName(String name);
    public String getName();

}
