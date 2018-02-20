import com.tomorrow.serviceprovide.Common.Enum.impl.ValidEnum;
import com.tomorrow.serviceprovide.Common.Function.EnumUtil;
import org.junit.runner.RunWith;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;

/**
 * 测试
 *
 * @AUTHOR TCH
 * @CREATE 2018-02-14
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class Test {

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

    @Scheduled(cron="0 0/1 * * * ?") //每分钟执行一次
    public void statusCheck() {
        System.out.println("1");
    }
}
