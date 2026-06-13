package Builder.Q3;
import java.util.ArrayList;
import java.util.List;

public class SqlQueryBuilder{
    private String table,condition,order;
    private List<String> columns = new ArrayList<>();

    public SqlQueryBuilder select(String... column){
        for (String col : column) {
            columns.add(col);
        }
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
        for(int i=0; i<columns.size(); i++){
            if(i!=columns.size()-1)
                s +=columns.get(i)+", ";
            else
                s +=columns.get(i)+" ";
        }
        //FROM
        s +="FROM "+table;
        //WHERE
        if(condition!=null)
            s +=" WHERE "+condition;
        //ORDER
        if(order!=null)
            s +=" ORDER BY  "+order;
        
        return s+";";
    }
}
