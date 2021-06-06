import com.dangdang.po.DangdangComment;
import com.dangdang.service.DangDangProductCategoryService;
import com.dangdang.service.DangdangCommentService;
import com.dangdang.serviceImp.DangdangCommentServiceImp;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class Test001 {
    private DangdangCommentService commentService=new DangdangCommentServiceImp();
    @Test
    public void Tetst01(){
        List<DangdangComment> comments=commentService.selectByExample(null);
        for (DangdangComment d:comments){
            System.out.println(d);
        }
    }
}
