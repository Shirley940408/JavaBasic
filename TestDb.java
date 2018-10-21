public class TestDb implements StudentSys{
    @Override
    public void add(int id,String name){
        System.out.println("add to mysql");
    }
    @Override
    public void update(int id,String name){
        System.out.println("update to mysql");
    }
    @Override
    public void delete(int id){
        System.out.println("delete to mysql");
    }
    public static void main(String[] args){
        TestDb db=new TestDb();
        db.add(01,"John");
        db.update(02,"Sam");
        db.delete(03);
    }
}