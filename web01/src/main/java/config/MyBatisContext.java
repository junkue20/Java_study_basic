package config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import mapper.MemberMapper;




// MyBatisContext.getSqlSession
public class MyBatisContext {

	public static SqlSession getSqlSession() {
		
		try {
			
			// DB접속용 dataSource객체 생성
			BasicDataSource dataSource = new BasicDataSource();
			dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
			dataSource.setUrl("jdbc:oracle:thin:@1.234.5.158:11521:xe");
			dataSource.setUsername("ds209");
			dataSource.setPassword("pw209");
			
			// 자동 COMMIT 설정
			TransactionFactory transactionFactory = new JdbcTransactionFactory();
			Environment environment = new Environment("development", transactionFactory, dataSource);
			Configuration config = new Configuration(environment);
			
			 // 오라클 내의 컬럼명에서 "_" 사용 가능
			config.setMapUnderscoreToCamelCase(true);
			
			// 만든 매퍼 등록
			config.addMapper(MemberMapper.class);

			
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(config);
			return factory.openSession(true); // true면 자동으로 commit 수행
			
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
}
