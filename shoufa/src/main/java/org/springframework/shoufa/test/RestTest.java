package org.springframework.shoufa.test;

import org.junit.runner.RunWith;
import org.springframework.shoufa.config.ShoufaConfig;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= ShoufaConfig.class)
public class RestTest {
}
