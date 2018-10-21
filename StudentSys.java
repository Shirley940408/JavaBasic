/**
 * database:mysql, oracle
 */
public interface StudentSys{
    //add
    void add(int id, String name);
    //update
    void update(int id, String name);
    //delete
    void delete(int id);
    
    
}