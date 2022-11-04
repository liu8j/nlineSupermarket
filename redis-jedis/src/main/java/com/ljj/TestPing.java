package com.ljj;

import redis.clients.jedis.Jedis;

public class TestPing {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("47.92.7.163",
                6379);
        System.out.println(jedis.ping());
        System.out.println("连接redis成功");
        System.out.println("连接redis成功");
        System.out.println("连接redis成功");
        System.out.println("连接redis非常成功");
        System.out.println("连接redis不成功");
        System.out.println("心态炸了");
    }
}
