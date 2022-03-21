import com.luoxiaojiang.util.jdbc.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
    public static void main(String[] args) {
        JdbcTemplate template=new JdbcTemplate(JDBCUtils.getDataSource());
        String sql="update user set RealName=?,School=?,Telephone=?,Type=? where Uid=?";	//定义sql语句
        try{
            int res=template.update(sql,"罗小将","南宁大学","13006968801","学生","oA5KM6Qks-xwyBo45DFKEzwgQkFo");
            if (res>=1){
                System.out.println(res);
            }
            else
            {
                System.out.println(res);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
