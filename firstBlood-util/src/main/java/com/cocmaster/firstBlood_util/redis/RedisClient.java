package com.cocmaster.firstBlood_util.redis;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.Transaction;

/**
 * @author di
 * 
 *         redisclient类 采用jedispool连接池 可以随意添加各种redis方法 记得一定finally里面一定释放连接!
 */
public class RedisClient {

	public static Logger logger = LoggerFactory.getLogger(RedisClient.class);
	public JedisPool jedisPool;

	public JedisPool getJedisPool() {
		return jedisPool;
	}

	public void setJedisPool(JedisPool jedisPool) {
		this.jedisPool = jedisPool;
	}

	/**
	 * 获取String类型key对应的value值
	 */
	public Object getByStringKey(String key) {
		Jedis client = jedisPool.getResource();
		Object o = null;
		try {
			o = client.get(key);
		} finally {
			jedisPool.returnResource(client);// 向连接池“归还”资源
		}
		return o;
	}

	/**
	 * 判断String类型key是否存在
	 */
	public boolean isKeyExist(String key) {
		Jedis client = jedisPool.getResource();
		boolean o = false;
		try {
			o = client.exists(key);
		} finally {
			jedisPool.returnResource(client);// 向连接池“归还”资源
		}
		return o;
	}

	/**
	 * String类型的键值写入redis
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	public boolean setStringKey(String key, String value) {
		Jedis client = jedisPool.getResource();
		String issuccess = "";
		try {
			issuccess = client.set(key, value);
			if ("OK".equals(issuccess)) {
				return true;
			} else {
				return false;
			}
		} finally {
			jedisPool.returnResource(client);// 向连接池“归还”资源
		}
	}

	/**
	 * String类型的键值写入redis,并设置失效时间
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	public boolean setStringExpireKey(String key, String value, int time) {
		if (time == 0) {

		}
		Jedis client = jedisPool.getResource();
		String issuccess = "";
		try {
			issuccess = client.setex(key, time, value);
			if ("OK".equals(issuccess)) {
				return true;
			} else {
				return false;
			}
		} finally {
			jedisPool.returnResource(client);// 向连接池“归还”资源
		}
	}

	/**
	 * list<String>结构的数据写入redis
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	public boolean setListKey(String key, List<String> value) {
		Jedis client = jedisPool.getResource();
		try {
			Transaction tx = client.multi();
			for (String one : value) {
				tx.rpush(key, one);
			}
			tx.exec();
			return true;
		} finally {
			jedisPool.returnResource(client);// 向连接池“归还”资源
		}
	}

	/**
	 * 根据key获取list类型
	 * 
	 * @param key
	 * @return
	 */
	public List<String> getListStringKey(String key) {
		Jedis client = jedisPool.getResource();
		List<String> returnList = null;
		try {
			returnList = client.lrange(key, 0, -1);

		} finally {
			jedisPool.returnResource(client);// 向连接池“归还”资源
		}
		return returnList;
	}

}
