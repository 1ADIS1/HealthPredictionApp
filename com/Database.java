package company.com;

public interface Database {
    String connectionString = null;
    boolean checkAccess();
}
class DatabaseProxy implements Database{
    private Table table;
    public DatabaseProxy(Table table){
        this.table = table;
    }
    @Override
    public boolean checkAccess() {
        return false;
    }
}
class Table{
    private String name;
    public Table(String tableName){
        name = tableName;
    }
    public void update(){}
    public void delete(){}
    public Json select(){
        return null;
    }
    public void add(){}


}
