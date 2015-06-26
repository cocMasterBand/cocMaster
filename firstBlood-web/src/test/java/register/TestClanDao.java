package register;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cocmaster.firstBlood_base_common.model.Do.Clan;
import com.cocmaster.firstBlood_register_impl.dao.ClanMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/application-config.xml"})
public class TestClanDao {

		@Autowired
		private ClanMapper clanMapper;
		
		@Test
		public void tset(){
			
			Clan clan = clanMapper.selectByPrimaryKey(1);
			System.out.println("clan result:" + clan.toString());
		}
}
