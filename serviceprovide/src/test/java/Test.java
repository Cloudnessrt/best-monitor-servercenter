import com.tomorrow.serviceprovide.Common.Enum.impl.ValidEnum;
import com.tomorrow.serviceprovide.Common.Function.EnumUtil;
import com.tomorrow.serviceprovide.Service.IUserEntityService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

/**
 * 测试
 *
 * @AUTHOR TCH
 * @CREATE 2018-02-14
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {

    @Autowired
    private IUserEntityService iuserEntityService;

    @org.junit.Test
    public void testMethod(){
        System.out.println("测试枚举取key"+ValidEnum.True.getKey());
        System.out.println("测试枚举取text"+ValidEnum.True.getText());
        System.out.println("测试枚举取MAP");
        Map map= EnumUtil.enumToMap(ValidEnum.False);
        System.out.println("测试通过key转枚举");
        boolean b=(ValidEnum.True== EnumUtil.getEnumByKey(1,ValidEnum.class));
        System.out.println("存储");


    }


}
