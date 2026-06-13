package Builder.Q3;
import java.util.ArrayList;
import java.util.List;

public class SqlQueryBuilder{
    private String table,condition,order;
    private List<String> columns = new ArrayList<>();

    public SqlQueryBuilder select(String columns1, String columns2){
        columns.add(columns1);
        columns.add(columns2);
        return this;
    }

    public SqlQueryBuilder from(String table){
        this.table = table;
        return this;
    }

    public SqlQueryBuilder where(String condition){
        this.condition = condition;
        return this;
    }

    public SqlQueryBuilder orderBy(String order){
        this.order = order;
        return this;
    }

    public String build(){
        String s;
        //SELECT
        s = "SELECT ";
        for(String i:columns) s+=(i+" ");
        //FROM
        s +="FROM "+table;
        //WHERE
        s +=" WHERE "+condition;
        //ORDER
        s +=" ORDER BY "+order;
        
        return s;
    }
}
