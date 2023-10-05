package java_remember.Abstracts;

import java.util.ArrayList;
import java.util.List;

import java_remember.Interfaces.IAgent;
import java_remember.Interfaces.IBuilding;

public abstract class Building implements IBuilding {

    private List<IAgent> occupants = null;
    private String site = null;
    private String name = null;

    public Building(){
        occupants = new ArrayList<IAgent>();
    }

    @Override
    public IBuilding addOccupant(IAgent args){
            occupants.add(args);
        return this;
    };

    @Override
    public List<IAgent> getOccupants(){
        return this.occupants;
    };

    @Override
    public IBuilding setSite(String site){
        this.site = site;
        return this;
    };

    @Override
    public String getSite(){
        return this.site;
    };

    @Override
    public IBuilding setName(String name){
        this.name = name;
        return this;
    };
    @Override
    public String getName(){
        return this.name;
    };
}
