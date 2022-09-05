package com.whackon.medical.base.util;

import com.fasterxml.jackson.databind.json.JsonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * <b>Redis 操作工具类</b>
 * @author Administrator
 * @date 2022/8/24
 */
@Component("redisUtil")
public class RedisUtil {
	@Autowired
	private StringRedisTemplate redisTemplate;

	/**
	 * <b>根据key 将对应的value 存储到 Redis 中</b>
	 * @param key
	 * @param value
	 * @param expireSec
	 * @return
	 * @throws Exception
	 */
	public boolean saveToRedis(String key, Object value, Integer expireSec) throws Exception{
		//由于 StringRedisTemolate 在存储value时，只能时String 类型 因此需要将 Object 转换为 String类型
		//可以将Object对应的对象变为String类型的JSON进行存储
		//想要变为JSON 则需要使用JsonMapper 对象实现
		//创建JsonMapper对象
		JsonMapper jsonMapper = new JsonMapper();
		//通过JsonMapper将Object 类型的value变为JSON格式的String
		String valueJSON = jsonMapper.writeValueAsString(value);
		//将该数据存储到Redis中
		redisTemplate.opsForValue().set(key, valueJSON);
		//判断是否给定了时间
		if(expireSec != null && expireSec > 0) {
			//设置了过期时间 那么进行设置存储到、Redis的时长
			redisTemplate.expire(key,expireSec, TimeUnit.SECONDS);
		}
		return true;
	}

	/**
	 * <b>根据 key 获得Redis 中所村塾的数据</b>
	 * @param key
	 * @param valueType
	 * @return
	 * @throws Exception
	 */
	public Object getFromRedis(String key,Class valueType) throws Exception{
		//根据 key 从 Redis 中获得相应的数据
		String valueJSON = redisTemplate.opsForValue().get(key);
		//判断是否能够获取到相应的数据
		if(valueJSON != null && !"".equals(valueJSON.trim())) {
			//需要将JSON 格式的value 根据所提供的类型 变为相应的对象
			//创建 JsonMaper 对象
			JsonMapper jsonMapper = new JsonMapper();
			//辊距类型将对应的数据变为其对象格式
			return  jsonMapper.readValue(valueJSON,valueType);

		} else {
			//为获取到相应的数据
			return null;
		}
		}

	/**
	 * <b>将对应的数据从 Redis 中删除</b>
 	 * @param key
	 * @return
	 * @throws Exception
	 */
	public boolean deleteFormRedis(String key) throws Exception{
		redisTemplate.delete(key);
		return true;
	}
	}

