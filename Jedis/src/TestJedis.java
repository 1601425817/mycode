import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

class TestJedis {

	@Test
	public void TestJedis() {
		Jedis jedis = new Jedis("127.0.0.1",6379);
		jedis.set("1", "2");
		System.out.println(jedis.get("1"));
		jedis.close();
	}
	
	@Test
	public void TestJedisPool()
	{
		JedisPool jedisPool = new JedisPool("127.0.0.1",6379);
		Jedis jedis = jedisPool.getResource();
		jedis.set("pcq", "20");
		System.out.println(jedis.get("pcq"));
		jedis.close();
		jedisPool.close();
	}

}
