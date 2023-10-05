package java_remember.Model;

import javax.management.InvalidAttributeValueException;

import java_remember.Abstracts.Worker;

public class WorkerBuilder{
    
    public Worker newWorker(int Type) throws Exception {
        while(true){
            switch (Type) {
                case 0:
                    return new Apprentice();
                case 1:
                    return new Junior();
                case 2:
                    return new Pleno();
                case 3:
                    return new Senior();
                default:
                    throw new InvalidAttributeValueException("invalid type to create");
            }
        }
        
    }
}
